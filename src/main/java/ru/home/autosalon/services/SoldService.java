package ru.home.autosalon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.autosalon.models.SoldCars;
import ru.home.autosalon.repository.SoldRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class SoldService {

    private final SoldRepository soldRepository;

    @Autowired
    public SoldService(SoldRepository soldRepository) {
        this.soldRepository = soldRepository;
    }

    public List<SoldCars> getAll(){
        return soldRepository.findAll();
    }

    public SoldCars getById(Long id){
        return soldRepository.findById(id).orElse(null);
    }

    public SoldCars create(SoldCars sold){
        return soldRepository.save(sold);
    }

    public void delete(Long id){
        soldRepository.deleteById(id);
    }

    public Long getSumInPrice(LocalDate from, LocalDate to){
        return soldRepository.countPriceInDate(from, to);
    }

    public List<Object[]> findAllByOrder(){
        return soldRepository.findAllByOrder();
    }
}
