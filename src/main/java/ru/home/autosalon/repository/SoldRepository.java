package ru.home.autosalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.home.autosalon.models.SoldCars;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SoldRepository extends JpaRepository<SoldCars, Long> {

    @Query("select sum(price) from SoldCars where date_buy BETWEEN :from and :to")
    Long countPriceInDate(LocalDate from, LocalDate to);

    @Query(value = "select client.fio as num, client.phone as phone, sold.price, sold.date_buy, car.name, sold.count\n" +
            "from sold_cars sold\n" +
            "join clients client on client.id = sold.client_id\n" +
            "join cars car on car.id = sold.car_id\n" +
            "order by sold.date_buy, client.fio, sold.price", nativeQuery = true)
    List<Object[]> findAllByOrder();

}
