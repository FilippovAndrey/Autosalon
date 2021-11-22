package ru.home.autosalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.autosalon.models.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
