package com.example.tourapi.controller;

import com.example.tourapi.entity.TourPackage;
import com.example.tourapi.exception.ResourceNotFoundException;
import com.example.tourapi.service.TourPackageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
public class TourPackageController {

    private final TourPackageService service;

    public TourPackageController(TourPackageService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TourPackage> createTour(@RequestBody TourPackage tourPackage) {
        return ResponseEntity.ok(service.createTour(tourPackage));
    }

    @GetMapping
    public ResponseEntity<List<TourPackage>> getAllTours() {
        return ResponseEntity.ok(service.getAllTours());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TourPackage> getTourById(@PathVariable Long id) {
        TourPackage tour = service.getTourById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Tour not found"));
        return ResponseEntity.ok(tour);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TourPackage> updateTour(@PathVariable Long id, @RequestBody TourPackage updatedTour) {
        return ResponseEntity.ok(service.updateTour(id, updatedTour));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTour(@PathVariable Long id) {
        service.deleteTour(id);
        return ResponseEntity.noContent().build();
    }
}
