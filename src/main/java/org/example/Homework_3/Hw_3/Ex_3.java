package org.example.Homework_3.Hw_3;

import org.example.Homework_3.Hw_3.model.Books;

import java.util.ArrayList;
import java.util.List;

import static org.example.Homework_2.hw_1.Ex_1.isSimple;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */
public class Ex_3 {
    public static void main(String[] args) {
        Books book1 = new Books("книга_1", "Кинг", 17.99, 2000, 100);
        Books book2 = new Books("книга_2", "Дюма", 17.99, 2010, 17);
        Books book3 = new Books("книга_3", "Роулинг", 17.99, 2020, 7);
        Books book4 = new Books("книга_4", "Алексеев", 17.99, 2009, 100);
        Books book5 = new Books("книга_5", "Антонов", 17.99, 2021, 17);

        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);

        System.out.println(findSpecialBooks(booksList, 2010, "А"));
    }

    /**
     * Модуль поиска книги по параметрам (+ простое количество страниц)
     *
     * @param inputList      - список всех книг
     * @param year           - минимальный год издания
     * @param include - символы, содержащиеся в фамилии автора
     * @return - список книг, удовлетворяющих условиям
     */
    private static List<String> findSpecialBooks(List<Books> inputList, int year, String include) {
        List<String> result = new ArrayList<>();
        for (Books el : inputList) {
            if (el.getYear() >= year && isSimple(el.getPages()) &&
                    el.getAuthor().toLowerCase().contains(include.toLowerCase())) {
                result.add(el.getName());
            }
        }
        return result;
    }


}
