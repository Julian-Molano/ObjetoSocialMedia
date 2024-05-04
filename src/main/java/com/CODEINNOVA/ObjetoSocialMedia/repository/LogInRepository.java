package com.CODEINNOVA.ObjetoSocialMedia.repository;

import com.CODEINNOVA.ObjetoSocialMedia.entities.LogIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogInRepository extends JpaRepository <LogIn, String> {
}
