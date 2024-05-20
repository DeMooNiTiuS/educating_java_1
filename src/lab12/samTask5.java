package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class samTask5 {
    //Ryzen 5 3600  6 ядер 12 потоков
    static int j = 0;
    static int maxNum = 0;

    public static void main(String[] args) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество доступных ядер: " + cores);

        int[] arr = new int[12];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200);
        }

        System.out.println("Элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        maxNum = maxNumFromArray(arr);

        System.out.println("\nМаксимальное число в массиве: " + maxNum);
    }

    /*public static int maxNumFromArray (int[]arr) throws InterruptedException {
        for (int i = 0; i < arr.length; i++) {
            Thread sortThread = new Thread(() -> {
                if (maxNum < arr[j]) {
                    maxNum = arr[j];
                    j++;
                } else {
                    j++;
                }
            });
            sortThread.start();
            sortThread.join();
        }
        return maxNum;
    }*/

    public static int maxNumFromArray (int[]arr) throws InterruptedException {
        Thread sortThread1 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread2 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread3 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread4 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread5 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread6 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread7 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread8 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread9 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread10 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread11 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });
        Thread sortThread12 = new Thread(() -> {
            if (maxNum < arr[j]) {
                maxNum = arr[j];
                j++;
            } else {
                j++;
            }
        });

        sortThread1.start();
        sortThread2.start();
        sortThread3.start();
        sortThread4.start();
        sortThread5.start();
        sortThread6.start();
        sortThread7.start();
        sortThread8.start();
        sortThread9.start();
        sortThread10.start();
        sortThread11.start();
        sortThread12.start();

        return maxNum;
    }
}
