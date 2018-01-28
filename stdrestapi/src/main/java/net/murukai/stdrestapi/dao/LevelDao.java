package net.murukai.stdrestapi.dao;

import java.util.List;

import net.murukai.stdrestapi.dto.Level;

public interface LevelDao {
	List<Level> list();
	Level get(long id);
	
	boolean add(Level level);
	boolean update(Level level);
	boolean delete(Level level);
}
