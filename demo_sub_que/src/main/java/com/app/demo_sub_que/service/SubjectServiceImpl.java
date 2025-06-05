package com.app.demo_sub_que.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo_sub_que.entity.Subject;
import com.app.demo_sub_que.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public List<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}

}
