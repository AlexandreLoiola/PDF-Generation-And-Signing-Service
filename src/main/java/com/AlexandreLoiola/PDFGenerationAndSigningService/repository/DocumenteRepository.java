package com.AlexandreLoiola.PDFGenerationAndSigningService.repository;

import com.AlexandreLoiola.PDFGenerationAndSigningService.model.DocumentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DocumenteRepository extends JpaRepository<DocumentModel, UUID> {
}