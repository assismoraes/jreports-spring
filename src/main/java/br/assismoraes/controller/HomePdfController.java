package br.assismoraes.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.assismoraes.repo.Students;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Controller
@RequestMapping("/")
public class HomePdfController {
	
	@RequestMapping
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}
	
	@RequestMapping("/students.pdf")
	public void seePDF(HttpServletResponse response) throws JRException, IOException{
		Students students = new Students();
		JRBeanCollectionDataSource listOfObjects = new JRBeanCollectionDataSource(students.getStudents());
		JasperPrint jasperPrint = JasperFillManager.fillReport("src/main/java/students.jasper", null, listOfObjects);
		JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
	}
	
	
	
}
