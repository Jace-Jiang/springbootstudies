package demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;

@Controller
@EnableAutoConfiguration
/**
 * 
 * @author jlq 2019-01-17
 *
 */
public class helloWorldController {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello world!";//测试与互联关系
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(helloWorldController.class, args);
	}
	
	
	

}
