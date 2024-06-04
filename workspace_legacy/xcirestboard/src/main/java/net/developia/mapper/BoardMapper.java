package net.developia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.developia.domain.BoardVO;
import net.developia.domain.Criteria;

public interface BoardMapper {
//	@Select("select bno, title, content, writer, regdate, updatedate from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	public List<BoardVO> getListWithOffset(Criteria cri);
	
	
	// create
	public void insert(BoardVO board);
	public void insertSelectkey(BoardVO board);
	
	// read
	public BoardVO read(Long bno);
	
	// update
	public int update(BoardVO board);
	
	// delete
	public int delete(Long bno);
	
	public int getTotalCount(Criteria cri);
	
	public void updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);
}