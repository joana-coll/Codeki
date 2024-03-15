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
    @PostMapping("/create")
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @GetMapping("")
    public List<Flight> readAllFlights() {
        return flightService.readAllFlights();
    }

    @GetMapping("/{id}")
    public Optional<Flight> readFlightById(@PathVariable("id")  Long id) {
        return flightService.readFlightById(id);
    }

    @PutMapping("/update")
    public Optional<Flight> updateFlight(@RequestBody Flight flight) {
        return flightService.updateFlight(flight);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlightById(@PathVariable("id") Long id) {
        flightService.deleteFlightById(id);
    }


    // ---------------  OTHER METHODS  ---------------

    @GetMapping("/origin")
    public List<Flight> readByOrigin(@RequestParam String origin) {
        return flightService.readByOrigin(origin);
    }

    @GetMapping("/locations")
    public List<Flight> readByOriginAndDestiny(@RequestParam String origin, @RequestParam String destiny) {
        return flightService.readByOriginAndDestiny(origin, destiny);
    }

    @GetMapping("/offers")
    public List<Flight> readOffers() {
        int offerPrice = 20000;
        return flightService.readOffers(offerPrice);
    }

}