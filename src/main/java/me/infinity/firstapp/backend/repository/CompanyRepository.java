package me.infinity.firstapp.backend.repository;

import me.infinity.firstapp.backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
