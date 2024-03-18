package codeki.flightapi.service;

import codeki.flightapi.model.Flight;
import codeki.flightapi.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    // -----------  DEPENDENCY INJECTION  ------------
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }


    // ------------------  METHODS  ------------------

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Optional<Flight> getFlightById(Long id) {
        return flightRepository.findById(id);
    }

    public Optional<Flight> updateFlight(Flight flight) {
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId());
    }

    public void deleteFlightById(Long id) {
        flightRepository.deleteById(id);
    }

    public List<Flight> getFlightByOrigin(String origin) {
        return flightRepository.getFlightByOrigin(origin);
    }

    public List<Flight> getFlightsByLocations(String origin, String destiny) {
        return flightRepository.getFlightsByLocations(origin, destiny);
    }

    public List<Flight> getOffers(Integer offerPrice) {
        List<Flight> flights = flightRepository.findAll();
        List<Flight> offersFlight = new ArrayList<>();

        for(Flight flight : flights) {
            if(flight.getPrice() < offerPrice) {
                offersFlight.add(flight);
            }
        }
        return offersFlight;
    }

    public List<Flight> getOffers2(double offerPrice) {
        List<Flight> flights = flightRepository.findAll();
        return flights.stream()
                .filter(flight -> flight.getPrice() < offerPrice)
                .collect(Collectors.toList());
    }

}