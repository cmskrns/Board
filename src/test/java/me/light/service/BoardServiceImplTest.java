package me.light.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.light.config.Apptest;
import me.light.model.board;

public class BoardServiceImplTest  extends Apptest{

	@Autowired
	BoardService service;
	
	@Test
	public void getListTest() {
//		List<board> list = service.getList();
//		assertEquals(4, list.size());
	}

}
