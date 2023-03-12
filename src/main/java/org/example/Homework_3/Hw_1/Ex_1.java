package org.example.Homework_3.Hw_1;

import org.example.Homework_3.Hw_1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Ex_1 {
    public static void main(String[] args) {
        Items item1 = new Items("апельсин. высший", 4.25, 1);
        Items item2 = new Items("апельсин. высший", 2.0, 2);
        Items item3 = new Items("апельсин. высший", 1.75, 3);
        Items item4 = new Items("мандарин. высший", 3.25, 1);
        Items item5 = new Items("мандарин. высший", 3.0, 2);
        Items item6 = new Items("мандарин. высший", 1.75, 3);
        Items item7 = new Items("яблоко. высшее", 9.25, 1);
        Items item8 = new Items("яблоко. высшее", 2.0, 2);
        Items item9 = new Items("яблоко. высшее", 10.75, 3);
        Items item10 = new Items("апельсин", 1.25, 1);
        Items item11 = new Items("апельсин", 1.25, 2);
        Items item12 = new Items("апельсин", 7.25, 3);
        Items item13 = new Items("мандарин", 1.25, 1);
        Items item14 = new Items("мандарин", 1.25, 2);
        Items item15 = new Items("мандарин", 11.25, 3);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);
        itemsList.add(item8);
        itemsList.add(item9);
        itemsList.add(item10);
        itemsList.add(item11);
        itemsList.add(item12);
        itemsList.add(item13);
        itemsList.add(item14);
        itemsList.add(item15);

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите параметр запроса (напрю: высш): ");
        String searchParameter = scanner.nextLine();
        System.out.println("result: " + getBiggestPrise(itemsList, searchParameter));
    }

    /**
     * Метод нахождения наибольшей цены товара, удовлетворяющего условию
     *
     * @param inputList - список товаров
     * @param parameter - условие поиска по названию
     * @return - Наибольшая цена товара, удовлетворяющего условию
     */
    private static Double getBiggestPrise(List<Items> inputList, String parameter) {
        Double biggestPrise = 0.0;
        for (Items el : inputList) {
            if ((el.getVariety() == 1 || el.getVariety() == 2) && el.getName().contains(parameter)) {
                if (el.getPrise() >= biggestPrise) {
                    biggestPrise = el.getPrise();
                }
            }
        }
        return biggestPrise;
    }
}
