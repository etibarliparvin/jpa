package com.example.jpa.domain.repository;

import com.example.jpa.domain.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {

    List<PhoneNumber> findAllByStudent_Id(Long id);
}
