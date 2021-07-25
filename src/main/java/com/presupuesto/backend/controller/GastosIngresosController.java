package com.presupuesto.backend.controller;

import com.presupuesto.backend.bo.GastosIngresos;
import com.presupuesto.backend.bo.Presupuesto;
import com.presupuesto.backend.service.GastosIngresosService;
import com.presupuesto.backend.service.PresupuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value="/gastosIngresos", produces = { "application/json" })
public class GastosIngresosController {

    @Autowired
    private final GastosIngresosService service;

    public GastosIngresosController(GastosIngresosService service) {
        this.service = service;
    }

    public GastosIngresosService getService() {return service;}

    @GetMapping
    @ResponseBody
    public List<GastosIngresos> getAll(){
        List<GastosIngresos> lst = service.getAll();
        return lst;
    }

    @GetMapping(path = "/getById")
    @ResponseBody
    public GastosIngresos getPresupuestoById(@RequestParam Long id){
        GastosIngresos obj = service.getGastosIngresosById(id);
        return obj;
    }

    @GetMapping(path = "/getByIdPresupuesto")
    @ResponseBody
    public List<GastosIngresos> getByIdPresupuesto(@RequestParam Long idPresupuesto){
        List<GastosIngresos> lst = service.getByIdPresupuesto(idPresupuesto);
        return lst;
    }

    @PostMapping
    @ResponseBody
    public GastosIngresos create(@RequestBody GastosIngresos gastosIngresos){
        GastosIngresos obj = service.create(gastosIngresos);
        return obj;
    }

    @PutMapping
    @ResponseBody
    public GastosIngresos update(@RequestBody GastosIngresos gastosIngresos){
        GastosIngresos obj = service.create(gastosIngresos);
        return obj;
    }

    @GetMapping("deleteById")
    @ResponseBody
    public List<GastosIngresos> delete(@RequestParam Long id, @RequestParam Long idPresupuesto){
        return service.delete(id, idPresupuesto);
    }
}
