package ru.home.autosalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.autosalon.models.Cars;

public interface CarRepository extends JpaRepository<Cars, Long> {

}
