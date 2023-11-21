package com.dl.Dao;

import java.util.List;

import com.dl.model.Honda; //import the class in other package



public interface HondaDao {
	
	public int insertRecord(Honda honda);
	
	public int updateRecord(Honda honda);
	
	public List<Honda> listVehicles();
	//Honda read(int i); for select statement
	
	public int delete(int i);
	

}
