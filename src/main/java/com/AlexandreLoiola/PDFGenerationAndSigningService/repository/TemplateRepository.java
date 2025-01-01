package com.AlexandreLoiola.PDFGenerationAndSigningService.repository;

import com.AlexandreLoiola.PDFGenerationAndSigningService.model.TemplateModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TemplateRepository extends JpaRepository<TemplateModel, UUID> {
}