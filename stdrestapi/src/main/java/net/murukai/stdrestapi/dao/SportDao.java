package net.murukai.stdrestapi.dao;

import java.util.List;

import net.murukai.stdrestapi.dto.SportCategory;
import net.murukai.stdrestapi.dto.SportEvent;



public interface SportDao {
	List<SportEvent> listAll();
	List<SportEvent> listFuture();
	List<SportEvent> listFutureByCategory(long sportCategoryId);
	List<SportEvent> listPastByCategory(long sportCategoryId);
	List<SportEvent> listPast();
	List<SportEvent> listByCategory(long sportCategoryId);
	SportEvent get(long id);
	List<SportEvent> listByDate(String eventTime);
	boolean addSportEvent(SportEvent sportEvent);
	boolean updateSportEvent(SportEvent sportEvent);
	boolean deleteSportEvent(SportEvent sportEvent);
	
	List<SportCategory> listCategory();
	SportCategory getCategory(long id);
	boolean addSportCategory(SportCategory sportCategory);
	boolean updateSportCategory(SportCategory sportCategory);
	boolean deleteSportCategory(SportCategory sportCategory);
}
