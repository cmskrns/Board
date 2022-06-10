package me.light.pageing;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.light.config.Apptest;
import me.light.mapper.BoardMapper;
import me.light.model.board;

public class SearchData extends Apptest {
	@Autowired
	BoardMapper mapper;
	
	@Test
	@Ignore
	public void dataInsert() {
		for (int i = 1; i <= 212; i++) {
			
			board board = new board();
			board.setTitle("검색 처리 연습"+i);
			board.setContent("검색처리 연습내용"+i);
			board.setWriter("검색자"+i);
			mapper.insert(board);
		}
	}
	
	@Test
	public void dataInsert2() {
		for (int i = 1; i <= 212; i++) {
			
			board board = new board();
			board.setTitle("검색 처리 연습 자바 "+i);
			board.setContent("검색처리 연습내용"+i);
			board.setWriter("홍길동"+i);
			mapper.insert(board);
		}
	}
}
