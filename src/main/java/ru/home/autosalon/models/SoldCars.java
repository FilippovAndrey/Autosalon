package ru.home.autosalon.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class SoldCars implements Persistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Cars car;
    @OneToOne
    private Clients client;
    private Long price;
    private int count;
    @OneToOne
    private Owner owner;
    @CreatedDate
    private LocalDate date_buy = LocalDate.now();

    @Override
    @JsonIgnore
    @Transient
    public boolean isNew() {
        return id == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SoldCars soldCars = (SoldCars) o;
        return id != null && Objects.equals(id, soldCars.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
