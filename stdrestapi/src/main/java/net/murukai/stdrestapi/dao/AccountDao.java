package net.murukai.stdrestapi.dao;

import net.murukai.stdrestapi.dto.Account;
import net.murukai.stdrestapi.dto.Fee;
import net.murukai.stdrestapi.dto.FeeType;

public interface AccountDao {
	Account get(long studentId);
	boolean update(Account account);
	boolean add(Account account);
	boolean delete(Account account);
	
	double payFee(long studentId, Fee fee);
	
	FeeType getFeeType(int id);
	boolean addFeeType(FeeType feeType);
	boolean updateFeeType(FeeType feeType);
	boolean deleteFeeType(FeeType feeType);
}
