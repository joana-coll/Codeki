package codeki.flightapi.controller;

import codeki.flightapi.model.Flight;
import codeki.flightapi.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    // -----------  DEPENDENCY INJECTION  ------------
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }


    // ---------------  CRUD METHODS  ----------------
    @PostMapping("/add")
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @GetMapping("")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Optional<Flight> getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @PutMapping("/update")
    public Optional<Flight> updateFlight(@RequestBody Flight flight) {
        return flightService.updateFlight(flight);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlightById(@PathVariable Long id) {
        flightService.deleteFlightById(id);
    }


    // ---------------  OTHER METHODS  ---------------

    @GetMapping("/origin")
    public List<Flight> getFlightByOrigin(@RequestParam String origin) {
        return flightService.getFlightByOrigin(origin);
    }

    @GetMapping("/locations")
    public List<Flight> getFlightsByLocations(@RequestParam String origin, @RequestParam String destiny) {
        return flightService.getFlightsByLocations(origin, destiny);
    }

    @GetMapping("/offers")
    public List<Flight> getOffers() {
        int offerPrice = 20000;
        return flightService.getOffers(offerPrice);
    }

    @GetMapping("/offers2")
    public List<Flight> getOffers2(@RequestParam double offerPrice) {
        return flightService.getOffers2(offerPrice);
    }
}