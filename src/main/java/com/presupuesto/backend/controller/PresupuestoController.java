package com.presupuesto.backend.controller;

import com.presupuesto.backend.bo.Presupuesto;
import com.presupuesto.backend.service.PresupuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value="/presupuesto", produces = { "application/json" })
public class PresupuestoController {

    @Autowired
    private final PresupuestoService service;

    public PresupuestoController(PresupuestoService service) {
        this.service = service;
    }

    public PresupuestoService getService() {return service;}

    @GetMapping
    @ResponseBody
    public List<Presupuesto> getAll(){
        List<Presupuesto> lst = service.getAll();
        return lst;
    }

    @GetMapping(path = "/getById")
    @ResponseBody
    public Presupuesto getPresupuestoById(@RequestParam Long id){
        Presupuesto obj = service.getPresupuestoById(id);
        return obj;
    }

    @PostMapping
    @ResponseBody
    public Presupuesto create(@RequestBody Presupuesto presupuesto){
        Presupuesto obj = service.create(presupuesto);
        return obj;
    }

    @PutMapping
    @ResponseBody
    public Presupuesto update(@RequestBody Presupuesto presupuesto){
        Presupuesto obj = service.create(presupuesto);
        return obj;
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        service.delete(id);
    }
}
