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
		Rider rider = dao.findById(gid);
		model.addAttribute("rider", rider);
		return "riderDetails";
	}
	
	@RequestMapping(path="findByRiderNumber.do")
	public String findByRiderNumber(@RequestParam int rn, Model model) {
		List<Rider> riders = dao.findByRiderNumber(rn);
		model.addAttribute("riders", riders);
		return "searchResultsPage";
	}
	
	@RequestMapping(path="findByFirstName.do")
	public String findByFirstName(@RequestParam String fn, Model model) {
		List<Rider> riders = dao.findByFirstName(fn);
		model.addAttribute("riders", riders);
		return "searchResultsPage";
	}
	
	@RequestMapping(path="findByLastName.do")
	public String findByLastName(@RequestParam String ln, Model model) {
		List<Rider> riders = dao.findByLastName(ln);
		model.addAttribute("riders", riders);
		return "searchResultsPage";
	}
	
	
	@RequestMapping(path="findByKeyword.do")
	public String keywordSearch(@RequestParam String kw, Model model) {
		List<Rider> riders = dao.findByKeyword(kw);
		model.addAttribute("riders", riders);
		return "searchResultsPage";
	}
	
	@RequestMapping(path="allRiders.do")
	public String listAllRiders(Model model) {
		List<Rider> riders = dao.findAll();
		model.addAttribute("riders", riders);
		return "index";
	}
	
	@RequestMapping(path="createPage.do", method=RequestMethod.GET)
	public String createPageRouting() {
		return "createPage";
	}
	
	@RequestMapping(path="addRider.do")
	public String addRider(@RequestParam Rider rider, Model model) {
		Rider newRider = dao.addRider(rider);
		model.addAttribute(newRider);
		return "createPage";
	}
	
	@RequestMapping(path="navSearch.do")
	public String navSearchAction(@RequestParam String search, Model model) {
		List<Rider> results = new ArrayList<>();
		int numSearch = 0;
		
		if (search.matches("\\d+")) {
			try {
				numSearch = Integer.parseInt(search);
				if (numSearch > 0) {
					try {
						Rider riderById = dao.findById(numSearch);
						if (riderById != null) {
							results.add(riderById);
						}
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Search did not match any id values");
					}
					try {
						List<Rider> riderByRaceNum = dao.findByRiderNumber(numSearch);
						for (Rider rider : riderByRaceNum) {
							results.add(rider);
						}
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Search did not match any riderNumber values");
					}
				} else {
					System.out.println("Search was 0");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Search was not an integer");
			}
		}
		try {
			List<Rider> riderByKWResults = dao.findByKeyword(search);
			for (Rider rider : riderByKWResults) {
				results.add(rider);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Keyword string has errors");
		}
		model.addAttribute("riders", results);
		return "searchResultsPage";
	}
}
