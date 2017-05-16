package br.assismoraes.repo;

import java.util.ArrayList;
import java.util.List;

import br.assismoraes.model.Student;

public class Students {
	
	private List<Student> students;
	
	public List<Student> getStudents(){
		students = new ArrayList<>();
		
		students.add(createStudent("6615", "João de Deus"));
		students.add(createStudent("6166", "Maria Lima"));
		students.add(createStudent("9100", "Juliana Costa"));
		students.add(createStudent("1762", "Helena Martins"));
		students.add(createStudent("1672", "Mateus Severino"));
		students.add(createStudent("7823", "Úrsula Pereira"));
		students.add(createStudent("1902", "Karine Souza"));
		students.add(createStudent("7819", "Wanderson Simeão"));		
		
		return students;
	}
	
	private Student createStudent(String code, String name){
		Student student = new Student();
		student.setCode(code);
		student.setName(name);
		return student;
	}
	

}
