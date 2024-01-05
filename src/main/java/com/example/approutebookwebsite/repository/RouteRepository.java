package com.example.approutebookwebsite.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.approutebookwebsite.entities.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

	//List<Route> findByUsername(String username);

}
