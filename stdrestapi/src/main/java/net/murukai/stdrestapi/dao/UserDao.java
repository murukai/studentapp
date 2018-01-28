package net.murukai.stdrestapi.dao;

import java.util.List;

import net.murukai.stdrestapi.dto.Address;
import net.murukai.stdrestapi.dto.Guardian;
import net.murukai.stdrestapi.dto.Student;
import net.murukai.stdrestapi.dto.Teacher;
import net.murukai.stdrestapi.dto.User;

public interface UserDao {
	List<User> list();
	List<User> listActive();
	List<Teacher> listTeachers();
	List<Teacher> listActiveTeachers();
	List<Guardian> listGuardians();
	List<Guardian> listActiveGuardians();
	List<Student> listStudents();
	List<Student> listActiveStudents();
	
	User get(long id);
	Student getStudent(long id);
	Teacher getTeacher(long id);
	Guardian getGuardian(long id);
	
	boolean add(User user);
	boolean addTeacher(Teacher teacher);
	boolean addGuardian(Guardian guardian);
	boolean addStudent(Student student);
	boolean addAddress(Address address);
	
	boolean update(User user);
	boolean updateTeacher(Teacher teacher);
	boolean updateGuardian(Guardian guardian);
	boolean updateStudent(Student student);
	boolean updateAddress(Address address);
	
	boolean delete(User user);
	boolean deleteTeacher(Teacher teacher);
	boolean deleteGuardian(Guardian guardian);
	boolean deleteStudent(Student student);
	boolean deleteAddress(Address address);
	
	List<Student> listByFormId(long studentFormId);
	
	Student listByRegistrationNumber(String registrationNumber);
	User listByPhone(String phone);
	List<Address> getAddresses(long userId);
	Address getAddress(long userId);
	Address getAddressByPhone(String phone);
	Address getAddress(User user);
	
	List<Teacher> listByDepartment(long departmentId);
	Teacher getTeacher(String ecNumber);
	Teacher getByPhoneNumber(String phone);
	User getTeacherByUserName(String username);
	
	Guardian getByPhone(String phone);
	User getGuardianByUsername(String username);
	Student getByRegNumber(String registrationNumber);
	User getStudentByUsername(String username);
	User getUser(String username);
	User getByUsername(String username);
}
