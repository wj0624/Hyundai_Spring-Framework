package net.developia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import net.developia.domain.BoardVO;
import net.developia.mapper.BoardMapper;

@Log
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) throws Exception {
		try {
			log.info("register......" + board);
			mapper.insertSelectkey(board);
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
			
	}

	@Override
	public BoardVO get(Long bno) {
		log.info("get......" + bno);
		return mapper.read(bno);
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
	

}
