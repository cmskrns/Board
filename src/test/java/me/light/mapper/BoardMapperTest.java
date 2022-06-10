package me.light.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.border.Border;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.light.config.Apptest;
import me.light.model.board;

public class BoardMapperTest extends Apptest{
	
	@Autowired
	BoardMapper boardMapper;
	
	@Autowired
	DataSource dataSource;
	
	@Before
	public void setUp() throws IOException, SQLException {
		Reader reader = Resources.getResourceAsReader("sql/board_ex1.sql");
		ScriptRunner runner = new ScriptRunner(dataSource.getConnection());
		runner.runScript(reader);
	}
	
	@Test
	public void test() {
//		List<board> list = boardMapper.getList();
//		assertEquals(4, list.size());
	}
	@Test
	public void getTest() {
		board board = boardMapper.get(1L);
		assertEquals("게시물입니다 ", board.getTitle());
		assertEquals("내용입니다", board.getContent());
		assertEquals("작성자", board.getWriter());
	}
	
	@Test
	public void insertTest() {
		board board = new board();
		board.setTitle("테스트 제목");
		board.setContent("테스트중");
		board.setWriter("me");
		boardMapper.insert(board);
		board getBoard = boardMapper.get(5L);
		
		assertEquals(board.getTitle(), getBoard.getTitle());
		assertEquals(board.getContent(), getBoard.getContent());
		assertEquals(board.getWriter(), getBoard.getWriter());
		assertEquals(board.getBno(), getBoard.getBno());
	}
	
	@Test
	public void updateTest() {
		board board = boardMapper.get(1L);
		board.setTitle("제목수정");
		board.setContent("내용수정");
		boardMapper.update(board);
		assertEquals("제목수정", board.getTitle());
		assertEquals("내용수정", board.getContent());
		assertEquals("작성자", board.getWriter());
	}
	
	@Test
	public void deleteTest() {
		boardMapper.delete(1L);
		boardMapper.delete(2L);
		board board1 = boardMapper.get(1L);
		board board2 = boardMapper.get(2L);
		board board3 = boardMapper.get(3L);
		assertNull(board1);
		assertNull(board2);
		assertNotNull(board3);
	}
}
