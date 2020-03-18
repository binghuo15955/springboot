package net.dfrz.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.dfrz.entity.Student;
import net.dfrz.mapper.studentMapper;
import net.dfrz.service.StudentServiceI;

@Service("studentService")
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private studentMapper studentMapper;

	@Override
	public int addStudent(Student student) {
		System.err.println("=>进入Service");
		return studentMapper.insert(student);
	}

}
