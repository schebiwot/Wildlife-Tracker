package ke.co.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WildlifeTracker {
    private Map<Integer, Animal> animals = new HashMap<>();
    private Map<Integer, EndangeredAnimal> endangeredAnimals = new HashMap<>();
    private List<Sighting> sightings = new ArrayList<>();

  
    public void reportSighting(Sighting sighting) {
        if (!animals.containsKey(sighting.speciesId) && !endangeredAnimals.containsKey(sighting.speciesId)) {
            throw new IllegalArgumentException("Invalid species ID in sighting");
        }

        // sighting timestamp
        sighting.timestamp = System.currentTimeMillis();

        sightings.add(sighting);
    }
}