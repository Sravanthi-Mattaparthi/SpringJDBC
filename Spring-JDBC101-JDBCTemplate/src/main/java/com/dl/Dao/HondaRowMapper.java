package com.dl.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dl.model.Honda;

public class HondaRowMapper implements RowMapper<Honda> {

	public Honda mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Honda honda = new Honda();
		honda.setId(rs.getInt(1));
		honda.setBikeName(rs.getString(2));
		honda.setBikeColor(rs.getString(3));
		honda.setCc(rs.getDouble(4));
		
		return honda;
	}



}
