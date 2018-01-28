package stdrestapi.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.murukai.stdrestapi.dao.DepartmentDao;
import net.murukai.stdrestapi.dao.LevelDao;
import net.murukai.stdrestapi.dao.StudentFormDao;
import net.murukai.stdrestapi.dao.UserDao;
import net.murukai.stdrestapi.dto.Address;
import net.murukai.stdrestapi.dto.Department;
import net.murukai.stdrestapi.dto.Guardian;
import net.murukai.stdrestapi.dto.Level;
import net.murukai.stdrestapi.dto.Student;
import net.murukai.stdrestapi.dto.StudentForm;
import net.murukai.stdrestapi.dto.Teacher;

public class UserTestCase {
	private static AnnotationConfigApplicationContext context;
	private static UserDao userDao;
	private Address address;
	private Address address1;
	private Address address3;
	private Address address4;
	private Address address5;
	private Address address6;
	private Address address7;
	private Address address8;
	private Address address9;
	private Address address10;
	private Address address11;
	private StudentForm studentForm;
	private Student student;
	private Student student1;
	private Student student2;
	private Student student3;
	private Student student4;
	private Student student5;
	private Student student6;
	private Student student7;
	private Student student8;
	private Student student9;
	private Student student10;
	private Level level;
	private Level level2;
	private Level level3;
	private Level level4;
	private Level level5;
	private Level level6;
	private static StudentFormDao studentFormDao;
	private static LevelDao levelDao;
	private static DepartmentDao departmentDao;
	private Teacher teacher;
	private Teacher teacher1;
	private Teacher teacher2;
	private Teacher teacher3;
	private Teacher teacher4;
	private Teacher teacher5;
	private Teacher teacher6;
	private Teacher teacher7;
	private Teacher teacher8;
	private Teacher teacher9;
	private Teacher teacher10;
	private Teacher teacher11;
	private Teacher teacher12;
	private Teacher teacher13;
	private Teacher teacher14;
	private Teacher teacher15;
	private Teacher teacher16;
	private Teacher teacher17;
	private Teacher teacher18;
	private Department department;
	private Department department1;
	private Department department2;
	private Department department3;
	private Department department4;
	private Department department5;
	private Guardian guardian;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.murukai.stdrestapi");
		context.refresh();

		userDao = (UserDao) context.getBean("userDao");
		studentFormDao = (StudentFormDao) context.getBean("studentFormDao");
		levelDao = (LevelDao) context.getBean("levelDao");
		departmentDao = (DepartmentDao) context.getBean("departmentDao");
	}

	/*@Test
	public void testAddStudenForm(){
		studentForm = new StudentForm();
		studentForm.setName("One-One");
		studentForm.setDescription("One one ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(1).getId());
		studentForm.setTeacherId(userDao.getTeacher(1).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("One-Two");
		studentForm.setDescription("One one ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(1).getId());
		studentForm.setTeacherId(userDao.getTeacher(2).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("One-Three");
		studentForm.setDescription("One three ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(1).getId());
		studentForm.setTeacherId(userDao.getTeacher(3).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Two-One");
		studentForm.setDescription("Two one ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(2).getId());
		studentForm.setTeacherId(userDao.getTeacher(4).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Two-Two");
		studentForm.setDescription("Two Two ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(2).getId());
		studentForm.setTeacherId(userDao.getTeacher(5).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Two-Three");
		studentForm.setDescription("Two three ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(2).getId());
		studentForm.setTeacherId(userDao.getTeacher(6).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Three-One");
		studentForm.setDescription("Three one ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(3).getId());
		studentForm.setTeacherId(userDao.getTeacher(7).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Three-Two");
		studentForm.setDescription("Three two ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(3).getId());
		studentForm.setTeacherId(userDao.getTeacher(8).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Three-Three");
		studentForm.setDescription("Three three ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(3).getId());
		studentForm.setTeacherId(userDao.getTeacher(9).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Four-One");
		studentForm.setDescription("Four one ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(4).getId());
		studentForm.setTeacherId(userDao.getTeacher(10).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Four-Two");
		studentForm.setDescription("Four two ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(4).getId());
		studentForm.setTeacherId(userDao.getTeacher(11).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Four-Three");
		studentForm.setDescription("Four three ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(4).getId());
		studentForm.setTeacherId(userDao.getTeacher(12).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
		studentForm = new StudentForm();
		studentForm.setName("Five-Sci");
		studentForm.setDescription("Lower six sciences ");
		studentForm.setCapacity(50);
		studentForm.setLevelId(levelDao.get(5).getId());
		studentForm.setTeacherId(userDao.getTeacher(13).getId());
		
		assertEquals("Failed to add the StudentForm!", true, studentFormDao.add(studentForm));
		
	}*/
	
	/*@Test
	public void testAddStudent() {
		student = new Student();
		student.setFirstname("Sandra");
		student.setLastname("Njagu");
		student.setGender("female");
		student.setBirthDate("19-08-2002");
		student.setUsername("snjagu@yahoo.com");
		student.setPassword("snjagu");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(1);
		

		address = new Address();
		address.setLineOne("3 Musasa Rd");
		address.setLinetwo("Marimba Park");
		address.setCity("HRE");
		address.setCellPhone("0713282245");
		address.setPhone("04-4565473");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		
		student = new Student();
		student.setFirstname("Takunda");
		student.setLastname("Chido");
		student.setGender("male");
		student.setBirthDate("19-02-2004");
		student.setUsername("tchido@yahoo.com");
		student.setPassword("tchido");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(10);
		

		address = new Address();
		address.setLineOne("4852");
		address.setLinetwo("Budiriro 5B, Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0772222555");
		address.setPhone("0772222555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		
		student = new Student();
		student.setFirstname("Memory");
		student.setLastname("Tafara");
		student.setGender("female");
		student.setBirthDate("19-08-2005");
		student.setUsername("mtafara@yahoo.com");
		student.setPassword("mtafara");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(10);
		

		address = new Address();
		address.setLineOne("4852");
		address.setLinetwo("Budiriro 5B, Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0772222555");
		address.setPhone("0772222555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		
		student = new Student();
		student.setFirstname("Lisa");
		student.setLastname("Mananana");
		student.setGender("female");
		student.setBirthDate("19-05-2005");
		student.setUsername("lmanana@yahoo.com");
		student.setPassword("lmanana");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(12);
		

		address = new Address();
		address.setLineOne("4852");
		address.setLinetwo("Budiriro 5B, Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0771242555");
		address.setPhone("0771242555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		
		student = new Student();
		student.setFirstname("Lisa");
		student.setLastname("Mananana");
		student.setGender("female");
		student.setBirthDate("19-05-2005");
		student.setUsername("lmanana@yahoo.com");
		student.setPassword("lmanana");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(12);
		

		address = new Address();
		address.setLineOne("4852");
		address.setLinetwo("Budiriro 5B, Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0771242555");
		address.setPhone("0771242555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		
		student = new Student();
		student.setFirstname("Sean");
		student.setLastname("Chirenje");
		student.setGender("male");
		student.setBirthDate("11-07-2005");
		student.setUsername("schirenje@yahoo.com");
		student.setPassword("schirenje");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(12);
		

		address = new Address();
		address.setLineOne("4752");
		address.setLinetwo("Budiriro 5B, Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0781242555");
		address.setPhone("0781242555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		
		student = new Student();
		student.setFirstname("Munyaradzi");
		student.setLastname("Mahari");
		student.setGender("male");
		student.setBirthDate("10-03-2004");
		student.setUsername("mmahari@yahoo.com");
		student.setPassword("mmahari");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(12);
		

		address = new Address();
		address.setLineOne("4831");
		address.setLinetwo("Budiriro 5A, Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0772232545");
		address.setPhone("0771242555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		student = new Student();
		student.setFirstname("Tatenda");
		student.setLastname("Shumba");
		student.setGender("female");
		student.setBirthDate("09-08-2003");
		student.setUsername("tshumba@yahoo.com");
		student.setPassword("tshumba");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(13);
		

		address = new Address();
		address.setLineOne("4842");
		address.setLinetwo("Glenview 1");
		address.setCity("HRE");
		address.setCellPhone("0771242555");
		address.setPhone("0771242555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		
		student = new Student();
		student.setFirstname("Andrew");
		student.setLastname("James");
		student.setGender("male");
		student.setBirthDate("19-05-2005");
		student.setUsername("ajames@yahoo.com");
		student.setPassword("ajames");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(13);
		

		address = new Address();
		address.setLineOne("14 Ayr Rd");
		address.setLinetwo("Queen's Park East");
		address.setCity("BYO");
		address.setCellPhone("0771242555");
		address.setPhone("0771242555");
		address.setProvince("Bulawayo");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		student = new Student();
		student.setFirstname("Takunda");
		student.setLastname("Reed");
		student.setGender("male");
		student.setBirthDate("19-05-2005");
		student.setUsername("treed@yahoo.com");
		student.setPassword("treed");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(12);
		

		address = new Address();
		address.setLineOne("4252");
		address.setLinetwo("Budiriro 5A, Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0771242555");
		address.setPhone("0771242555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		student = new Student();
		student.setFirstname("Portia");
		student.setLastname("Tsokota");
		student.setGender("female");
		student.setBirthDate("19-05-2005");
		student.setUsername("tsokotaportia@gmail.com");
		student.setPassword("madyira2017");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(12);
		

		address = new Address();
		address.setLineOne("253 Bubye Cl");
		address.setLinetwo("Marimba Park");
		address.setCity("HRE");
		address.setCellPhone("0775378644");
		address.setPhone("0775378644");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		
		student = new Student();
		student.setFirstname("Murukai");
		student.setLastname("Mberi");
		student.setGender("Male");
		student.setBirthDate("19-05-2005");
		student.setUsername("gmurukai@yahoo.com");
		student.setPassword("popo1990");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(12);
		

		address = new Address();
		address.setLineOne("1416 Muchecheni Cl");
		address.setLinetwo("Houghton Park");
		address.setCity("HRE");
		address.setCellPhone("0785583905");
		address.setPhone("0778231641");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		student = new Student();
		student.setFirstname("Timothy");
		student.setLastname("Johannes");
		student.setGender("female");
		student.setBirthDate("19-05-2005");
		student.setUsername("tj@yahoo.com");
		student.setPassword("tj");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(12);
		

		address = new Address();
		address.setLineOne("3852");
		address.setLinetwo("Budiriro 5, Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0771242555");
		address.setPhone("0771242555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		student = new Student();
		student.setFirstname("Melisah");
		student.setLastname("Musa");
		student.setGender("female");
		student.setBirthDate("19-05-2005");
		student.setUsername("mmusa@yahoo.com");
		student.setPassword("mmusa");
		student.setRole("STUDENT");
		
	
		
		studentForm = studentFormDao.get(12);
		

		address = new Address();
		address.setLineOne("4812");
		address.setLinetwo("Budiriro 5, Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0781242535");
		address.setPhone("0771242555");
		address.setProvince("Harare Metro");
		address.setUser(student);

		student.setStudentFormId(studentForm.getId());

		assertEquals("Failed to add the user!", true, userDao.addStudent(student));
		// add the address
		assertEquals("Failed to add the billing address!", true, userDao.addAddress(address));
		
		
		
		
	}*/
	
	/*@Test
	public void testGetStudents(){
		assertEquals("Something went wrong fetching students!", true, userDao.listActiveStudents().size() > 0);
	}
	
	@Test
	public void testGetStudentsByForm(){
		studentForm = studentFormDao.get(2);
		assertEquals("Something went wrong fetching students!", true, userDao.listStudentsByForm(studentForm).size() > 0);
	}
	
	@Test
	public void testUpdateStudent(){
		student = userDao.getStudent(7);
		address = userDao.getAddress(student);
		address.setPhone("0776222444");
		assertEquals("Failed to add the billing address!", true, userDao.updateAddress(address));
	}
	
	@Test
	public void testGetStudentByPhone(){
		
		assertEquals("Something went wrong fetching students!", true, userDao.listByPhone("0777222444").getFirstname().equals("samantha"));
	}
	
	@Test
	public void testGetStudent(){
		assertEquals("Something went wrong fetching student!", true, userDao.getStudent(3).getFirstname().equals("samantha"));
	}
*/
	/*@Test
	public void testAddTeacher(){
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");
		department = departmentDao.get(1);
		
		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(1);
		teacher.setDepartmentId(department.getId());
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher2 = new Teacher();
		teacher2.setFirstname("Annah");
		teacher2.setLastname("Frankson");
		teacher2.setGender("female");
		teacher2.setBirthDate("24-12-1981");
		teacher2.setUsername("afrankson@gmail.com");
		teacher2.setPassword("afrankson");
		teacher2.setRole("TEACHER");
		
		teacher2.setEmail("afrankson@hotmail.com");
		teacher2.setDateEnrolled("01-01-1999");
		teacher2.setEcnumber("0193717J");
		teacher2.setMaritalStatus("single");

		address = new Address();
		address.setLineOne("5 Boulie cl");
		address.setLinetwo("Parktown Waterfalls");
		address.setCity("HRE");
		address.setCellPhone("0774583925");
		address.setPhone("0718231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher2);
		
		department = departmentDao.get(1);
		teacher2.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher2));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(1);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(1);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(2);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(2);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(2);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(3);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(3);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(3);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(4);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(4);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(4);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0923717T");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(5);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("john");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("jsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(5);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("angeline");
		teacher.setLastname("masuka");
		teacher.setGender("female");
		teacher.setBirthDate("11-12-1979");
		teacher.setUsername("amasuka@gmail.com");
		teacher.setPassword("amasuka");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("amasuka@hotmail.com");
		teacher.setDateEnrolled("15-11-2002");
		teacher.setEcnumber("0137517P");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("213 Casings rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(5);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("johnson");
		teacher.setLastname("smith");
		teacher.setGender("Male");
		teacher.setBirthDate("24-02-1969");
		teacher.setUsername("jsonsmith@gmail.com");
		teacher.setPassword("jsmith");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsonsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0197617J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudyamhembwe rd");
		address.setLinetwo("mufakose");
		address.setCity("HRE");
		address.setCellPhone("0715583905");
		address.setPhone("0788231642");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(6);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("Amanda");
		teacher.setLastname("James");
		teacher.setGender("female");
		teacher.setBirthDate("04-11-1979");
		teacher.setUsername("ajames@gmail.com");
		teacher.setPassword("ajames");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("1197717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("231 Taura rd");
		address.setLinetwo("Genview 1");
		address.setCity("HRE");
		address.setCellPhone("0775363907");
		address.setPhone("0782931541");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(6);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
		teacher = new Teacher();
		teacher.setFirstname("tafara");
		teacher.setLastname("Dube");
		teacher.setGender("Male");
		teacher.setBirthDate("24-12-1989");
		teacher.setUsername("tdube@gmail.com");
		teacher.setPassword("tdube");
		teacher.setRole("TEACHER");
		
		teacher.setEmail("jsmith@hotmail.com");
		teacher.setDateEnrolled("05-05-2012");
		teacher.setEcnumber("0137717J");
		teacher.setMaritalStatus("married");

		address = new Address();
		address.setLineOne("23 Mudya rd");
		address.setLinetwo("Budiriro");
		address.setCity("HRE");
		address.setCellPhone("0775583905");
		address.setPhone("0788231641");
		address.setProvince("Harare Metro");
		address.setUser(teacher);
		
		department = departmentDao.get(6);
		teacher.setDepartmentId(department.getId());
		
		assertEquals("Something went wrong adding a teacher!", true, userDao.add(teacher));
		assertEquals("Something went wrong adding a teacher!", true, userDao.addAddress(address));
		
	}*/
	
	@Test
	public void testUpdateTeacher(){
		teacher = userDao.getTeacher(7);
		teacher.setIdNumber("63-123456L77");
		assertEquals("Something went wrong adding a teacher!", true, userDao.updateTeacher(teacher));
	}
	
	/*@Test
	public void testUpdateTeacher(){
		teacher = userDao.getTeacher(10);
		teacher.setEcnumber("0177654F");
		teacher.setFirstname("Murukai");
		teacher.setLastname("Gumbo-Mberi");
		teacher.setBirthDate("08-11-1984");
		assertEquals("Something went wrong adding a teacher!", true, userDao.update(teacher));
		assertEquals("Something went wrong deleting a teacher!", true, userDao.delete(teacher));
	}*/
	
	/*@Test
	public void testAddGuardian(){
		guardian = new Guardian();
		guardian.setFirstname("faith");
		guardian.setLastname("shumba");
		guardian.setGender("female");
		guardian.setBirthDate("21-11-1973");
		guardian.setUsername("fshumba@gmail.com");
		guardian.setPassword("faithshumba");
		guardian.setRole("GUARDIAN");
		guardian.setEmail("fshumba@gmail.com");
		guardian.setEmployed(true);
		guardian.setMaritalStatus("married");
		student = userDao.getStudent(20);
		guardian.setStudentFormId(student.getStudentFormId());
		assertEquals("Something went wrong adding a teacher!", true, userDao.addGuardian(guardian));
		
		guardian = new Guardian();
		guardian.setFirstname("faith");
		guardian.setLastname("njagu");
		guardian.setGender("female");
		guardian.setBirthDate("21-11-1973");
		guardian.setUsername("fnjagu@gmail.com");
		guardian.setPassword("faithnjagu");
		guardian.setRole("GUARDIAN");
		guardian.setEmail("fnjagu@gmail.com");
		guardian.setEmployed(true);
		guardian.setMaritalStatus("married");
		student = userDao.getStudent(21);
		guardian.setStudentFormId(student.getStudentFormId());
		assertEquals("Something went wrong adding a teacher!", true, userDao.addGuardian(guardian));
	}*/
	
	/*@Test
	public void testUpdateGuardian(){
		guardian = userDao.getGuardian(17);
		guardian.setBirthDate("05-07-1966");
		guardian.setActive(true);
		assertEquals("Something went wrong adding a teacher!", true, userDao.update(guardian));
		//assertEquals("Something went wrong adding a teacher!", true, userDao.delete(guardian));
	}*/
	
	/*@Test
	public void testAddLevel(){
	
		level = new Level();
		level.setName("One");
		level.setDescription("The First level");
		
		level6 = new Level();
		level6.setName("Two");
		level6.setDescription("The Second level");
		
		level5 = new Level();
		level5.setName("Three");
		level5.setDescription("The Third level");
		
		level2 = new Level();
		level2.setName("Four");
		level2.setDescription("The fourth level");
		
		level3 = new Level();
		level3.setName("Five");
		level3.setDescription("The Fifth level");
		
		level4 = new Level();
		level4.setName("Six");
		level4.setDescription("The Sixth level");
		
		assertEquals("Something went wrong adding a level!", true, levelDao.add(level));
		assertEquals("Something went wrong adding a level!", true, levelDao.add(level6));
		assertEquals("Something went wrong adding a level!", true, levelDao.add(level5));
		assertEquals("Something went wrong adding a level!", true, levelDao.add(level2));
		assertEquals("Something went wrong adding a level!", true, levelDao.add(level3));
		assertEquals("Something went wrong adding a level!", true, levelDao.add(level4));
	}*/
	
	/*@Test
	public void testAddDepartment(){
		department = new Department();
		department.setName("Mathematics");
		department.setDescription("Mathematics department");
		department.setNumberOfTeacher(10);
		
		department2 = new Department();
		department2.setName("Shona");
		department2.setDescription("Shona department");
		department2.setNumberOfTeacher(10);
		
		department3 = new Department();
		department3.setName("Geography");
		department3.setDescription("Geography department");
		department3.setNumberOfTeacher(10);
		
		department4 = new Department();
		department4.setName("Commercials");
		department4.setDescription("Commercials department");
		department4.setNumberOfTeacher(10);
		
		department5 = new Department();
		department5.setName("Science and Agriculture");
		department5.setDescription("Science and Agriculture department");
		department5.setNumberOfTeacher(10);
		
		department1 = new Department();
		department1.setName("Technicals");
		department1.setDescription("Technicals department");
		department1.setNumberOfTeacher(10);
		
		assertEquals("Something went wrong adding department!",true,departmentDao.add(department));
		assertEquals("Something went wrong adding department!",true,departmentDao.add(department1));
		assertEquals("Something went wrong adding department!",true,departmentDao.add(department2));
		assertEquals("Something went wrong adding department!",true,departmentDao.add(department3));
		assertEquals("Something went wrong adding department!",true,departmentDao.add(department4));
		assertEquals("Something went wrong adding department!",true,departmentDao.add(department5));
	}*/
	
	@Test
	public void testGetUser(){
		assertEquals("Couldnt get user!", true, userDao.getUser("amaturure").getFirstname().equalsIgnoreCase("albert"));
	}
}
