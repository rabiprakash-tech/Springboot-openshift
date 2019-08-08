package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author s5580996
 *
 */
@RestController
public class TradeSubmissionController{

	@RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
	
	@RequestMapping("/{input}")
    public @ResponseBody String welcome(@PathVariable String input) {
        return "Hello "+ input +"! this is your first Springboot-Openshift service";
    }
	
}