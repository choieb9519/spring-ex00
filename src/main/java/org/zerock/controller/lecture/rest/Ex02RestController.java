package org.zerock.controller.lecture.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody 모든 메소드에 붙인 것과 같음
@RestController //@Controller, @ResponseBody의 조합과 같은 결과
@RequestMapping("/rest02")
public class Ex02RestController {
	
	@RequestMapping("/sub01")
	public String method01() {
		return "response body1"; //뷰로 해석되지 않고 응답으로 해석됨
	}
}
