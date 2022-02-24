package com.jth.exercise.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jth.exercise.test.vo.TestReturnBoardVO;

@Controller
public class TestReturnController {
	private static final Logger logger = LoggerFactory.getLogger(TestReturnController.class);
	
	@GetMapping("/test/return/list")
	public String list() {
		return "test/return/testReturnList";
	}
	
	@GetMapping("/test/return/voList")
	@ResponseBody
	public TestReturnBoardVO listVO() {
		
		TestReturnBoardVO testReturnBoardVO = new TestReturnBoardVO();
		testReturnBoardVO.setBoardId("20210817001");
		testReturnBoardVO.setBoardTitle("인생 쉽지 않네.");
		testReturnBoardVO.setBoardContent("이런 게 인생인가 싶습니다.");
		testReturnBoardVO.setBoardWriter("백종헌");
		
		return testReturnBoardVO;
	}
	
	@GetMapping("test/return/strList")
	@ResponseBody
	public List<String> strList() {
		List<String> resultList = new ArrayList<String>();
		resultList.add("보병");
		resultList.add("기갑");
		resultList.add("포병");
		resultList.add("항공");
		
		return resultList;
		
	}
	
	@GetMapping("/test/return/strMap")
	@ResponseBody
	public Map<String, Object> strMap() {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("기관단총", "k1");
		resultMap.put("소총", "k2");
		resultMap.put("기관총", "M60");
		resultMap.put("차량", "RBS");
		
		return resultMap;
		
		
	}
	
	@GetMapping("/test/return/reStirng")
	@ResponseBody
	public ResponseEntity<String> strRE() {
		
		ResponseEntity<String> resultEntity = new ResponseEntity<String>("Good day!", HttpStatus.OK);
		return resultEntity;
		
	}
	
	@GetMapping("/test/return/reList")
	@ResponseBody
	public ResponseEntity<List<String>> listStrRE() {
		
		ResponseEntity<List<String>> resultList = null;
		
		List<String> strList = new ArrayList<String>();
		strList.add("네이버");
		strList.add("카카오");
		strList.add("배달의 민족");
		strList.add("쿠팡");
		
		resultList = new ResponseEntity<List<String>>(strList, HttpStatus.OK);
		
		return resultList;
		
	}
	
	
	
}
