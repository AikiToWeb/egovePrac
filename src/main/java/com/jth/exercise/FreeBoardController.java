package com.jth.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 자유게시판
 * */
@Controller
@RequestMapping("/freeboard")
public class FreeBoardController {

	private static final Logger logger = LoggerFactory.getLogger(FreeBoardController.class);
	
	/*
	 * 자유게시판 목록
	 * @return
	 * */
	
	@RequestMapping(value = "/list")
	public String freeBoardList() {
		return "freeBoard/freeBoardList";
		
	}
	
	/*
	 * 자유게시판 등록
	 * */
	@GetMapping(value = "/insert")
	public String freeBoardInsert() {
		return "freeBoard/freeBoardInsert";
	}
	
	/*
	 * 자유게시판 수정
	 * */
	@GetMapping(value = "/modify")
	public String freeBoardModify() {
		return "freeBoard/freeBoardModify";
	}
}
