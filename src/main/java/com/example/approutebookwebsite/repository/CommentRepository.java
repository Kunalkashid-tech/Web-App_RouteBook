package com.example.approutebookwebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.approutebookwebsite.entities.Comment;
import com.example.approutebookwebsite.entities.User;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
