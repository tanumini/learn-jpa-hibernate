package com.tanaz.springboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tanaz.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepository;
import com.tanaz.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;
import com.tanaz.springboot.learnjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;



@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;
	public void run(String... args) throws Exception {
	repository.save(new Course(1,"Learn Jpa","Tanaz"));
	repository.save(new Course(2,"Learn Python","Mehnaz"));
	repository.save(new Course(3,"Learn Spring Boot","shehnaz"));
	repository.deleteById(2l);
	System.out.println(repository.findById(1l));
	System.out.println(repository.findById(3l));
	System.out.println(repository.findAll());
	System.out.println(repository.count());
	System.out.println((repository.findByAuthor("Tanaz")));
	}
	

}
