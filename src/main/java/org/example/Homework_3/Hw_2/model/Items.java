package org.example.Homework_3.Hw_2.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private String country;
    private Double weight;
    private Double prise;
    private Integer variety;
}
