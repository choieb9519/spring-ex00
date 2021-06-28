package org.zerock.controller.lecture.nomal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller //서블릿에서 사용하는 컨트롤러라고 명시해야 함
@RequestMapping("/ex01/*")  //컨트롤러가 일하는 경로 명시
@Log4j
public class Ex01Controller {
	//아래 메소드가 일하는 경로 명시
	@RequestMapping("/sub01")
	//어느 메소드가 일하는지 명시
	public void method01() {
//		System.out.println("ex01, sub01 method");
		log.info("ex01, sub01 method");
	
	}
	
	//메소드 추가(서블릿을 여러개 만들 필요가 없어짐)
	@RequestMapping("/sub02")
	public void method02() {
		log.info("ex01, sub01 method");
	}
	
	//get방식으로 처리하고 싶을 때
	@RequestMapping(value = "/sub03", method = RequestMethod.GET)
	public void method03() {
		log.info("ex01, sub03 get method");
	}
	
	//post방식으로 일하는 메소드 생성
	@RequestMapping(value = "/sub03", method = RequestMethod.POST)
	public void method04() {
		log.info("ex01, sub03 post method");
	}
	
	//리퀘스트매핑이면서 겟방식-간략화
	@GetMapping("/sub05")
	public void method05() {
		log.info("ex01, sub05 get method");
	}
	
	//리퀘스트매핑이면서 포스트방식-간략화
	@PostMapping("/sub06")
	public void method06() {
		log.info("ex01, sub06 post method");
	}
}
