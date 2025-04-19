package src;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        //int[] numbers = new int[10];
        //String[] names = {"Ilya", "Elena", "Андрей"};

        //System.out.println(numbers);

        /*
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         */

        /*
        for (String name : names) {
            System.out.println(name);
        }
         */

        // Запись значение
        //numbers[0] = 1;

        // System.out.println(numbers[0]);
        // System.out.println(names[1]);
        // System.out.println(names.length);

        // System.out.println(average(1000));
        // System.out.println(averageV2(1000));

        //int[][] matrix = new int[10][10];
        //int[][] grid = {{1, 2}, {3, 4}};

        // print(matrix);
        // print(grid);

        // printIndex(matrix);
        // printIndex(grid);

        //int[][] data = createMatrix(100);
        //print(data);
        //sum(data);

        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Сумма элементов массива: " + sumArray(array));

        int[] list = {5, 3, 8, 1, 9};
        System.out.println("Минимальный элемент: " + findMin(list));

        String[] months = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        printMonthsStartingWithM(months);

        int[] arrayNumbers = {1, 2, 3, 4, 5};
        reverseArray(arrayNumbers);

        int[] dublicateNums = {7, 3, 1, 4, 2, 5, 5, 6};
        System.out.println("Найден дубликат числа: " + findFirstDuplicate(dublicateNums));

        int[] numbersForReplace = {-10, 0, 5, -3, 7, -8};
        replaceNegativesWithAbsolute(numbersForReplace);

        createAndPrintDiagonalMatrix();

        int[][] sumOfArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Сумма всех элементов массива: " + sumOfElements(sumOfArray));

        int[][] matrix = {
                {3, 5, 7},
                {2, 8, 1},
                {9, 4, 6}
        };
        int[] result = findMaxElement(matrix);
        System.out.println("Максимальный элемент: " + matrix[result[0]][result[1]]);
        System.out.println("Координаты: строка = " + result[0] + ", столбец = " + result[1]);

        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] nonSquareMatrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int[][] emptyMatrix = {};
        System.out.println(isSquareMatrix(squareMatrix));
        System.out.println(isSquareMatrix(nonSquareMatrix));
        System.out.println(isSquareMatrix(emptyMatrix));

        int[][] matrixToAnalyze = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(analyzeMatrix(matrixToAnalyze));

        System.out.println(generateAndPrintMatrix(4, 5));
    }

    // O(2n)
    static int average(int size) {
        int[] arr = new int[size];

        // O(n)
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(100);
        }

        int sum = 0;

        // O(n)
        for (int e : arr) {
            sum += e;
        }

        return sum / size;
    }

    // O(n)
    static int averageV2(int size) {
        int[] arr = new int[size];
        int sum = 0;

        // O(n)
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(100);
            sum += arr[i];
        }


        return sum / size;
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printIndex(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("(%s, %s)", i, j);
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = RANDOM.nextInt(100);
            }
        }
        return matrix;
    }

    static void sum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.printf("Строка %s: сумма = %s\n", i, sum);
        }
    }

    /**
     * ДЗ5
     */

    // Одномерные массивы
    // 1. Создайте метод, который выводит массив в консоль.

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    // 2. Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.

    public static int sumArray(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // 3. Реализуйте метод для поиска минимального элемента в одномерном массиве

    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть null или пустым");
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 3. Создайте массив строк, инициализируйте его названиями месяцев года. Выведите все строки, начинающиеся на букву "М"

    public static void printMonthsStartingWithM(String[] months) {
        System.out.println("Месяцы, начинающиеся на 'М':");
        for (String month : months) {
            if (month.startsWith("М")) {
                System.out.println(month);
            }
        }
    }

    // 5. Напишите метод, который инвертирует порядок элементов в одномерном массиве

    public static void reverseArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }
        if (array.length == 0) {
            System.out.println("Массив пуст, инверсии не требуется.");
            return;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("Инвертированный массив чисел:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 6. Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы

    public static Integer findFirstDuplicate(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return array[i];
                }
            }
        }
        return null;
    }

    // 7. Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.

    public static void replaceNegativesWithAbsolute(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Многомерные массивы

    // 1. Создайте двумерный массив 3x3, заполните его единицами на главной диагонали и нулями в остальных ячейках. Выведите массив

    public static int[][] createAndPrintDiagonalMatrix() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i == j) ? 1 : 0;
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    // 2. Напишите метод, вычисляющий сумму всех элементов в двумерном массиве

    public static int sumOfElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    // 3. Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец)

    public static int[] findMaxElement(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int rowIndex = -1;
        int colIndex = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        return new int[]{rowIndex, colIndex};
    }

    // 4. Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов)

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        if (matrix.length == 0) {
            return true;
        }
        int rowCount = matrix.length;

        for (int[] row : matrix) {
            if (row.length != rowCount) {
                return false;
            }
        }
        return true;
    }

    /* 5. Напишите метод, который находит сумму элементов каждой строки, минимальное и
          максимальное значение двумерного массива и выводит результаты */

    public static String analyzeMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return "Матрица пустая или не задана.";
        }
        String result = "Суммы по строкам:" + System.lineSeparator();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int value : matrix[i]) {
                rowSum += value;
                if (value < min) min = value;
                if (value > max) max = value;
            }
            result += "Строка " + i + ": " + rowSum + System.lineSeparator();
        }
        result += "Минимальное значение в матрице: " + min + System.lineSeparator();
        result += "Максимальное значение в матрице: " + max;
        return result;
    }

    // 6. Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных — 1.

    public static String generateAndPrintMatrix(Integer rows, Integer cols) {
        if (rows == null || cols == null || rows <= 0 || cols <= 0) {
            return "Матрица не задана или размеры некорректны.";
        }
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result += matrix[i][j];
                if (j < cols - 1) {
                    result += " ";
                }
            }
            if (i < rows - 1) {
                result += "\n";
            }
        }
        return result;
    }
}


