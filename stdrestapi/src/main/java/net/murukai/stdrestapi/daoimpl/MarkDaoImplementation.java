package net.murukai.stdrestapi.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.murukai.stdrestapi.dao.MarkDao;
import net.murukai.stdrestapi.dto.Mark;
import net.murukai.stdrestapi.dto.Transcript;


@Repository("markDao")
@Transactional
public class MarkDaoImplementation implements MarkDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Mark> get(long studentId) {
		String sql = "FROM Mark WHERE student = :student";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("studentId", studentId)
				.getResultList();
	}

	
	public Transcript getTranscript(long studentId) {
		String sql = "FROM Transcript WHERE student = :student";
		return (Transcript)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("studentId", studentId)
				.getSingleResult();
		
	}

	public boolean add(Mark mark) {
		try{
			sessionFactory.getCurrentSession().persist(mark);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Mark mark) {
		try{
			sessionFactory.getCurrentSession().update(mark);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean delete(Mark mark) {
		try{
			sessionFactory.getCurrentSession().delete(mark);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean addTranscript(Transcript transcript) {
		try{
			sessionFactory.getCurrentSession().persist(transcript);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateTranscript(Transcript transcript) {
		try{
			sessionFactory.getCurrentSession().update(transcript);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteTranscript(Transcript transcript) {
		try{
			sessionFactory.getCurrentSession().delete(transcript);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
