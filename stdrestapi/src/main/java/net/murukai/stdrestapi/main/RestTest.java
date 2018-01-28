package net.murukai.stdrestapi.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import net.murukai.stdrestapi.dao.DepartmentDao;
import net.murukai.stdrestapi.dao.UserDao;
import net.murukai.stdrestapi.daoimpl.DepartmentDaoImplementation;
import net.murukai.stdrestapi.daoimpl.UserDaoImplementation;
import net.murukai.stdrestapi.dto.Address;
import net.murukai.stdrestapi.dto.Department;
import net.murukai.stdrestapi.dto.Teacher;

public class RestTest {
	private static DepartmentDao departmentDao = new DepartmentDaoImplementation();
	private static UserDao userDao = new UserDaoImplementation();
	/*public static void main(String[] args){
		
		Teacher teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("murukai.mberi@gmail.com");
		teacher.setPassword("popo1990");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("gmurukai@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");
		
		Address address;
		address = new Address();
		address.setLineOne("1416 Muchecheni cl");
		address.setLinetwo("Houghton Park Harare");
		address.setCity("HRE");
		address.setCellPhone("0785583905");
		address.setPhone("0778231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		Department department;
		department = new Department();
		department.setName("Mathematics");
		department.setDescription("Mathematics department");
		department.setNumberOfTeacher(2);
		teacher.setDepartment(department);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date date;
		try {
			date = sdf.parse("08-11-1984");
			System.out.println(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			System.out.println(sqlDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
}
