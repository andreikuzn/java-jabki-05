package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    // 2. Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.
    @Test
    public void sumArrayWithPositiveNumbersTest() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 15;
        assertEquals(expected, Main.sumArray(input));
    }

    @Test
    public void sumArrayWithMixedNumbersTest() {
        int[] input = {-1, 2, -3, 4, -5};
        int expected = -3;
        assertEquals(expected, Main.sumArray(input));
    }

    @Test
    public void sumArrayWithEmptyArrayTest() {
        int[] input = {};
        int expected = 0;
        assertEquals(expected, Main.sumArray(input));
    }

    @Test
    public void sumArrayWithNullArrayTest() {
        int[] input = null;
        int expected = 0;
        assertEquals(expected, Main.sumArray(input));
    }

    // 3. Реализуйте метод для поиска минимального элемента в одномерном массиве
    @Test
    public void findMinWithPositiveNumbersTest() {
        int[] input = {5, 3, 8, 1, 9};
        int expected = 1;
        assertEquals(expected, Main.findMin(input));
    }

    @Test
    public void findMinWithMixedNumbersTest() {
        int[] input = {-2, 0, 3, -1, 5};
        int expected = -2;
        assertEquals(expected, Main.findMin(input));
    }

    @Test
    public void findMinWithSingleElementTest() {
        int[] input = {42};
        int expected = 42;
        assertEquals(expected, Main.findMin(input));
    }

    @Test
    public void findMinWithNullArrayTest() {
        int[] input = null;
        assertThrows(IllegalArgumentException.class, () -> Main.findMin(input));
    }

    @Test
    public void findMinWithEmptyArrayTest() {
        int[] input = {};
        assertThrows(IllegalArgumentException.class, () -> Main.findMin(input));
    }

    // 5. Напишите метод, который инвертирует порядок элементов в одномерном массиве
    @Test
    public void reverseIntArrayWithValuesTest() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        Main.reverseArray(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void reverseStringArrayWithNullTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.reverseArray(null));
    }

    @Test
    public void reverseStringArrayWithEmptyArrayTest() {
        int[] input = {};
        int[] expected = {};
        Main.reverseArray(input);
        assertArrayEquals(expected, input);
    }

    // 6. Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы
    @Test
    public void findFirstDuplicateWithDuplicatesTest() {
        int[] input = {7, 3, 1, 4, 2, 5, 5, 6};
        Integer expected = 5;
        assertEquals(expected, Main.findFirstDuplicate(input));
    }

    @Test
    public void findFirstDuplicateWithoutDuplicatesTest() {
        int[] input = {1, 2, 3, 4, 5, -5};
        assertNull(Main.findFirstDuplicate(input));
    }

    @Test
    public void findFirstDuplicateWithNullArrayTest() {
        assertThrows(IllegalArgumentException.class, () -> Main.findFirstDuplicate(null));
    }

    @Test
    public void findFirstDuplicateWithEmptyArrayTest() {
        int[] input = {};
        assertNull(Main.findFirstDuplicate(input));
    }

    // 7. Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.
    @Test
    public void replaceNegativesWithAbsoluteTest() {
        int[] input = {-1, 2, -3, 4, -5};
        int[] expected = {1, 2, 3, 4, 5};
        Main.replaceNegativesWithAbsolute(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void replaceNegativesWithAbsoluteAllNegativeTest() {
        int[] input = {-10, -20, -30};
        int[] expected = {10, 20, 30};
        Main.replaceNegativesWithAbsolute(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void replaceNegativesWithAbsoluteEmptyArrayTest() {
        int[] input = {};
        int[] expected = {};
        Main.replaceNegativesWithAbsolute(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void replaceNegativesWithAbsoluteNullArrayTest() {
        assertThrows(IllegalArgumentException.class, () ->
                Main.replaceNegativesWithAbsolute(null));
    }

    // Многомерные массивы
    // 1. Создайте двумерный массив 3x3, заполните его единицами на главной диагонали и нулями в остальных ячейках. Выведите массив
    @Test
    public void createDiagonalMatrixStructureTest() {
        int[][] matrix = Main.createAndPrintDiagonalMatrix();
        assertEquals(3, matrix.length);
        for (int[] row : matrix) {
            assertEquals(3, row.length);
        }
    }

    @Test
    public void createDiagonalMatrixValuesTest() {
        int[][] matrix = Main.createAndPrintDiagonalMatrix();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    assertEquals(1, matrix[i][j], "Ожидается 1 на позиции [" + i + "][" + j + "]");
                } else {
                    assertEquals(0, matrix[i][j], "Ожидается 0 на позиции [" + i + "][" + j + "]");
                }
            }
        }
    }

    @Test
    public void createDiagonalMatrixNotNullTest() {
        int[][] matrix = Main.createAndPrintDiagonalMatrix();
        assertNotNull(matrix);
    }

    // 2. Напишите метод, вычисляющий сумму всех элементов в двумерном массиве
    @Test
    public void sumOfElementsStandardCaseTest() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expected = 45;
        assertEquals(expected, Main.sumOfElements(array));
    }

    @Test
    public void sumOfElementsSingleRowTest() {
        int[][] array = {
                {1, 2, 3}
        };
        int expected = 6;
        assertEquals(expected, Main.sumOfElements(array));
    }

    @Test
    public void sumOfElementsSingleColumnTest() {
        int[][] array = {
                {1},
                {2},
                {3}
        };
        int expected = 6;
        assertEquals(expected, Main.sumOfElements(array));
    }

    @Test
    public void sumOfElementsEmptyArrayTest() {
        int[][] array = {};
        int expected = 0;
        assertEquals(expected, Main.sumOfElements(array));
    }

    @Test
    public void sumOfElementsZerosArrayTest() {
        int[][] array = {
                {0}
        };
        assertEquals(0, Main.sumOfElements(array));
    }

    // 3. Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец)
    @Test
    public void findMaxElementStandardCaseTest() {
        int[][] matrix = {
                {3, 5, 7},
                {2, 9, 1},
                {8, 4, 6}
        };
        int[] expected = {1, 1};
        int[] result = Main.findMaxElement(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMaxElementSingleRowTest() {
        int[][] matrix = {
                {1, 2, 3}
        };
        int[] expected = {0, 2};
        int[] result = Main.findMaxElement(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMaxElementSingleColumnTest() {
        int[][] matrix = {
                {1},
                {2},
                {3}
        };
        int[] expected = {2, 0};
        int[] result = Main.findMaxElement(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMaxElementMultipleMaxValuesTest() {
        int[][] matrix = {
                {3, 5, 7},
                {2, 9, 1},
                {9, 4, 6}
        };
        int[] expected = {1, 1};
        int[] result = Main.findMaxElement(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMaxElementEmptyMatrixTest() {
        int[][] matrix = {};
        int[] expected = {-1, -1};
        int[] result = Main.findMaxElement(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMaxElementNegativeNumbersTest() {
        int[][] matrix = {
                {-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}
        };
        int[] expected = {0, 0};
        int[] result = Main.findMaxElement(matrix);
        assertArrayEquals(expected, result);
    }

    // 4. Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов)
    @Test
    public void isSquareMatrixSquareTest() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        boolean expected = true;
        boolean result = Main.isSquareMatrix(matrix);
        assertEquals(expected, result);
    }

    @Test
    public void isSquareMatrixNonSquareTest() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        boolean expected = false;
        boolean result = Main.isSquareMatrix(matrix);
        assertEquals(expected, result);
    }

    @Test
    public void isSquareMatrixEmptyMatrixTest() {
        int[][] matrix = {};
        boolean expected = true;
        boolean result = Main.isSquareMatrix(matrix);
        assertEquals(expected, result);
    }

    @Test
    public void isSquareMatrixSingleElementTest() {
        int[][] matrix = {
                {42}
        };
        boolean expected = true;
        boolean result = Main.isSquareMatrix(matrix);
        assertEquals(expected, result);
    }

    @Test
    public void isSquareMatrixNullTest() {
        int[][] matrix = null;
        boolean expected = false;
        boolean result = Main.isSquareMatrix(matrix);
        assertEquals(expected, result);
    }

    @Test
    public void isSquareMatrixZeroByNTest() {
        int[][] matrix = new int[0][3];
        boolean expected = true;
        boolean result = Main.isSquareMatrix(matrix);
        assertEquals(expected, result);
    }

    @Test
    public void isSquareMatrixNByZeroTest() {
        int[][] matrix = {
                {},
                {},
                {}
        };
        boolean expected = false;
        boolean result = Main.isSquareMatrix(matrix);
        assertEquals(expected, result);
    }

    /* 5. Напишите метод, который находит сумму элементов каждой строки, минимальное и
             максимальное значение двумерного массива и выводит результаты */
    @Test
    public void analyzeMatrixStandardCaseTest() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String expected = "Суммы по строкам:" + System.lineSeparator() +
                "Строка 0: 6" + System.lineSeparator() +
                "Строка 1: 15" + System.lineSeparator() +
                "Строка 2: 24" + System.lineSeparator() +
                "Минимальное значение в матрице: 1" + System.lineSeparator() +
                "Максимальное значение в матрице: 9";
        String result = Main.analyzeMatrix(matrix);
        assertEquals(expected, result);
    }

    @Test
    public void analyzeMatrixEmptyMatrixTest() {
        int[][] matrix = {};
        String expected = "Матрица пустая или не задана.";
        String result = Main.analyzeMatrix(matrix);
        assertEquals(expected, result);
    }

    @Test
    public void analyzeMatrixNullMatrixTest() {
        int[][] matrix = null;
        String expected = "Матрица пустая или не задана.";
        String result = Main.analyzeMatrix(matrix);
        assertEquals(expected, result);
    }

    // 6. Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных — 1.
    @Test
    public void generateAndPrintMatrixValidTest() {
        Integer rows = 4;
        Integer cols = 5;
        String expected = "0 1 0 1 0\n1 0 1 0 1\n0 1 0 1 0\n1 0 1 0 1";
        String result = Main.generateAndPrintMatrix(rows, cols);
        assertEquals(expected, result);
    }

    @Test
    public void generateAndPrintMatrixRowsNullTest() {
        Integer rows = null;
        Integer cols = 3;
        String result = Main.generateAndPrintMatrix(rows, cols);
        String expected = "Матрица не задана или размеры некорректны.";
        assertEquals(expected, result);
    }

    @Test
    public void generateAndPrintMatrixColsNullTest() {
        Integer rows = 3;
        Integer cols = null;
        String result = Main.generateAndPrintMatrix(rows, cols);
        String expected = "Матрица не задана или размеры некорректны.";
        assertEquals(expected, result);
    }

    @Test
    public void generateAndPrintMatrixZeroRowsTest() {
        Integer rows = 0;
        Integer cols = 5;
        String result = Main.generateAndPrintMatrix(rows, cols);
        String expected = "Матрица не задана или размеры некорректны.";
        assertEquals(expected, result);
    }

    @Test
    public void generateAndPrintMatrixZeroColsTest() {
        Integer rows = 5;
        Integer cols = 0;
        String result = Main.generateAndPrintMatrix(rows, cols);
        String expected = "Матрица не задана или размеры некорректны.";
        assertEquals(expected, result);
    }

    @Test
    public void generateAndPrintMatrixNegativeColsTest() {
        Integer rows = 4;
        Integer cols = -3;
        String result = Main.generateAndPrintMatrix(rows, cols);
        String expected = "Матрица не задана или размеры некорректны.";
        assertEquals(expected, result);
    }

    @Test
    public void generateAndPrintMatrixNegativeRowsTest() {
        Integer rows = -4;
        Integer cols = 3;
        String result = Main.generateAndPrintMatrix(rows, cols);
        String expected = "Матрица не задана или размеры некорректны.";
        assertEquals(expected, result);
    }


}
