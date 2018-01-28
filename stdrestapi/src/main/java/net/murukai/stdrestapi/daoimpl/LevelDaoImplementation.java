package net.murukai.stdrestapi.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.murukai.stdrestapi.dao.LevelDao;
import net.murukai.stdrestapi.dto.Level;

@Repository("levelDao")
@Transactional
public class LevelDaoImplementation implements LevelDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Level> list() {
		String sql = "FROM Level";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	public Level get(long id) {
		String sql = "FROM Level WHERE id =:id";
		return (Level)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", id)
				.getSingleResult();
	}

	public boolean add(Level level) {
		try{
			sessionFactory.getCurrentSession().persist(level);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Level level) {
		try{
			sessionFactory.getCurrentSession().update(level);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Level level) {
		try{
			sessionFactory.getCurrentSession().delete(level);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
