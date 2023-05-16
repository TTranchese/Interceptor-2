package com.example.Interceptor2.Controllers;

import com.example.Interceptor2.Month;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {
	@GetMapping
	public Month returnMonth(HttpServletRequest request){
		return (Month)request.getAttribute("month");
	}
}
