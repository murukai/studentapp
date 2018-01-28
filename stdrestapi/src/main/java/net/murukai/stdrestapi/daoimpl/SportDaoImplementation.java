package net.murukai.stdrestapi.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.murukai.stdrestapi.dao.SportDao;
import net.murukai.stdrestapi.dto.SportCategory;
import net.murukai.stdrestapi.dto.SportEvent;


@Repository("sportDao")
@Transactional
public class SportDaoImplementation implements SportDao {
	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<SportEvent> listFuture() {
		java.util.Date today = new java.util.Date();
		java.sql.Date eventTime = new java.sql.Date(today.getTime());
		String sql = "FROM SportEvent WHERE eventTime >= :eventTime";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("eventTime", eventTime)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<SportEvent> listByCategory(long sportCategoryId) {
		String sql = "FROM SportEvent WHERE sportCategory = :sportCategory";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("sportCategoryId", sportCategoryId)
				.getResultList();
	}

	public boolean addSportEvent(SportEvent sportEvent) {
		try{
			sessionFactory.getCurrentSession().persist(sportEvent);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateSportEvent(SportEvent sportEvent) {
		try{
			sessionFactory.getCurrentSession().update(sportEvent);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteSportEvent(SportEvent sportEvent) {
		try{
			sessionFactory.getCurrentSession().delete(sportEvent);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public List<SportCategory> listCategory() {
		String sql = "FROM SportCategory";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	public boolean addSportCategory(SportCategory sportCategory) {
		try{
			sessionFactory.getCurrentSession().persist(sportCategory);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateSportCategory(SportCategory sportCategory) {
		try{
			sessionFactory.getCurrentSession().update(sportCategory);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteSportCategory(SportCategory sportCategory) {
		try{
			sessionFactory.getCurrentSession().delete(sportCategory);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public SportEvent get(long id) {
		String sql = "FROM SportEvent WHERE id =:id";
		return (SportEvent)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", id)
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SportEvent> listByDate(String eventTime) {
		String sql = "FROM SportEvent WHERE eventTime = :eventTime";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("eventTime", eventTime)
				.getResultList();
	}

	@Override
	public SportCategory getCategory(long id) {
		String sql = "FROM SportCategory WHERE id =:id";
		return (SportCategory)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", id)
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SportEvent> listPast() {
		java.util.Date today = new java.util.Date();
		java.sql.Date eventTime = new java.sql.Date(today.getTime());
		String sql = "FROM SportEvent WHERE eventTime < :eventTime";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("eventTime", eventTime)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SportEvent> listFutureByCategory(long sportCategoryId) {
		java.util.Date today = new java.util.Date();
		java.sql.Date eventTime = new java.sql.Date(today.getTime());
		String sql = "FROM SportEvent WHERE category =:sportCategory AND eventTime >= :eventTime";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("eventTime", eventTime)
				.setParameter("sportCategoryId", sportCategoryId)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SportEvent> listPastByCategory(long sportCategoryId) {
		java.util.Date today = new java.util.Date();
		java.sql.Date eventTime = new java.sql.Date(today.getTime());
		String sql = "FROM SportEvent WHERE sportCategoryId =:sportCategoryId AND eventTime <:eventTime";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("eventTime", eventTime)
				.setParameter("sportCategoryId", sportCategoryId)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SportEvent> listAll() {
		// TODO Auto-generated method stub
		String sql = "FROM SportEvent";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

}
