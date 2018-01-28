package net.murukai.stdrestapi.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.murukai.stdrestapi.dao.UserDao;
import net.murukai.stdrestapi.dto.Address;
import net.murukai.stdrestapi.dto.Department;
import net.murukai.stdrestapi.dto.Guardian;
import net.murukai.stdrestapi.dto.Student;
import net.murukai.stdrestapi.dto.Teacher;
import net.murukai.stdrestapi.dto.User;

@Repository("userDao")
@Transactional
public class UserDaoImplementation implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<User> list() {
		String sql = "FROM User";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Teacher> listTeachers() {
		String sql = "FROM Teacher";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Guardian> listGuardians() {
		String sql = "FROM Guardian";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Student> listStudents() {
		String sql = "FROM Student";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	public User get(long id) {
		String sql = "FROM User WHERE id = :id";
		return (User)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", Long.valueOf(id))
				.getSingleResult();
	}

	public Student getStudent(long id) {
		String sql = "FROM Student WHERE id =:id";
		return (Student)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", Long.valueOf(id))
				.getSingleResult();
	}

	public Teacher getTeacher(long id) {
		String sql = "FROM Teacher WHERE id =:id";
		return (Teacher)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", Long.valueOf(id))
				.getSingleResult();
	}

	public Guardian getGuardian(long id) {
		String sql = "FROM Guardian WHERE id = :id";
		return (Guardian)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", Long.valueOf(id))
				.getSingleResult();
	}

	public boolean add(User user) {
		try{
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean addTeacher(Teacher teacher) {
		try{
			sessionFactory.getCurrentSession().persist(teacher);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean addGuardian(Guardian guardian) {
		try{
			sessionFactory.getCurrentSession().persist(guardian);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean addStudent(Student student) {
		try{
			sessionFactory.getCurrentSession().persist(student);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(User user) {
		try{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateTeacher(Teacher teacher) {
		try{
			sessionFactory.getCurrentSession().update(teacher);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateGuardian(Guardian guardian) {
		try{
			sessionFactory.getCurrentSession().update(guardian);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateStudent(Student student) {
		try{
			sessionFactory.getCurrentSession().update(student);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(User user) {
		try{
			user.setActive(false);
			sessionFactory.getCurrentSession().update(user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteTeacher(Teacher teacher) {
		try{
			teacher.setActive(false);
			sessionFactory.getCurrentSession().update(teacher);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteGuardian(Guardian guardian) {
		try{
			guardian.setActive(false);
			sessionFactory.getCurrentSession().update(guardian);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteStudent(Student student) {
		try{
			student.setActive(false);
			sessionFactory.getCurrentSession().update(student);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public Student listByRegistrationNumber(String registrationNumber) {
		String sql = "FROM Student WHERE active = :active AND registrationNumber = :registrationNumber";
		
		return (Student)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.setParameter("registrationNumber", registrationNumber)
				.getSingleResult();
	}

	
	@SuppressWarnings("unchecked")
	public List<Teacher> listByDepartment(Department department) {
		String sql = "FROM Teacher WHERE active = :active AND department = :department";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.setParameter("department", department)
				.getResultList();
	}

	public Teacher getTeacher(String ecNumber) {
		String sql = "FROM Teacher WHERE active = :active AND ecNumber = :ecNumber";
		return (Teacher)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.setParameter("ecNumber", ecNumber)
				.getSingleResult();
	}

	public Teacher getByPhoneNumber(String phone) {
		String sql = "FROM Teacher WHERE active = :active AND phone = :phone";
		return (Teacher)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.setParameter("phone", phone)
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public List<User> listActive() {
		String sql = "FROM User WHERE active = :active";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Teacher> listActiveTeachers() {
		String sql = "FROM Teacher WHERE active = :active";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Guardian> listActiveGuardians() {
		String sql = "FROM Guardian WHERE active = :active";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Student> listActiveStudents() {
		String sql = "FROM Student WHERE active = :active";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.getResultList();
	}

	@Override
	public boolean addAddress(Address address) {
		try{
			sessionFactory.getCurrentSession().persist(address);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateAddress(Address address) {
		try{
			sessionFactory.getCurrentSession().update(address);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteAddress(Address address) {
		try{
			sessionFactory.getCurrentSession().delete(address);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getAddresses(long userId) {
		String sql = "FROM Address WHERE userId = :userId";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("userId", userId)
				.getResultList();
	}

	@Override
	public Address getAddress(long userId) {
		String sql = "FROM Address WHERE userId = :userId";
		return (Address)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("userId", userId)
				.getSingleResult();
	}

	@Override
	public Address getAddressByPhone(String phone) {
		String sql = "FROM Address WHERE phone =:phone";
		
		return (Address)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("phone", phone)
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> listByFormId(long studentFormId) {
		String sql = "FROM Student WHERE studentFormId =:studentFormId";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("studentFormId", studentFormId)
				.getResultList();
	}

	@Override
	public User listByPhone(String phone) {
		String sql = "FROM User WHERE phone =:phone";
		
		return (User)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("phone", phone)
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Teacher> listByDepartment(long departmentId) {
		String sql = "FROM Teacher WHERE departmentId =:departmentId";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("departmentId", departmentId)
				.getResultList();
	}

	@Override
	public User getTeacherByUserName(String username) {
		String sql = "FROM Teacher WHERE username =:username";
		return (User)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("username", username)
				.getSingleResult();
	}

	@Override
	public Guardian getByPhone(String phone) {
		String sql = "FROM Guardian WHERE phone =:phone";
		return (Guardian)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("phone", phone)
				.getSingleResult();
	}

	@Override
	public User getGuardianByUsername(String username) {
		String sql = "FROM Guardian WHERE username =:username";
		return (Guardian)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("username", username)
				.getSingleResult();
	}

	@Override
	public Student getByRegNumber(String registrationNumber) {
		String sql = "FROM Student WHERE registrationNumber =:registrationNumber";
		return (Student)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("registrationNumber", registrationNumber)
				.getSingleResult();
	}

	@Override
	public User getStudentByUsername(String username) {
		String sql = "FROM Student WHERE username =:username";
		return (Student)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("username", username)
				.getSingleResult();
	}

	@Override
	public User getUser(String username) {
		String sql = "FROM User where username=:username";
		return (User)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("username", username)
				.getSingleResult();
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddress(User user) {
		String sql = "FROM Address WHERE user =:user";
		return (Address)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("user", user)
				.getSingleResult();
	}

	

}
