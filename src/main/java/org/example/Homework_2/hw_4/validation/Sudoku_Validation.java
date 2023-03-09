package org.example.Homework_2.hw_4.validation;

import java.util.HashMap;

public class Sudoku_Validation {

    /**
     * Модуль валидации таблицы судоку
     *
     * @param board - таблица судоку
     * @return - результат валидации: true = таблица предзаполнена / заполнена корректно
     */
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            char[] arrayToCheck = board[i];
            if (!isValidLine(arrayToCheck)) return false;
        }
        for (int i = 0; i < board[1].length; i++) {
            char[] arrayToCheck = board[i];
            if (!isValidLine(arrayToCheck)) return false;
        }
        for (int i = 0; i < board[0].length; i += 3) {
            for (int j = 0; j < board[1].length; j += 3) {
                char[] block = getBlock(board, i, j);
                if (!isValidLine(block)) return false;
            }
        }
        return true;
    }

    /**
     * Модуль валидации строки / столбца судоку.
     *
     * @param inputArr - массив значений строки таблицы судоку
     * @return - результат проверки наличия повторяющихся значений: true = значения не повторяются
     */
    private static boolean isValidLine(char[] inputArr) {
        HashMap<Character, Integer> symbolDict = new HashMap<>();
        for (char c : inputArr) {
            if (c != '.') {
                symbolDict.put(c, symbolDict.getOrDefault(c, 0) + 1);
                if (symbolDict.get(c) > 1) return false;
            }
        }
        return true;
    }

    /**
     * Модуль преобразования выделенного блока в одномерный массив
     *
     * @param block - таблица судоку
     * @param row   - индекс строки таблицы судоку, с которой начинается формирование блока
     * @param col   - индекс столбца таблицы судоку, с которого начинается формирование блока
     * @return - одномерный массив, состоящий из значений выделенного блока
     */
    private static char[] getBlock(char[][] block, int row, int col) {
        int[] size = {block[0].length / 3, block[1].length / 3};
        char[] arrayToCheck = new char[size[0] * size[1]];
        for (int i = 0; i < arrayToCheck.length; i++) {
            for (int j = row; j < row + 3; j++) {
                for (int k = col; k < col + 3; k++) {
                    arrayToCheck[i] = block[j][k];
                    i++;
                }
            }
        }
        return arrayToCheck;
    }
}
