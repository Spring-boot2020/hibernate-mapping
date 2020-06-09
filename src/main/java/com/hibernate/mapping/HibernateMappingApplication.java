package com.hibernate.mapping;

import com.hibernate.mapping.model.Laptop;
import com.hibernate.mapping.model.Student;
import com.hibernate.mapping.repository.LaptopRepository;
import com.hibernate.mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMappingApplication implements CommandLineRunner {

  @Autowired
  StudentRepository studentRepository;
  @Autowired
  LaptopRepository laptopRepository;
  public static void main(String[] args) {
    SpringApplication.run(HibernateMappingApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Laptop l=new Laptop();
    l.setLid(101);
    l.setLName("Dell");
    laptopRepository.save(l);
    Student s=new Student();
    s.setSid(1);
    s.setName("Tribhuwan");
    s.setLaptop(l);
    studentRepository.save(s);

  }
}
