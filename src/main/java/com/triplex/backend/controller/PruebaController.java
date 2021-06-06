package com.triplex.backend.controller;

import com.triplex.backend.bo.Prueba;
import com.triplex.backend.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value="/prueba", produces = { "application/json" })
public class PruebaController {

    @Autowired
    private final PruebaService service;

    public PruebaController(PruebaService service) {
        this.service = service;
    }

    public PruebaService getService() {return service;}


    @GetMapping(path = "/getById")
    @ResponseBody
    public Prueba getPruebaById(@RequestParam Long id){
        Prueba obj = service.getPruebaById(id);
        return obj;
    }
}
