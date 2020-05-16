package com.skilldistillery.motogp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.motogp.data.RiderDAO;
import com.skilldistillery.motogp.entities.Rider;

@Controller
public class RiderController {

	@Autowired
	private RiderDAO dao;
	
	@RequestMapping(path="getRider.do")
	public String findRider(@RequestParam Integer gid, Model model) {
		Rider r = dao.findById(gid);
		model.addAttribute("rider", r);
		return "riderDetails";
	}
}
