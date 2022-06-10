package me.light.mapper;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.light.config.Apptest;
import me.light.mapper.BoardMapper;
import me.light.model.board;

public class DataInsertTest extends Apptest {

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void dataInsert() {
		for (int i = 1; i <= 412; i++) {
			
			board board = new board();
			board.setTitle("페이징처리연습"+i);
			board.setContent("연습내용"+i);
			board.setWriter("연습자"+i);
			mapper.insert(board);
		}
	}
}
