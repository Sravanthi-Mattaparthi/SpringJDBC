package com.dl.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dl.model.Honda;

@Component("hondaDao")
public class HondaImpl implements HondaDao{
	
	//template
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//generate setters and getters
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	//Insert method
	public int insertRecord(Honda honda) {
		String sql = "insert into honda values (?,?,?,?)";
		int insert = jdbcTemplate.update(sql, honda.getId(), honda.getBikeName(), honda.getBikeColor(), honda.getCc());
		
		return insert;
	}
	
	
    //Update method
	public int updateRecord(Honda honda) {
		
		String sql = "update honda set bikeName=?, bikeColor=?, cc=? where id=?";
		int update = jdbcTemplate.update(sql, honda.getBikeName(), honda.getBikeColor(), honda.getCc(), honda.getId());
		return update;
	}

	
	//for select statement Approach 1
	public List<Honda> listVehicles() {
		
		String sql = "Select * from honda";
		List<Honda> honda = jdbcTemplate.query(sql, new HondaRowMapper());
		return  honda;
	}
	
	//Approach 2
	
	/*
	public Honda read(int i){
	String sql = "select * from honda where id=?";
	HondaRowMapper rowMapper = new HondaRowMapper();
	Honda honda = jdbcTemplate.queryForObject(sql,rowMapper,i);
	return honda; 
	 */
	

	
	//delete method
	public int delete(int id) {
		String sql ="delete from honda where id=?";
		int delete = jdbcTemplate.update(sql, id);		
		return delete ;
	}

	
	
	
	


}
