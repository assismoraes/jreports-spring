package br.assismoraes.pdf;

import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class PDFGenerator {
	
	@SuppressWarnings("unchecked")
	public static void generate(String jasperFilePath, String generatedPdfFilePath, Object list) throws JRException{
		JRBeanCollectionDataSource listOfObjects = new JRBeanCollectionDataSource((List<Object>) list);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFilePath, null, listOfObjects);
		JasperExportManager.exportReportToPdfFile(jasperPrint, generatedPdfFilePath); 
		
		System.out.println(generatedPdfFilePath + " FILE GENERATED! REFRESH YOUR PROJECT FOLDER!");
	}

}
