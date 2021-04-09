package com.mcausevic.codingcontroller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String hello() {
		return "Hello Coding Dojo!";
}
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better! (not really)";
}
}