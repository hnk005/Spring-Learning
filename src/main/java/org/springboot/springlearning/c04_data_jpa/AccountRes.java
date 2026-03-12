package org.springboot.springlearning.c04_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRes extends JpaRepository<Account, Integer> {
}
