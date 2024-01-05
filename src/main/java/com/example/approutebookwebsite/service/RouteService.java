package com.example.approutebookwebsite.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.approutebookwebsite.entities.Route;
import com.example.approutebookwebsite.entities.Waypoint;
import com.example.approutebookwebsite.repository.RouteRepository;


@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Route getRouteById(Long id) {
        return routeRepository.findById(id).orElse(null);
    }

    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    // Other CRUD operations for Route

    public List<Waypoint> getWaypointsForRoute(Long id) {
        Route route = getRouteById(id);
        return (route != null) ? route.getWaypoints() : new ArrayList<>();
    }
}