package com.springs.controller.studentcontroller.services.DAO.interfac.copy;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springs.model.students.StudentsObjects;
@Component
public interface StudentsDAO {
	public List<StudentsObjects> getStudentsDetails();
	public void saveStudent(StudentsObjects students);
}