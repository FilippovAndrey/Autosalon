package ru.home.autosalon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.home.autosalon.models.Cars;
import ru.home.autosalon.services.CarService;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Cars> getAll(){
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Cars getById(@PathVariable Long id){
        return carService.getById(id);
    }

    @PostMapping
    public Cars create(@RequestBody Cars car){
        return carService.create(car);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        carService.delete(id);
    }

}
