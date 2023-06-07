package com.springproject.dunk.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springproject.dunk.domain.Matching;
import com.springproject.dunk.service.MatchingService;

@Controller
public class MatchingController {
	
	@Autowired
	private MatchingService matchingService;
	
	public void setMatchingService(MatchingService matchingService) {
		
		this.matchingService = matchingService;
		
	}
	
	@RequestMapping(value = "/matchingList", method = RequestMethod.GET)
	public String matchingList
	(Model model, @RequestParam(value = "pageNum", required = false, defaultValue = "1")int pageNum) {
		
		Map<String, Object> modelMap = matchingService.matchingList(pageNum);
		
		model.addAllAttributes(modelMap);
		
		return "matchingList";
		
	}
	
	//매칭디테일
	@RequestMapping("/matchingDetail")
	public String matchingDetail(Model model, int no,
			@RequestParam(value = "pageNum", required = false, defaultValue = "1")int pageNum) 
	throws Exception
	{
		Matching matching = matchingService.getMatching(no, true);
		model.addAttribute("matching", matching);
		model.addAttribute("pageNum",pageNum);
		
		return "matchingDetail";
	}

}
