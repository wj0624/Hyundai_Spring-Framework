package net.developia.boot_article.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.developia.boot_article.dto.ArticleDTO;
import net.developia.boot_article.service.ArticleService;

@Controller
@RequiredArgsConstructor
@Log4j2
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("insert")
	public String insert() {
		return "article/insert";
	}
	
	@PostMapping("insert")
	public String insert(@ModelAttribute ArticleDTO articleDTO, Model model) {
		log.info(articleDTO.toString());
		try {
			articleService.insertArticle(articleDTO);
			return "redirect:list";
		} catch (Exception e) {
			model.addAttribute("msg","게시물 등록 오류입니다.");
			model.addAttribute("url","javascript:history.back();");
			return "article/result";
		}
	}
}
