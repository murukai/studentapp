package net.murukai.stdrestapi.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.murukai.stdrestapi.dao.StudentFormDao;
import net.murukai.stdrestapi.dto.StudentForm;
import net.murukai.stdrestapi.dto.Teacher;

@Repository("studentFormDao")
@Transactional
public class StudentFormDaoImplementation implements StudentFormDao {

	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<StudentForm> list() {
		String sql = "FROM StudentForm";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	public StudentForm get(long id) {
		String sql = "FROM StudentForm WHERE id =:id";
		return (StudentForm)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", id)
				.getSingleResult();
	}

	public boolean add(StudentForm studentForm) {
		try{
			sessionFactory.getCurrentSession().persist(studentForm);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(StudentForm studentForm) {
		try{
			sessionFactory.getCurrentSession().update(studentForm);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(StudentForm studentForm) {
		try{
			sessionFactory.getCurrentSession().delete(studentForm);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public int getCapacity(int studentFormId) {
		StudentForm studentForm = get(studentFormId);
		
		return studentForm.getCapacity();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentForm> listByLevel(long levelId) {
		String sql = "FROM StudentForm WHERE levelId = :levelId";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("levelId", levelId)
				.getResultList();
	}

	@Override
	public StudentForm getByTeacher(Teacher teacher) {
		String sql = "FROM StudentForm WHERE teacher = :teacher";
		return (StudentForm)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("teacher", teacher)
				.getSingleResult();
	}

}
