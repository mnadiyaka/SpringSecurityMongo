package com.example.demo;

import com.example.demo.model.entity.Role;
import com.example.demo.model.entity.Student;
import com.example.demo.model.entity.User;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repo/*, MongoTemplate mongoTemplate*/) {
		return args -> {
//			List<User> users = List.of(
//					new User(1, "linda", passwordEncoder().encode("pass"), Role.ADMIN.getGrantedAuthorities()),
//					new User(2, "anna", passwordEncoder().encode("pass"), Role.STUDENT.getGrantedAuthorities()),
//					new User(3, "tom", passwordEncoder().encode("pass"), Role.ADMINTRAINEE.getGrantedAuthorities())
//			);
//			repo.insert(users);

//			Query query = new Query();
//			query.addCriteria(Criteria.where("name").is("name1"));
//			List<Student> st = mongoTemplate.find(query, Student.class);
//			System.out.println(st);
//			System.out.println(repo.findStudentByName("name2"));
		};

	}


	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
	}
}
