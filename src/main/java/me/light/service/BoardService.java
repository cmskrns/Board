package me.light.service;

import java.util.List;

import me.light.model.Criteria;
import me.light.model.board;

public interface BoardService {
	List<board> getList(Criteria criteria);
	board get(Long bno);
	void register(board board);
	void modify(board board);
	void remove(Long bno);
	int totalCount(Criteria criteria);
}
