package codeki.flightapi.repository;

import codeki.flightapi.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> getFlightByOrigin(String origin);
    List<Flight> getFlightsByLocations(String origin, String destiny);

}