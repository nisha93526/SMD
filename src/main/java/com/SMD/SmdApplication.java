package com.SMD;

import com.SMD.Entity.Student;
import com.SMD.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmdApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmdApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

Student student1 = new Student(1,"Ramesh","suresh","nisha12@gmail.com");
studentRepository.save(student1);
		Student student2 = new Student(2,"kamla","vimla","zdjkfd12@gmail.com");
		studentRepository.save(student2);
		Student student3 = new Student(3,"rina","sharma","ashsdjk12@gmail.com");
		studentRepository.save(student3);
		Student student4 = new Student(4,"shuku","verma","wjhsd9@gmail.com");
		studentRepository.save(student4);
		Student student5 = new Student(5,"opi","nirawa","sjs00@gmail.com");
		studentRepository.save(student5);
		Student student6 = new Student(6,"karan","bunto","akjskjd54@gmail.com");
		studentRepository.save(student5);





	}
}
