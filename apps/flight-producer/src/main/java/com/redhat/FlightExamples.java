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
        flights.put("LAT3010", new Flight("LAT3010", "DELAYED", LocalDateTime.now().toString(), "GRU", "MAO", "F1"));
        flights.put("G31020", new Flight("G31020", "ON_TIME", LocalDateTime.now().toString(), "GIG", "VIX", "G6"));
        flights.put("AZ1010", new Flight("AZ1010", "CANCELLED", LocalDateTime.now().toString(), "CNF", "CGH", "H3"));
        flights.put("TAM9090", new Flight("TAM9090", "ON_TIME", LocalDateTime.now().toString(), "BSB", "MCZ", "B2"));
        flights.put("GOL2222", new Flight("GOL2222", "BOARDING", LocalDateTime.now().toString(), "CWB", "POA", "D5"));
        flights.put("JJ4012", new Flight("JJ4012", "ON_TIME", LocalDateTime.now().toString(), "GYN", "GRU", "C1"));
        flights.put("LA8901", new Flight("LA8901", "DELAYED", LocalDateTime.now().toString(), "REC", "GIG", "A7"));
        flights.put("GOL7070", new Flight("GOL7070", "CANCELLED", LocalDateTime.now().toString(), "BEL", "MAO", "F3"));
        flights.put("AZ5500", new Flight("AZ5500", "ON_TIME", LocalDateTime.now().toString(), "FOR", "GRU", "E8"));
        flights.put("JJ3030", new Flight("JJ3030", "BOARDING", LocalDateTime.now().toString(), "SLZ", "BSB", "G1"));

        return flights;
    }
}
