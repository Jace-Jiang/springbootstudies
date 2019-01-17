package demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;

@Controller
@EnableAutoConfiguration
public class helloWorldController {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello world!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(helloWorldController.class, args);
	}
	
	
	

}
