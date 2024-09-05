package com.example.tourism.repository;

import com.example.tourism.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TourismRepository {
    private List<TouristAttraction> attractions;

    public TourismRepository() {
        attractions = new ArrayList<>();
        populateAttractions();
    }


    public void populateAttractions() {
        attractions.add(new TouristAttraction("Tivoli", "Beskrivelse af Tivoli"));
        attractions.add(new TouristAttraction("Bakken", "Beskrivelse af Bakken"));
        attractions.add(new TouristAttraction("Børsen", "Beskrivelse af Børsen"));
    }

    /*///////////////////CRUD///////////////////////*/
    public void deleteAttraction(TouristAttraction ta) {
        attractions.remove(ta);
    }
    public TouristAttraction addAttraction(TouristAttraction ta) {
        attractions.add(ta);
        return ta;
    }
    public List<TouristAttraction> getListOfAttractions() {
        return attractions;
    }



    public TouristAttraction getSpecificTouristAttraction(String name) {
        for (TouristAttraction ta : attractions) {
//            if (ta.getName().equals(name)) {
//                return ta;
//            }
            if (ta.getName().equalsIgnoreCase(name)) {
                return ta;
            }
        }
        return null;
    }
}
