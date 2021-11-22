package ru.home.autosalon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.autosalon.models.Cars;
import ru.home.autosalon.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Cars> getAll(){
        return carRepository.findAll();
    }

    public Cars getById(Long id){
        return carRepository.getById(id);
    }

    public Cars create(Cars sold){
        return carRepository.save(sold);
    }

    public void delete(Long id){
        carRepository.deleteById(id);
    }
}
