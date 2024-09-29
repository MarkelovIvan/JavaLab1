import java.util.Random;

public class Main {

    public static long[][] matrixB = new long[3][3];
    public static long[][] matrixC = new long[3][3];

    public static void main(String[] args) {
        System.out.println("---Hello user!---\n---This is start of program.---\n");
        System.out.println("C = B^T\n");

        inputData(); // Створення матриці B
        showMatrix(matrixB, "B"); // Вивід матриці В
        transposeMatrix(matrixB); // Траспонування матриці В
        showMatrix(matrixC, "C"); // Вивід матриці С
        showMiddleElement(matrixC); // Обрахунок і вивід середнього значення серед всіх елементів матриці С
        System.out.println("\n---This is end of program.---\n");

    }


    public static void inputData() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = random.nextLong();
            }
        }
    }

    public static void showMatrix(long[][] matrix, String name) {
        System.out.print("This is matrix " + name + "\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void transposeMatrix(long[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = matrix[j][i];
            }
        }
    }

    public static void showMiddleElement(long[][] matrix) {
        long sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum+=matrix[i][j];
            }
        }

        System.out.println("Middle element is " + sum/9);
    }
}
