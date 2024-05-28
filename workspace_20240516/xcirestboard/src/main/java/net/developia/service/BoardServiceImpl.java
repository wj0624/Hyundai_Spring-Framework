package net.developia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import net.developia.domain.BoardVO;
import net.developia.domain.Criteria;
import net.developia.mapper.BoardMapper;

@Log
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) throws Exception {
		log.info("register......" + board);
		mapper.insertSelectkey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		log.info("get......" + bno);
		BoardVO vo = mapper.read(bno);
		if(vo == null) throw new RuntimeException(bno +"번 게시물이 존재하지 않음");
		return vo;
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("modify......" + board);
		return mapper.update(board)==1;
	}

	@Override
	public boolean remove(Long bno) {
		log.info("remove......" + bno);
		return mapper.delete(bno)==1;
	}

	@Override
	public List<BoardVO> getList() {
		log.info("getList......");
		return mapper.getList();
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		log.info("get List with criteria: "+cri);
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}
	

}
