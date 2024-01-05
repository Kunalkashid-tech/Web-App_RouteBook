package com.example.approutebookwebsite.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import org.springframework.data.annotation.Id;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double distance;
    private String startLocation;
    private String endLocation;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private List<Waypoint> waypoints;

    @ManyToMany
    @JoinTable(
      name = "user_route", 
      joinColumns = @JoinColumn(name = "route_id"),  
      inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users;
    

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private List<Comment> comments;

    public Route() {}
    
	public Route(Long id, String name, double distance, String startLocation, String endLocation,
			List<Waypoint> waypoints, List<User> users, List<Comment> comments) {
		super();
		this.id = id;
		this.name = name;
		this.distance = distance;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.waypoints = waypoints;
		this.users = users;
		this.comments = comments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public List<Waypoint> getWaypoints() {
		return waypoints;
	}

	public void setWaypoints(List<Waypoint> waypoints) {
		this.waypoints = waypoints;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Route [id=" + id + ", name=" + name + ", distance=" + distance + ", startLocation=" + startLocation
				+ ", endLocation=" + endLocation + ", waypoints=" + waypoints + ", users=" + users + ", comments="
				+ comments + "]";
	}

    // Constructors, getters, setters, etc.
}
