package com.example.approutebookwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.approutebookwebsite.entities.Route;
import com.example.approutebookwebsite.entities.Waypoint;
import com.example.approutebookwebsite.service.RouteService;

@RestController
@RequestMapping("/api/routes")
public class RouteController {

    @Autowired
    private RouteService routeService;
/*
    @GetMapping("/route")
	public String route() {
		System.out.println("Welcome in route.html controller");
		return "html/route";
	}
  */  
    @GetMapping
    public List<Route> getAllRoutes() {
        return routeService.getAllRoutes();
    }
/*
    @GetMapping("/{id}")
    public Route getRouteById(@PathVariable Long id) {
        return routeService.getRouteById(id);
    }
*/
    @GetMapping("/{id}")
    public Route getRouteById(@PathVariable Long id) {
        Route route = routeService.getRouteById(id);
        if (route != null) {
            // Include waypoints for the map
            route.setWaypoints(routeService.getWaypointsForRoute(id));
        }
        return route;
    }
    
    
    @PostMapping
    public Route createRoute(@RequestBody Route route) {
        return routeService.createRoute(route);
    }

    // Other CRUD operations for Route

    @GetMapping("/{id}/waypoints")
    public List<Waypoint> getWaypointsForRoute(@PathVariable Long id) {
        return routeService.getWaypointsForRoute(id);
    }
}