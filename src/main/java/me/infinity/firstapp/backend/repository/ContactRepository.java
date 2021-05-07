package me.infinity.firstapp.backend.repository;

import me.infinity.firstapp.backend.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
