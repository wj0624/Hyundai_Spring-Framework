package net.developia.persistence;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.log4j.Log4j;
import net.developia.domain.Criteria;
import net.developia.domain.ReplyVO;
import net.developia.mapper.ReplyMapper;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:**/*-context.xml")
@Log4j
public class ReplyMapperTests {
	
	private Long[] bnoArr = {1202124L, 1202123L, 1202122L, 1202121L, 1202106L};
	
	@Autowired
	private ReplyMapper mapper;
	
	@Test
	public void testMapper() {
		log.info(mapper);
	}
	
	@Test
	public void testCreate() {
		IntStream.rangeClosed(1, 10).forEach(i->{
			ReplyVO vo = new ReplyVO();
			
			vo.setBno(bnoArr[i%5]);
			vo.setReply("댓글 테스트 "+i);
			vo.setReplyer("replyer"+i);
			
			mapper.insert(vo);
		});
	}
	
	@Test
	public void testRead() {
		Long targetRno = 5L;
		
		ReplyVO vo = mapper.read(targetRno);
		log.info("testRead: " +vo);
	}
	
	@Test
	public void testDelete() {
		Long targetRno = 10L;
		
		int count = mapper.delete(targetRno);
		assertEquals(1, count);
		log.info("DELETE COUNT: "+ count);
	}
	
	@Test
	public void testUpdate() {
		Long targetRno = 7L;
		ReplyVO vo = mapper.read(targetRno);
		
		vo.setReply("댓글 수정 테스트 입니다");
		
		int count = mapper.update(vo);
		
		log.info("UPDATE COUNT: "+count);
	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
		replies.forEach(reply->log.info("*******testList"+reply));
	}
}