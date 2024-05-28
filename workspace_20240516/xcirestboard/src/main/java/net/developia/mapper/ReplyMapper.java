package net.developia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.developia.domain.Criteria;
import net.developia.domain.ReplyVO;

public interface ReplyMapper {
	// 등록
	public int insert(ReplyVO vo);
	
	// 조회
	public ReplyVO read(Long rno);
	
	// 삭제
	public int delete(Long rno);
	
	// 수정
	public int update(ReplyVO reply);
	
	// 댓글 목록 및 페이징 처리
	public List<ReplyVO> getListWithPaging(
			@Param("cri") Criteria cri, 
			@Param("bno") Long bno);
	
	// 특정 게시물의 댓글 개수 가져오기
	public int getCountByBno(Long bno);
}