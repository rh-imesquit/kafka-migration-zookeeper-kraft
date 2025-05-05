package com.redhat;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class FlightExamples {
    
        public static Map<String, Flight> generateSampleFlights() {
        Map<String, Flight> flights = new HashMap<>();

        flights.put("JJ1001", new Flight("JJ1001", "ON_TIME", LocalDateTime.now().toString(), "GRU", "GIG", "A1"));
        flights.put("LA2020", new Flight("LA2020", "DELAYED", LocalDateTime.now().toString(), "BSB", "REC", "B5"));
        flights.put("AZ3303", new Flight("AZ3303", "CANCELLED", LocalDateTime.now().toString(),"CGH", "CNF", "C8"));
        flights.put("GOL4040", new Flight("GOL4040", "ON_TIME", LocalDateTime.now().toString(), "POA", "GRU", "D2"));
        flights.put("AZ7890", new Flight("AZ7890", "BOARDING", LocalDateTime.now().toString(), "SSA", "FOR", "E4"));

        return flights;
    }
}
