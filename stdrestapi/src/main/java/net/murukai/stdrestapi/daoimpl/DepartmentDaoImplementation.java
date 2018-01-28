package net.murukai.stdrestapi.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.murukai.stdrestapi.dao.DepartmentDao;
import net.murukai.stdrestapi.dto.Department;

@Repository("departmentDao")
@Transactional
public class DepartmentDaoImplementation implements DepartmentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Department> list() {
		String sql = "FROM Department";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	@Override
	public Department get(long id) {
		String sql = "FROM Department WHERE id =:id";
		return (Department)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", id)
				.getSingleResult();
	}

	@Override
	public boolean add(Department department) {
		try{
			sessionFactory.getCurrentSession().persist(department);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean update(Department department) {
		try{
			sessionFactory.getCurrentSession().update(department);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Department department) {
		try{
			sessionFactory.getCurrentSession().delete(department);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public int numberOfTeachers(int departmentId) {
		String sql = "FROM Department WHERE department = :department";
		Department dpt = (Department)sessionFactory.getCurrentSession().createQuery(sql).setParameter("id", departmentId).getSingleResult();
		return dpt.getNumberOfTeacher();
	}

}
