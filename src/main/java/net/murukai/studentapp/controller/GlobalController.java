package net.murukai.studentapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import net.murukai.stdrestapi.dao.UserDao;
import net.murukai.stdrestapi.dto.Account;
import net.murukai.stdrestapi.dto.User;
import net.murukai.studentapp.model.Profile;
import net.murukai.studentapp.model.UserModel;



@ControllerAdvice
public class GlobalController {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private HttpSession session;
	
	private UserModel userModel = null;
	private User user = null;	
	private Account account;
	private Profile profile;
	@ModelAttribute("userModel")
	public UserModel getUserModel() {		
		if(session.getAttribute("userModel")==null) {
			// get the authentication object
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			
			if(!authentication.getPrincipal().equals("anonymousUser")){
				// get the user from the database
				user = userDao.getUser(authentication.getName());
				
				if(user!=null) {
					// create a new model
					userModel = new UserModel();
					// set the name and the id
					userModel.setId(user.getId());
					userModel.setFullname(user.getFirstname() + " " + user.getLastname());
					userModel.setRole(user.getRole());
					userModel.setUser(user);
					
					if(user.getRole().equalsIgnoreCase("teacher")){
						profile = new Profile();
					}else if(user.getRole().equalsIgnoreCase("guardian")){
						profile = new Profile();
					}else{
						
						profile = new Profile();
					}
					
					session.setAttribute("userModel", userModel);
					return userModel;
				}			
			}
		}
		
		
		return (UserModel) session.getAttribute("userModel");		
	}
	
}
