package com.CODEINNOVA.ObjetoSocialMedia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LogInRepository extends JpaRepository<LogIn, Long> {
}
