package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.MuseumForWork;
import com.example.demo.entities.MuseumForWorkPK;

@Repository
public interface MuseumForWorkInterface extends JpaRepository<MuseumForWork, MuseumForWorkPK>{

}
