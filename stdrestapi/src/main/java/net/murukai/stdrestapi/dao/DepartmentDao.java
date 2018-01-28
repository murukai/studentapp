package net.murukai.stdrestapi.dao;

import java.util.List;

import net.murukai.stdrestapi.dto.Department;

public interface DepartmentDao {
	List<Department> list();
	Department get(long id);
	boolean add(Department department);
	boolean update(Department department);
	boolean delete(Department department);
	int numberOfTeachers(int departmentId);
}
