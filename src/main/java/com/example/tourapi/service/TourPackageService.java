package com.example.tourapi.service;

import com.example.tourapi.entity.TourPackage;
import com.example.tourapi.repository.TourPackageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourPackageService {

    private final TourPackageRepository repository;

    public TourPackageService(TourPackageRepository repository) {
        this.repository = repository;
    }

    public TourPackage createTour(TourPackage tourPackage) {
        return repository.save(tourPackage);
    }

    public List<TourPackage> getAllTours() {
        return repository.findAll();
    }

    public Optional<TourPackage> getTourById(Long id) {
        return repository.findById(id);
    }

    public TourPackage updateTour(Long id, TourPackage updatedTour) {
        return repository.findById(id).map(existingTour -> {
            existingTour.setImage(updatedTour.getImage());
            existingTour.setTitle(updatedTour.getTitle());
            existingTour.setDescription(updatedTour.getDescription());
            existingTour.setPrice(updatedTour.getPrice());
            existingTour.setLocation(updatedTour.getLocation());
            existingTour.setDiscountInPercentage(updatedTour.getDiscountInPercentage());
            return repository.save(existingTour);
        }).orElseThrow(() -> new RuntimeException("Tour not found"));
    }

    public void deleteTour(Long id) {
        repository.deleteById(id);
    }
}
