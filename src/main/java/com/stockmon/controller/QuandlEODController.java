package com.stockmon.controller;

import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stockmon.service.QuandlService;
import com.stockmon.service.QuandlServiceImpl;

@Controller
public class QuandlEODController {
	@Autowired
	QuandlService quandlService;


	@RequestMapping(value = "/addEOD", method = RequestMethod.POST)
	public String addEOD(Map<String, Object> model, HttpServletRequest request) {
/*		
		System.out.println("result has errors: " + result.hasErrors());
		
//		System.out.println("Goal set: " + goal.getMinutes());
		
		if(result.hasErrors()) {
			return "addGoal";
		} else {
*/		
			quandlService.StoreEOD();
//		}
		
		return "addEOD";
	}

	@RequestMapping(value = "/addEOD", method = RequestMethod.GET)
	public void addEOD() {}
	
}
