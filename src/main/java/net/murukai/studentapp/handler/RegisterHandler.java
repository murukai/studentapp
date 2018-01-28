package net.murukai.studentapp.handler;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import net.murukai.stdrestapi.dao.UserDao;
import net.murukai.stdrestapi.dto.Address;
import net.murukai.stdrestapi.dto.Guardian;
import net.murukai.stdrestapi.dto.Student;
import net.murukai.stdrestapi.dto.Teacher;
import net.murukai.stdrestapi.dto.User;
import net.murukai.studentapp.model.RegisterModel;
import net.murukai.studentapp.util.UserUtil;

@Component
public class RegisterHandler {

	
	@Autowired 
	private PasswordEncoder passwordEncoder;
	 

	@Autowired
	private UserDao userDao;

	public RegisterModel init() {
		return new RegisterModel();
	}

	public void addUser(RegisterModel registerModel, User user) {
		registerModel.setUser(user);
	}

	public void addBilling(RegisterModel registerModel, Address billing) {
		registerModel.setBilling(billing);
	}

	public String validateUser(User user, MessageContext error) {
		String transitionValue = "success";
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			error.addMessage(new MessageBuilder().error().source("confirmPassword")
					.defaultText("Password does not match confirm password!").build());
			transitionValue = "failure";
		}
		User dUser = null;
		try {
			dUser = userDao.getUser(user.getUsername());
		} catch (Exception e) {

		}

		if (dUser != null) {
			error.addMessage(new MessageBuilder().error().source("email")
					.defaultText("Username address is already taken!").build());
			transitionValue = "failure";
		}

		return transitionValue;

	}

	public String saveAll(RegisterModel registerModel) {
		String transitionValue = "success";
		User user = registerModel.getUser();
		if (user.getRole().equals("USER")) {

		}

		//encode the password
		user.setPassword(passwordEncoder.encode(user.getPassword()));

		// save the user
		if (user.getRole().equalsIgnoreCase("teacher")) {
			Teacher teacher = UserUtil.convertTeacher(user);
			userDao.addTeacher(teacher);
			
			// save the billing address
			Address billing = registerModel.getBilling();
			billing.setUser(teacher);

			userDao.addAddress(billing);
		} else if (user.getRole().equalsIgnoreCase("student")) {
			Student student = UserUtil.convertStudent(user);
			userDao.addStudent(student);
			
			// save the billing address
			Address billing = registerModel.getBilling();
			billing.setUser(student);

			userDao.addAddress(billing);
		} else {
			Guardian guardian = UserUtil.convertGuardian(user);
			userDao.addGuardian(guardian);
			// save the billing address
			Address billing = registerModel.getBilling();
			billing.setUser(guardian);

			userDao.addAddress(billing);
		}
		
		
		return transitionValue;
	}

	public void setStudentRegistrionNumber(Student student) {
		String generatedRegNumber = "STD" + UUID.randomUUID().toString().substring(30).toUpperCase();
		String stdRegNum = "STD2018MF";
		User dStudent = null;
		try {
			dStudent = userDao.getByRegNumber(generatedRegNumber);
		} catch (Exception e) {

		}
		while (dStudent != null) {
			stdRegNum = "STD" + UUID.randomUUID().toString().substring(30).toUpperCase();
			try {
				dStudent = userDao.getByRegNumber(stdRegNum);
			} catch (Exception e) {

			}
		}
		
		student.setRegistrationNumber(stdRegNum);
	}

}
