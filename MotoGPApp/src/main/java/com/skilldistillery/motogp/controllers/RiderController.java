package com.skilldistillery.motogp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String addRider(Rider rider, RedirectAttributes redir) {
		Rider newRider = dao.addRider(rider);
		redir.addFlashAttribute("rider", newRider);
		return "redirect:riderCreated.do";
	}
	
	@RequestMapping(path="riderCreated.do")
	public String createdRedir() {
		return "riderDetails";
	}
	
	@RequestMapping(path="editSelectionPage.do")
	public String editSelectionPageRouting(Model model) {
		List<Rider> riders = dao.findAll();
		model.addAttribute("riders", riders);
		return "editSelectionPage";
	}
	
	@RequestMapping(path="editRider.do")
	public String editPage(@RequestParam int id, Model model) {
		Rider rider = dao.findById(id);
		model.addAttribute("rider", rider);
		return "editPage";
	}
	
	@RequestMapping(path="submitEdit.do")
	public String editRouting(Rider rider, RedirectAttributes redir) {
		Rider manRider = dao.editRider(rider);
		redir.addFlashAttribute("rider", manRider);
		return "redirect:riderEdited.do";
	}
	
	@RequestMapping(path="riderEdited.do")
	public String editedRedir() {
		return "editedDetails";
	}
	
	@RequestMapping(path="deletePage.do")
	public String deletePageRouting(Model model) {
		List<Rider> riders = dao.findAll();
		model.addAttribute("riders", riders);
		return "deletePage";
	}
	
	@RequestMapping(path="deleteRider.do")
	public String deleteRider(@RequestParam("list") int[] ids, RedirectAttributes redir) {
		List<Rider> delRiders = new ArrayList<>();
		boolean greaterThanOne = false;
		if (ids.length > 0) {
			for (int id : ids) {
				delRiders.add(dao.deleteRider(id));
			}
			if (delRiders.size() == 1) {
				greaterThanOne = false;
				redir.addFlashAttribute("gto", greaterThanOne);
			}
			else if (delRiders.size() > 1) {
				greaterThanOne = true;
				redir.addFlashAttribute("gto", greaterThanOne);
			}
		}
		redir.addFlashAttribute("riders", delRiders);
		return "redirect:riderDeleted.do";
	}
	
	@RequestMapping(path="riderDeleted.do")
	public String deletedRedir() {
		return "deletedDetails";
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
