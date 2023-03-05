package com.example.jpa.domain.repository;

import com.example.jpa.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "select * from students where name = :name", nativeQuery = true)
    Optional<Student> findByNameWhereNameEquals(String name);

    List<Student> findAllByNameStartingWith(String prefix);
}
