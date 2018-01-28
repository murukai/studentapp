package net.murukai.stdrestapi.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.murukai.stdrestapi.dao.AccountDao;
import net.murukai.stdrestapi.dto.Account;
import net.murukai.stdrestapi.dto.Fee;
import net.murukai.stdrestapi.dto.FeeType;

@Repository("accountDao")
@Transactional
public class AccountDaoImplementation implements AccountDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Account get(long studentId) {
		String sql = "FROM Account WHERE studentId = : studentId";
		return (Account)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("studentId", studentId)
				.getSingleResult();
	}

	public boolean update(Account account) {
		try{
			sessionFactory.getCurrentSession().update(account);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean add(Account account) {
		try{
			sessionFactory.getCurrentSession().persist(account);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Account account) {
		account.setActive(false);
		try{
			sessionFactory.getCurrentSession().update(account);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public double payFee(long studentId, Fee fee) {
		Account account = get(studentId);
		double amount = account.getBalance();
		amount = amount - fee.getAmount();
		account.setBalance(amount);
		account.setLastUpdated(fee.getDatePaid());
		try{
			sessionFactory.getCurrentSession().update(account);
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public FeeType getFeeType(int id) {
		String sql = "FROM FeeType WHERE id =:id";
		return (FeeType)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", id)
				.getSingleResult();
	}

	@Override
	public boolean addFeeType(FeeType feeType) {
		try{
			sessionFactory.getCurrentSession().persist(feeType);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}

	@Override
	public boolean updateFeeType(FeeType feeType) {
		try{
			sessionFactory.getCurrentSession().update(feeType);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}

	@Override
	public boolean deleteFeeType(FeeType feeType) {
		try{
			feeType.setActive(false);
			sessionFactory.getCurrentSession().persist(feeType);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}

}
