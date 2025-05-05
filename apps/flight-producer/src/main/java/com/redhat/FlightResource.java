package com.redhat;

import java.util.Map;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/flight")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FlightResource {

    @Inject
    @Channel("flights")
    Emitter<String> emitter;

    @Inject
    ObjectMapper objectMapper;
    
    @POST
    public Response publishFlight() throws JsonProcessingException {

        Map<String, Flight> flights = FlightExamples.generateSampleFlights();

        
        for (Flight flight : flights.values()) {

            System.out.println("Enviando voo: " + flight.getFlightNumber());

            emitter.send(objectMapper.writeValueAsString(flight));
        }

        return Response.status(Response.Status.OK).build();
    }
}