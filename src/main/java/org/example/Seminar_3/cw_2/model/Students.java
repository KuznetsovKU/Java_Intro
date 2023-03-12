package org.example.Seminar_3.cw_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Students {
    private String surname;
    private int groupNum;
    private double scholarship;
    private List<Integer> evaluations;
}
