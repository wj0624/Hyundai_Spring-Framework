package net.developia.xcispring01.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.java.Log;
import net.developia.xcispring01.domain.SampleDTO;
import net.developia.xcispring01.domain.SampleDTOList;
import net.developia.xcispring01.domain.TodoDTO;

@Controller
@RequestMapping("/sample/*")
@Log
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
		log.info("basic.........");
	}
	
	@GetMapping("/ex01")
	public String ex01(@ModelAttribute SampleDTO dto) { //Command Object
		log.info(""+dto);
		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name,
			@RequestParam(value="age", defaultValue="1") int age) {
		log.info("name: "+name);
		log.info("age: "+age);
		
		return "ex02";
	}
	
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String [] ids) {
		log.info("array ids: "+Arrays.toString(ids));
		
		return "ex02Array";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info("list dtos: "+list);
		return "ex02Bean";
	}
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
//	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		log.info("todo: " +todo);
		return "ex03";
	}
	
	@GetMapping("/other01")
	public ModelAndView other01() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("other");
		mav.addObject("msg1", "Hello Spring @MVC");
		mav.addObject("msg2", "Hello World");
		return mav;
	}
	
	@GetMapping("/other02")
	public String other02(Model model) {
		model.addAttribute("msg1", "Hello Spring @MVC~~");
		model.addAttribute("msg2", "Hello World~~");
		return "other";
	}
	
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, int page) {
		log.info("dto: "+dto);
		log.info("page: "+page);
		
//		return "/sample/ex04";
		return "redirect:/list";
	}
	
	@GetMapping("/ex05")
	public void ex05() {
		log.info("/ex05........");
	}
	
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		log.info("/ex06........");
		
		SampleDTO dto = new SampleDTO();
		dto.setAge(23);
		dto.setName("홍길동");
		return dto;
	}
	
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07(){
		log.info("/ex07........");
		
		String msg = "{\"name\": \"홍길동\"}";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(msg, header, HttpStatus.OK);
	}
	
	@GetMapping("/exUpload")
	public void exUpload() {
		log.info("/exUpload.........");
	}
	
	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {
		files.forEach(file-> {
			log.info("-------------------");
			log.info("name: "+file.getOriginalFilename());
			log.info("size: "+file.getSize());
		});
	}
}
