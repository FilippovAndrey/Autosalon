package ru.home.autosalon.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ResponseOrders {
    private String fio;
    private String phone;
    private Long price;
    private LocalDate date_buy;
    private String name;
    private Integer count;
}
