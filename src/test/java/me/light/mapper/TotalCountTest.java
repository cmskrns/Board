package me.light.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.light.config.Apptest;
import me.light.model.Criteria;

public class TotalCountTest extends Apptest{

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void Test() {
//		assertEquals(412, mapper.totalCount());
	}
}
