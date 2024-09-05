package com.example.tourism.service;

import com.example.tourism.model.TouristAttraction;
import com.example.tourism.repository.TourismRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    private TourismRepository tr;

    public TouristService(TourismRepository tr) {
        this.tr = tr;
    }

    /*///////////////////CRUD///////////////////////*/
    public void deleteAttraction(TouristAttraction ta) {
        tr.deleteAttraction(ta);
    }
    public TouristAttraction addAttraction(TouristAttraction ta) {
        return tr.addAttraction(ta);
    }
    public List<TouristAttraction> getListOfAttractions() {
        return tr.getListOfAttractions();
    }
    public TouristAttraction getSpecificTouristAttraction(String name) {
        return tr.getSpecificTouristAttraction(name);
    }


//    public TouristAttraction updateTouristAttractionName() {
//        //TODO: ?requestParam value = newName? Eller bare give den et nyt navn med. Samme test af POST request som getSpecificTouristAttraction()
//    }
}
