package com.hibernate.mapping.repository;

import com.hibernate.mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
