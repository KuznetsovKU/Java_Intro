package org.example.Homework_3.Hw_3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {
    private String name;
    private String author;
    private Double prise;
    private Integer year;
    private Integer pages;
}
