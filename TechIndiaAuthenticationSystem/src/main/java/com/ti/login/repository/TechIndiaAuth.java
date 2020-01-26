package com.ti.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ti.login.entity.TechIndiaEntity;

@Repository
public interface TechIndiaAuth extends JpaRepository<TechIndiaEntity, Integer>{

TechIndiaEntity findByuserName(String username);

}
