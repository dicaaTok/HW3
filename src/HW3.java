import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class HW3 {
public static void main(String[] args){
        double[] array = {8.0, 2.0, -2.5, -4.5, 2.0,
                3.0, 6.0, -7.0, 1.5, 0.0, -3.3, 4.1,
                -1.0, 5.0, 7.2};
        boolean firstNegativeFound = false;
        double sum = 0;
        int count = 0;

        for (double number : array) {
            if (!firstNegativeFound) {
                if (number < 0) {
                    firstNegativeFound = true;
                }
            } else if (number > 0) {
                sum += number;
                count++;
            }
        }
        double average = (count > 0) ? sum / count : 0;
    System.out.println("сумма положителных чисел после ячейки 1:" + sum);
    System.out.println("каличество положителных чисел: " + count);
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа : " + average);

    }
}


//ни удачная попытка
 //*  double[] array = {5.6, 2.0, -3.0, 4.5, -5.0,
     //           3.3, -2.1, -4.5, 2.9, -1.7,
    //            4.1, 1.0, -5.1, 2.3, -3.0};
     //   array[0] = 4.0;
     //   double suma = 0;
     //   System.out.println(Arrays.toString(array));
     //   System.out.println("--------------------------");
     //   for (double a : array) {
     //       System.out.println(a);
     //       for (int i = 2; i < array.length; i++) {
     //           if (array[(int) i] < 0) {
     //               continue;

     //           }

     //           System.out.println(array[(int) i]);
     //       }

    //    }
    //    System.out.println(Arrays.toString(array[(int) i]));      *\
