package com.springs.controller.studentcontroller.services.DAO.interfac.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springs.controller.studentcontroller.services.DAO.interfac.StudentsDAO;
import com.springs.model.students.StudentsObjects;

@Repository
public class StudentServiceDAOImpl implements StudentsDAO {
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<StudentsObjects> getStudentsDetails() {
		// Get the current hibernate session
		Session currentsession = sessionFactory.getCurrentSession();
		//Create a Query
		Query<StudentsObjects> query = currentsession.createQuery("from students_user",StudentsObjects.class);
		//get the result list
		List<StudentsObjects> result = query.getResultList();
		return result;
	}

	@Override
	@Transactional
	public void saveStudent(StudentsObjects students) {
		// Get the current hibernate session
		Session currentsession = sessionFactory.getCurrentSession();
		currentsession.save(students);
		
	}

}
