package net.developia.service;

import java.util.List;

import net.developia.domain.BoardVO;
import net.developia.domain.Criteria;

public interface BoardService {
	public void register(BoardVO board) throws Exception;
	public BoardVO get(Long bno);
	public boolean modify(BoardVO board);
	public boolean remove(Long bno);
	public List<BoardVO> getList();
	public List<BoardVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
}
