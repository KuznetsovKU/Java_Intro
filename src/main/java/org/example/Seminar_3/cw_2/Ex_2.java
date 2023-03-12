package org.example.Seminar_3.cw_2;

import org.example.Seminar_3.cw_2.model.Students;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
 *    Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */
public class Ex_2 {
    public static void main(String[] args) {
        Students student1 = new Students("Иванова", 2, 237, List.of(6, 4, 5));
        Students student2 = new Students("Машков", 2, 234, List.of(3, 4, 5));
        Students student3 = new Students("Котлова", 2, 234, List.of(3, 4, 5));
        Students student4 = new Students("Михин", 2, 234, List.of(3, 4, 5));
        Students student5 = new Students("Алексеев", 2, 234, List.of(3, 4, 5));

        List<Students> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);

        for (Students el : listStudents) {
            double evaluationSum = 0;
            for (double ev : el.getEvaluations()) {
                evaluationSum += ev;
            }
            if (el.getSurname().endsWith("ова") && evaluationSum % 2 == 0) {
                System.out.println(el.getScholarship());
            }
        }
    }
}
