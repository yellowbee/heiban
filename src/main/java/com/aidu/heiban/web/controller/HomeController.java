package com.aidu.heiban.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/*
	 * @RequestMapping(value="/authentication", method = RequestMethod.POST)
	 * public ModelAndView authenticate(HttpServletResponse response) throws
	 * IOException{ return new ModelAndView("dashboard"); }
	 */

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView dashboard(HttpServletRequest request, HttpServletResponse response) throws IOException {
		/*HttpSession session = request.getSession(false);
		
		// if user has not loggin in yet or already logged out
		if (session == null || session.getAttribute("user") == null) {
			return new ModelAndView("redirect:login");
		}*/
		return new ModelAndView("home");
	}

	/*@RequestMapping(value = "/college_search", method = RequestMethod.GET)
	public ModelAndView collegeSearch(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("user") == null) {
			return new ModelAndView("redirect:login");
		}
		
		return new ModelAndView("college_search");
	}

	@RequestMapping(value = "/search_colleges", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<College> search_colleges(
			@RequestBody CollegeSearchCriteria criteria) throws IOException {
		ArrayList<College> collegeList = new ArrayList<College>();
		collegeList.add(new College(criteria.getName(), "Athens", "OH"));
		collegeList.add(new College("AKRON SCHOOL", "Akron", "OH"));
		collegeList.add(new College("BOWLING GREEN UNIVERSITY",
				"Bowling Green", "OH"));
		collegeList.add(new College("DAYTON UNIVERSITY", "Dayton", "OH"));
		collegeList.add(new College("OHIO STATE UNIVERSITY", "Columbus", "OH"));
		collegeList.add(new College("MIAMI UNIVERSITY", "Miami", "OH"));

		return collegeList;
	}

	@RequestMapping(value = "/my_app", method = RequestMethod.GET)
	public ModelAndView my_app(HttpServletResponse response) throws IOException {
		return new ModelAndView("my_app");
	}*/
}
