package example.SpringCore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;

import example.SpringCore.beans.impl.Grades;

@Controller("gradeService")
public class GradeService {

	@Autowired
	private ConversionService conversionService;

	public Grades getGrade(String grade) {
		return conversionService.convert(grade, Grades.class);
	}
	
}