package com.sujata.persistence;



import javax.persistence.EntityNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.bean.Employee;

@Repository
@Transactional
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	@Modifying
	@Query("Update Employee set salary=:sal where eId=:id")
	public void updateSalaryById(@Param("id") int id,@Param("sal") int salary);
	
	

	
}
