package com.example.approutebookwebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.approutebookwebsite.entities.Waypoint;
import com.example.approutebookwebsite.service.WaypointService;

@RestController
@RequestMapping("/api/waypoints")
public class WaypointController {

    @Autowired
    private WaypointService waypointService;

    @PostMapping
    public Waypoint createWaypoint(@RequestBody Waypoint waypoint) {
        return waypointService.createWaypoint(waypoint);
    }

    // Other CRUD operations for Waypoint
}