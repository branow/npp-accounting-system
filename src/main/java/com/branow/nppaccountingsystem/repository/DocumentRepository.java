package com.branow.nppaccountingsystem.repository;

import com.branow.nppaccountingsystem.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Integer> {
}
