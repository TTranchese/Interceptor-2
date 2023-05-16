package com.example.Interceptor2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class BasicController {
	@GetMapping
	public String welcome(){
		return "Welcome!";
	}
}