//creates a package repository, hosts all khomoRepository related files.

package com.tdcodes.khomosystem.repository;

//imports from maven
import com.tdcodes.khomosystem.model.Khomo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//create and interface khomoRepository that inherits from JpaRepository
public interface KhomoRepository extends JpaRepository<Khomo,Integer> {
}
