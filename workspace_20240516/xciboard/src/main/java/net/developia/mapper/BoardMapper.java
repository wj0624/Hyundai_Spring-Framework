package net.developia.mapper;

import java.util.List;

import net.developia.domain.BoardVO;

public interface BoardMapper {
//	@Select("select bno, title, content, writer, regdate, updatedate from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	// create
	public void insert(BoardVO board);
	public void insertSelectkey(BoardVO board);
	
	// read
	public BoardVO read(Long bno);
	
	// update
	public int update(BoardVO board);
	
	// delete
	public int delete(Long bno);

	
}
