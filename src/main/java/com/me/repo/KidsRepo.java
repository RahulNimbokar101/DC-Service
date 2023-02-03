package com.me.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.entity.Kids;

public interface KidsRepo extends JpaRepository<Kids, Serializable>{

}
