package ru.home.autosalon.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.home.autosalon.models.SoldCars;
import ru.home.autosalon.services.SoldService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/sold")
@Slf4j
public class SoldController {

    private final SoldService soldService;
    @Autowired
    public SoldController(SoldService soldService) {
        this.soldService = soldService;
    }

    @GetMapping
    public List<SoldCars> getAll(){
        List<SoldCars> models = soldService.getAll();
        log.info("Get all contracts: {}", models);
        return models;
    }

    @GetMapping("/{id}")
    public SoldCars getContr(@PathVariable Long id){
        SoldCars contract = soldService.getById(id);
        log.info("Get contract by id {}: {}", id, contract);
        return contract;
    }

    @PostMapping
    public SoldCars postContr(@RequestBody SoldCars model) {
        log.info("Post contract in BD: {}", model);
        return soldService.create(model);
    }

    @DeleteMapping("/{id}")
    public void deleteContr(@PathVariable Long id){
        soldService.delete(id);
    }

    @GetMapping("/count")
    public String getCount(
            @RequestParam(required = false) String to,
            @RequestParam(required = false) String from) {
        log.info("Date to: {}", to);
        log.info("Date from: {}", from);
        return "Sum for days " + from + " - " + to + " : " + soldService.getSumInPrice(LocalDate.parse(from), LocalDate.parse(to));
    }

    @GetMapping("/orders")
    public List<Object[]> findAllOrders(){
        return soldService.findAllByOrder();
    }
}
