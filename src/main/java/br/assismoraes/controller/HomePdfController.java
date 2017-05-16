package br.assismoraes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.assismoraes.pdf.PDFGenerator;
import br.assismoraes.repo.Students;
import net.sf.jasperreports.engine.JRException;
@Controller
@RequestMapping("/")
public class HomePdfController {
	
	@RequestMapping
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}
	
	@RequestMapping("/pdf")
	public ModelAndView seePDF() throws JRException{
		ModelAndView mv = new ModelAndView("students");
		
		Students students = new Students();
		PDFGenerator.generate("src/main/java/students.jasper", "src/main/java/students.pdf", students.getStudents());
		return mv;
	}
	
	
	
}
