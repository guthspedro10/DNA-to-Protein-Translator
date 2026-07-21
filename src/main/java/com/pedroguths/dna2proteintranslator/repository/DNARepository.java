package com.pedroguths.dna2proteintranslator.repository;

import com.pedroguths.dna2proteintranslator.model.DNAModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DNARepository extends JpaRepository<DNAModel, Long> {
}
