package net.murukai.stdrestapi.dao;

import java.util.List;

import net.murukai.stdrestapi.dto.Mark;
import net.murukai.stdrestapi.dto.Transcript;


public interface MarkDao {
	List<Mark> get(long studentId);
	Transcript getTranscript(long studentId);
	
	boolean add(Mark mark);
	boolean update(Mark mark);
	boolean delete(Mark mark);
	
	boolean addTranscript(Transcript transcript);
	boolean updateTranscript(Transcript transcript);
	boolean deleteTranscript(Transcript transcript);
}
