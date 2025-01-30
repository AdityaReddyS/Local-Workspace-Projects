package com.shankar.controller;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	//welcome to home controller
	/*
	 * @RequestMapping("/home")
	 *  public String renderHome()
	 *   {
	 *    return "welcome"; }
	 */
	/* @RequestMapping("/") 
	 * public String renderHome() {
	 *  return "welcome"; } */
	/* @RequestMapping("/") 
	 * public String showHome(Map<String,Object> map) {
	 * System.out.println("Object data:::"+map.getClass());
	 * map.put("attr1","Shankar Reddy");
	 *  map.put("attr2",new Date()); 
	 *  return
	 * "welcome"; } */
	/* @RequestMapping("/home")
	 *  public ModelAndView showView() { 
	 *  ModelAndView
	 * mav=new ModelAndView();
	 *  mav.addObject("attr1","attr1");
	 * mav.addObject("attr2", new Date()); 
	 * mav.setViewName("/welcome"); 
	 * return mav;
	 * } */
	/*
	 * @RequestMapping("/")
public String showHome(ModelMap model) {
	 * System.out.println("Object data:::"+model.getClass());
	 * model.addAttribute("attr1","Shankar Reddy");
	 *  model.addAttribute("attr2",new
	 * Date()); 
	 * return "welcome"; }
	 */
	/*@RequestMapping("/welcome")
	public Model ShowHome() {
		Model model=new BindingAwareModelMap();
		model.addAttribute("attr1","Shankar Reddy");
		model.addAttribute("attr2",new Date());
		return model;
		
	}*/
	/*@RequestMapping("/welcome")
	public Map<String,Object> ShowHome() {
		Map<String,Object> model=new HashMap();
		model.put("attr1","Shankar Reddy");
		model.put("attr2",LocalDateTime.now());
		return model;
		
	}*/
	/*@RequestMapping("/welcome")
	public void ShowHome(Map<String,Object> model) {
	System.out.println("HomeController.ShowHome()"+model.getClass());
		model.put("attr1","Shankar Reddy");
		model.put("attr2",LocalDateTime.now());
		
		
	}*/
	/*@RequestMapping("/welcome")
	public String ShowHome(Map<String,Object> model) {
	System.out.println("HomeController.ShowHome()"+model.getClass());
		model.put("attr1","Shankar Reddy");
		model.put("attr2",LocalDateTime.now());
		
		return null;
	}*/
	/*@RequestMapping("/process")
	public String process() {
		System.out.println("HomeController.process()");
		return "forward:welcome";
	}
	@RequestMapping("/welcome")
	public String ShowHome(Map<String,Object> model) {
	System.out.println("HomeController.ShowHome()"+model.getClass());
		model.put("attr1","Shankar Reddy");
		model.put("attr2",new Date());
		
		return "welcome";
	}*/
	/*@RequestMapping("/process")
	public String process(HttpSession ses) {
		System.out.println("HomeController.process()"+ses.hashCode());
		ses.setAttribute("attr1","val1");
		return "show_data";
	}
	@RequestMapping("/report")
	public String showReport(HttpServletRequest req) {
		System.out.println("HomeController.showReport()"+req.getAttribute("attr1"));
		System.out.println("HomeController.process()"+req.hashCode());
		//req.setAttribute("attr1","val1");
		return "show_data";
	}*/
	/*@Autowired
	private ServletContext ctx;
	@Autowired
	private ServletConfig cfg;
	@RequestMapping("/welcome")
	public String ShowHome(Map<String,Object> model) {
	System.out.println("HomeController.ShowHome()"+model.getClass());
	System.out.println("web application Context Path::"+ctx.getContextPath());
	System.out.println("Servlet name::"+cfg.getServletName());
		model.put("attr1","Shankar Reddy");
		model.put("attr2",new Date());
		
		return "welcome";
	}*/
	@RequestMapping("/process")
	public void process(HttpServletResponse res) throws Exception{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<h1 style='color:red;text-align;center'>Welcome To Spring MVC</h1>");
		pw.println("<b>Spring MVC</b>");
	
	}
}
