package me.light.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.light.mapper.BoardMapper;
import me.light.model.Criteria;
import me.light.model.board;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<board> getList(Criteria criteria) {
		return boardMapper.getList(criteria);
	}

	@Override
	public board get(Long bno) {
		return boardMapper.get(bno);
	}

	@Override
	public void register(board board) {
		boardMapper.insert(board);
	}

	@Override
	public void modify(board board) {
		boardMapper.update(board);
	}

	@Override
	public void remove(Long bno) {
		boardMapper.delete(bno);
	}

	@Override
	public int totalCount(Criteria criteria) {
		return boardMapper.totalCount(criteria);
	}

}
