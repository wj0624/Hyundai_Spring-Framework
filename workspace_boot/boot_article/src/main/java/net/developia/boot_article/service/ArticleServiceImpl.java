package net.developia.boot_article.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import net.developia.boot_article.dao.ArticleDAO;
import net.developia.boot_article.dto.ArticleDTO;
@Service
@RequiredArgsConstructor
@Log4j2
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDAO articleDAO;
	
	@Override
	public void insertArticle(ArticleDTO articleDTO) throws Exception {
		try {
			articleDAO.insertArticle(articleDTO);
			log.info("게시물 입력 성공");
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}
}
