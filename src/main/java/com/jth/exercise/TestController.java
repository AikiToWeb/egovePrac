package com.jth.exercise;

import org.slf4j.Logger;
import com.jth.exercise.test.vo.*;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	public static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/list")
	public String testList() {
		logger.info("TestController, testList.");

		return "test/testList";
	}

	@GetMapping("/detail")
	public String testDetail(Model model) {
		logger.info("TestController, testDetail.");

		return "test/testDatail";
	}

	/*
	 * POST 전송
	 */
	@PostMapping("/detail/post")
	public ResponseEntity<String> testDetailPost(@RequestBody TestBoardVO testBoardVO) {
		logger.info("TestController, testDetailPost.");

		if (testBoardVO != null) {
			logger.info(testBoardVO.toString());
		}

		ResponseEntity<String> resultEntity = null;
		try {
			resultEntity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL", HttpStatus.BAD_REQUEST);
		}
		return resultEntity;
	}

	/*
	 * PUT 전송
	 */

	@PutMapping("/detail/put")
	public ResponseEntity<String> testDatailPut(@RequestBody TestBoardVO testBoardVO) {
		logger.info("TestController, testDetailPut");

		if (testBoardVO != null) {
			logger.info(testBoardVO.toString());
		}

		ResponseEntity<String> resultEntity = null;

		try {
			resultEntity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL", HttpStatus.BAD_REQUEST);
		}

		return resultEntity;

	}
	
	@PostMapping("/detail/xml")
	public ResponseEntity<String> testDatailXml(@RequestBody TestBoardVO testBoardVO) {
		logger.info("TestController, testDatailXml");

		if (testBoardVO != null) {
			logger.info(testBoardVO.toString());
		}

		ResponseEntity resultEntity = null;

		try {
			resultEntity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL", HttpStatus.BAD_REQUEST);
		}

		return resultEntity;

	}

	@PostMapping("/insert")
	public String testInsert() {
		logger.info("TestController, testInsert.");

		return "test/testInsert";
	}

	@PostMapping("/update")
	public String testUpdate() {
		logger.info("TestController, testUpdate.");

		return "test/testUpdate";
	}

	@PostMapping("/delete")
	public String testDelete() {
		logger.info("TestController, testDelete.");

		return "test/testDelete";
	}
}
