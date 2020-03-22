package siva.bootmvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import siva.bootmvc.model.Student;

@Controller
public class DataToUIController {

	@RequestMapping("/home")
	public String showData(Model model) {
		
		// primitive data
		model.addAttribute("id", 10);
		model.addAttribute("name", "sivakumar");
		model.addAttribute("course", "java");

		// Object Data
		Student student = new Student(101, "siva", "SpringBoot");
		model.addAttribute("studentData", student);
		
		// collection data
		List<String> list = List.of("core java", "Spring", "boot", "Angular");
		model.addAttribute("listData", list);
		
		Map<Integer, String> map = Map.of(8, "OOPs", 7, "Collections", 5, "MultiThreading");
		model.addAttribute("mapData", map);

		return "Data";
	}
}
