package org.zerock.controller.lecture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/ex06/*")

public class Ex06Controller {

	@RequestMapping("/sub01")
	public String method01() {
		log.info("ex06, sub01 method");

		/*
		 * servlet
		 * request.getRequstDispatcher("/WEb-INF/views/ex06-sub01.jsp").forward(request,
		 * response)
		 */

		//return "ex06/sub01";과 같은 결과
		return "ex06/sub01";

		// WEb-INF/views/ex06-sub01.jsp

	}
	
	@RequestMapping("/sub02")
	public void method2() {
		log.info("ex06, sub02 method");
	}
	
	@RequestMapping("/sub03")
	public String method3() {
		log.info("ex06, sub03 method");
		return "forward:/ex06/sub02";
		
		//포워드는 하나의 요청
		//리다이렉트는 두개의 요청
	}
	
	@RequestMapping("/sub04")
	public String method4() {
		log.info("ex06, sub04 method");
		return "redirect:/ex06/sub02";
	}
}
