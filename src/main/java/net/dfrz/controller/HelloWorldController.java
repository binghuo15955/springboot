package net.dfrz.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.dfrz.entity.Student;
import net.dfrz.service.StudentServiceI;

@RestController
@RequestMapping("/student")
public class HelloWorldController {
	
	@Autowired
	private StudentServiceI studentService;
	
	@RequestMapping("/add")
	public String add(Student student) {
		System.err.println("=>进入controller");
		student.setStuID(UUID.randomUUID().toString().replaceAll("-", ""));
		student.setBirthday(new Date());
		student.setName("SpringBoot成功插入！");
		student.setSex("女");
		int row = studentService.addStudent(student);
		if(row>0) {
			return "success";
		}
		return "failed";
		
	}
	
}
