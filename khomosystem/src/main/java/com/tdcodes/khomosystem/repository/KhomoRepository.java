package com.tdcodes.khomosystem.repository;

import com.tdcodes.khomosystem.model.Khomo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface KhomoRepository extends JpaRepository<Khomo,Integer> {
}
