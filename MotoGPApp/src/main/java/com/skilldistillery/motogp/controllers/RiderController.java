package com.skilldistillery.motogp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.motogp.data.RiderDAO;
import com.skilldistillery.motogp.entities.Rider;

@Controller
public class RiderController {

	@Autowired
	private RiderDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String index() {
		return "index";
	}
	
	@RequestMapping(path="gridPage.do", method=RequestMethod.GET)
	public String grid(Model model) {
		List<Rider> riders = dao.findAll();
		model.addAttribute("riders", riders);
		return "grid";
	}
	
	@RequestMapping(path="findById.do")
	public String findRider(@RequestParam Integer gid, Model model) {
		Rider r = dao.findById(gid);
		model.addAttribute("rider", r);
		return "riderDetails";
	}
	
	@RequestMapping(path="allRiders.do")
	public String listAllRiders(Model model) {
		List<Rider> riders = dao.findAll();
		model.addAttribute("riders", riders);
		return "index";
	}
	
	@RequestMapping(path="findByFirstName.do")
	public String findByFirstName(String name, Model model) {
		Rider r = dao.findByFirstName(name);
		model.addAttribute("rider", r);
		return "riderDetails";
	}
	
	@RequestMapping(path="searchResults")
	public String searchBarAction(@RequestParam String search, Model model) {
		List<Rider> riderResults = new ArrayList<>();
		int numSearch = 0;
		
		if (search.matches("\\d")) {
			try {
				numSearch = Integer.parseInt(search);
				if (numSearch > 0) {
					Rider riderById = dao.findById(numSearch);
					riderResults.add(riderById);
				} else {
					System.out.println("Search was 0");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Search was not an integer");
			}
		}
		
		
		model.addAttribute("riderResults", riderResults);
		return "searchResults";
	}
}
