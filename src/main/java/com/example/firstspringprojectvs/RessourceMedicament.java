package com.example.firstspringprojectvs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/service")
public class RessourceMedicament {

    @Autowired
    IMedicamentRepository iMedicamentRepository;

    @Path("/medicaments")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Medicament> getAll(){
        return iMedicamentRepository.findAll();
    } 
}
