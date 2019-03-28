package com.sample.loginController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {
	
	public static int count = 0;
//	@RequestMapping("/welcome")
//	public ModelAndView login() {
//		
//		
//		
//		String message = "Hello";
//		return new ModelAndView("welcome", "message", message);
//	}
//	
//	@RequestMapping("/level1Start")
//	public ModelAndView level1StartPage() {
//		
//		String message = "Hello";
//		return new ModelAndView("level1Start", "message", message);
//	}
//	
//	@RequestMapping("/index")
//	public ModelAndView login_page() {
//		String msg = null;
//		return new ModelAndView("Login");
//	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	  public String init(Model model) {
	    model.addAttribute("msg", "Please Enter Your Login Details");
	    return "Login";
	  }

	

	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	  public String sample(Model model, @ModelAttribute("Login") Login login) {
		//String str = model.getClass().toString();
		String uname = login.getUserName();
		String password = login.getPassword();
//		int count = 0;
//		String tb = "<table>";
//		String tbEnd = "</table>";
//		String tableContent = "<tr><td>";
//		String tableContentEnd = "</td></tr>";
//		String content = "";
//		for(int i=0; i<10; i++) {
//			content = content + tableContent + count + tableContentEnd;
//			count++;
//		}
//		model.addAttribute("msg", tb+content+tbEnd);
//		return "level1Start";
		OracleConn oracleConn = new OracleConn();
		if(oracleConn.validateStudent(uname, password)) {
			//model.addAttribute("msg", "Hello Himanshu");
		    return "studentDashboard";
		}
		else {
			//OracleConn ocon= new OracleConn();
		   // ocon.sampleGetQuestions();
			model.addAttribute("msg", "Invalid Uname or Password");
			//List allQ = oracleConn.getQuestions();
			//System.out.println(allQ.get(0));
//			for (Object object : allQ) {
//				
//				System.out.println(object.toString());
//				System.out.println();
//			}
			//model.addAttribute("msg",allQ);
		    return "Login";
		}
	  }
	
	@RequestMapping(value = "/level1Test", method = RequestMethod.GET)
	public String level1Start(Model model) {
		OracleConn oracleConn = new OracleConn();
		Questionaire question = new Questionaire();
		List allQ = oracleConn.getQuestions();
		question.setQuestionName(allQ.toString());
		System.out.println(allQ.listIterator().next().toString());
		//String allQS = (allQ.listIterator().next()).toString();
		//System.out.println(allQS);
//		model.addAttribute("questionPaperList",allQ.size());
		model.addAttribute("questionaire", new Questionaire());
//		List lst = oracleConn.sampleGetQuestions();
//		model.addAttribute("ques", lst);
		if(count==3) {
			System.out.println(count);
			count++;
		}
		if(count==2) {
			System.out.println(count);
			count++;
		}
		if(count==1) {
			System.out.println(count);
			count++;
		}
		if(count==0) {
			System.out.println(count);
			count++;
		}
		if(count>3) {
			count = 0;
			System.out.println(count);
		}
		
		return "level1Start";
	}
	
	@RequestMapping(value = "/validateQuestions", method = RequestMethod.POST)
	public String questionaire(Model model, @ModelAttribute("Choice") Choice choice) {
		int marks = 0;
		if(choice.getChoice1() == 4) 
			marks++;
		if(choice.getChoice2() == 1) 
			marks++;
		if(choice.getChoice3() == 1) 
			marks++;
		if(choice.getChoice4() == 1) 
			marks++;
		if(choice.getChoice5() == 1) 
			marks++;
		if(choice.getChoice6() == 1) 
			marks++;
		if(choice.getChoice7() == 3) 
			marks++;
		if(choice.getChoice8() == 2) 
			marks++;
		if(choice.getChoice9() == 2) 
			marks++;
		if(choice.getChoice10() == 3) 
			marks++;
		System.out.println(marks);
		model.addAttribute("marks",marks);
		String result;
		if(marks<5)
			result="FAIL";
		else
			result="PASS";
		model.addAttribute("result",result);
		return "validateQuestions";
			
	}
	@ModelAttribute("chList")
	public List<String> getChoice() {
		List<String> chList = new ArrayList<String>();
		chList.add("choice1");
		chList.add("choice2");
		chList.add("choice3");
		chList.add("choice4");
		return chList;
	}
	@ModelAttribute("chLabel")
	public String chLabel() {
		String chLabel = "Ques 1";
		return chLabel;
	}
	@RequestMapping("/newstudentDashboard")
	public String out() {
		return "studentDashboard";
	}
	@RequestMapping("/newLogin")
	public String logout() {
		return "Login";
	}
}
