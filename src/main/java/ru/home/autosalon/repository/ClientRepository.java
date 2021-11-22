package ru.home.autosalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.autosalon.models.Clients;

public interface ClientRepository extends JpaRepository<Clients, Long> {

}
