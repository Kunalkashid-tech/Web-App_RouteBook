package com.example.approutebookwebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.RouteMatcher.Route;

import com.example.approutebookwebsite.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
