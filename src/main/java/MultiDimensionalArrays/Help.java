package MultiDimensionalArrays;

public class Help {

    /**
     * <p>
     * Для каждого из столбоцов
     * минимальный элемент,
     * количество положительных элементов
     * </p>
     * <p>
     * Для каждой из строк:
     * максимальный элемент
     * сумму элементов строки.
     * </p>
     */


    public static void main(String[] args) {
        int[][] array1 = new int[5][5];
        int[][] array = {
                {-1, 0, 3, 1, 5},
                {-2, 0, 3, 1, 5},
                {-3, 0, 3, 1, 5},
                {-4, 0, 3, 1, 5},
                {-5, 0, 3, 1, 5},
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        smallestInCol(array, 5, 5);
        biggestInRow(array, 5, 5);
        getTheSummOfEachRow(5, array);
        countOfPositiveElements(5, array);

    }

    private static void biggestInRow(int array[][], int n, int m) {
        System.out.println();
        System.out.print("{BiggestRow: ");
        for (int i = 0; i < n; i++) {
            int maxM = array[i][1];
            for (int j = 0; j < m; j++) {
                if (array[i][j] > maxM) {
                    maxM = array[i][j];
                }
            }
            System.out.print(maxM + ", ");
        }
        System.out.print("}");
    }



    private static void smallestInCol(int mat[][], int n, int m) {

        System.out.print("{SmallestCol: ");
        for (int i = 0; i < m; i++) {
            int minm = mat[0][i];
            for (int j = 0; j < n; j++) {
                if (mat[j][i] < minm) {
                    minm = mat[j][i];
                }
            }
            System.out.print(minm + ", ");

        }
        System.out.print("}");
    }




    private static void getTheSummOfEachRow(int rows, int[][] array) {
        System.out.println();
        System.out.print("{SummRows: ");
        for (int i = 0; i < array.length; i++) {
            int eachRowsTotal = 0;
            for (int j = 0; j < array[i].length; j++) {
                eachRowsTotal += array[i][j];
            }
            System.out.print(eachRowsTotal + ", ");
        }
        System.out.print("}");


    }

    private static void countOfPositiveElements(int col, int[][] array) {
        System.out.println();
        System.out.print("{PosElCol:");
        int summOfElements = 0;
        int[] result = new int[col];
        for (int i = 0; i < array.length; i++) {
            int arrayNumbers = 0;
            int counterOfPositiveElements = 0;
            for (int j = 0; j < array[i].length; j++) {
                arrayNumbers = array[j][i];
                if (arrayNumbers > 0) {
                    counterOfPositiveElements++;
                }
            }
            System.out.print(counterOfPositiveElements + ", ");
        }
        System.out.print("}");
    }

}
