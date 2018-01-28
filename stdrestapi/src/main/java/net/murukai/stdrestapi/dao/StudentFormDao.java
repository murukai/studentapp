package net.murukai.stdrestapi.dao;

import java.util.List;

import net.murukai.stdrestapi.dto.StudentForm;
import net.murukai.stdrestapi.dto.Teacher;

public interface StudentFormDao {
	List<StudentForm> list();
	StudentForm get(long id);
	StudentForm getByTeacher(Teacher teacher);
	List<StudentForm> listByLevel(long levelId);
	boolean add(StudentForm studentForm);
	boolean update(StudentForm studentForm);
	boolean delete(StudentForm studentForm);
	
	int getCapacity(int studentFormId);
	
}
