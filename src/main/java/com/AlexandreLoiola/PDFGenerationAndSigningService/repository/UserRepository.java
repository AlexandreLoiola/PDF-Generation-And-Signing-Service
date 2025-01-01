package com.AlexandreLoiola.PDFGenerationAndSigningService.repository;

import com.AlexandreLoiola.PDFGenerationAndSigningService.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
}