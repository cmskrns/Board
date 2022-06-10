package me.light.mapper;

import java.util.List;

import me.light.model.Criteria;
import me.light.model.board;

public interface BoardMapper {
	List<board> getList(Criteria criteria);
	board get(Long bno);
	void insert(board board);
	void update(board board);
	void delete(Long bno);
	int totalCount(Criteria criteria);
}
