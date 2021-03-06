package com.jth.exercise.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestRequestController {

	private static final Logger logger = LoggerFactory.getLogger(TestRequestController.class);

	@GetMapping("/test/request/list")
	public String list() {
		return "test/request/tRequestList";
	}
	
	@GetMapping("/test/request/regist")
	public ResponseEntity<String> getRegist(String boardId, String boardContent, String boardWriter) {
		
		ResponseEntity<String> reStr = null;
		
		logger.info("boardId : {}", boardId);
		logger.info("boardContent : {}", boardContent);
		logger.info("boardWriter : {}", boardWriter);
		
		reStr = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return reStr;
	}
	
	 
	
	
}
