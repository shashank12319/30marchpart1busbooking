
package com.wittybrains.busbookingsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wittybrains.busbookingsystem.dto.StationDTO;

import com.wittybrains.busbookingsystem.service.StationService;


	
	@RestController
	@RequestMapping("/stations")
	public class StationController {
		@Autowired
	    private StationService stationService;
	    
	    @PostMapping
	    public ResponseEntity<List<StationDTO>> createStations(@RequestBody List<StationDTO> stationList) {
	        List<StationDTO> createdStations = stationService.createStations(stationList);
	        return ResponseEntity.ok().body(createdStations);
	    }
	}


