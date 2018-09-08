package com.springs.controller.studentcontroller.services.DAO.interfac;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springs.model.StudentsObjects;
@Component
public interface StudentsDAO {
	public List<StudentsObjects> getStudentsDetails();
	public void saveStudent(StudentsObjects students);
}
