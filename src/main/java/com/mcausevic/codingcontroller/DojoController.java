package com.mcausevic.codingcontroller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DojoController {
	@RequestMapping("/{location}")
	public String location( @PathVariable("location") String location){
		if ("dojo".equals(location)) {
			return "The" + location + "is awesome";
		}else if ("the burbank-dojo".equals(location)) {
			return "Burbank Dojo is location in Southern California";
		}else if("san-jose".equals(location)) {
			return "SJ dojo is the headquarters";
		}
		return "unknown location: " + location;
 
	}
}

