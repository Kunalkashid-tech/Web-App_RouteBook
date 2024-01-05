package com.example.approutebookwebsite.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;


@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    public Comment() {}
    
	public Comment(Long id, String text, LocalDateTime timestamp, Route route) {
		super();
		this.id = id;
		this.text = text;
		this.timestamp = timestamp;
		this.route = route;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", timestamp=" + timestamp + ", route=" + route + "]";
	}

    // Constructors, getters, setters, etc.
}