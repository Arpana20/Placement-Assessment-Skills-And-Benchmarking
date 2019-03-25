package com.sample.loginController;

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
		model.addAttribute("questionPaperList",allQ.size());
		model.addAttribute("questionaire", new Questionaire());
		return "level1Start";
	}
	
	@RequestMapping(value = "/validateQuestion", method = RequestMethod.GET)
	public String questionaire(Model model) {
		
		
		return null;
			
	}
}
