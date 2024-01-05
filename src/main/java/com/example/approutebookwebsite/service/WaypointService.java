package com.example.approutebookwebsite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.approutebookwebsite.entities.Waypoint;
import com.example.approutebookwebsite.repository.WaypointRepository;

@Service
public class WaypointService {

    @Autowired
    private WaypointRepository waypointRepository;

    public Waypoint createWaypoint(Waypoint waypoint) {
        return waypointRepository.save(waypoint);
    }

    // Other CRUD operations for Waypoint
}
