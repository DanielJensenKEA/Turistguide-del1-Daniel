package com.example.tourism.controller;

import com.example.tourism.model.TouristAttraction;
import com.example.tourism.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/attractions")
public class TouristController {
    private final TouristService ts;

    public TouristController(TouristService ts) {
        this.ts = ts;
    }
    @GetMapping("")
    public ResponseEntity<List<TouristAttraction>> getAllAttractions() {
        List<TouristAttraction> attractions = ts.getListOfAttractions();
        return new ResponseEntity<>(attractions, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<TouristAttraction> getSpecificTouristAttraction(@PathVariable String name) {
        TouristAttraction ta = ts.getSpecificTouristAttraction(name);
        if(ta != null) {
            return new ResponseEntity<>(ta, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addTouristAttraction(@RequestBody TouristAttraction touristAttraction) {
        TouristAttraction ta = ts.addAttraction(touristAttraction);
        return new ResponseEntity<>(ta, HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<TouristAttraction> updateTouristAttractionName(@RequestBody TouristAttraction touristAttraction) {
        TouristAttraction ta = ts.updateTouristAttractionName();

    }



}
