package JavaMarathon;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;

class Dayfour {
    void task1(){
        System.out.print("Введи размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arrD = new double[n];
        int[] arrI = new int[n];
        for(int i = 0; i < arrD.length; i++){
            arrD[i] = Math.floor(Math.random()*10);
            arrI[i] = (int) arrD[i];
        }
        System.out.println("Массив чисел из " + n + " элементов:");
        int k = 0;
        int l = 0;
        int g = 0;
        int t = 0;
        int sum = 0;
        for(int i = 0; i < arrI.length; i++){
            if( arrI[i] > 8){
                k += 1;
            }
            if( arrI[i] == 1){
                l += 1;
            }
            if((arrI[i] % 2) == 0){
                g += 1;
            }
            if((arrI[i] % 2) == 1){
                t += 1;
            }
            sum += arrI[i];
            if(i == 0){
                System.out.print("[ ");
            }
            System.out.print(arrI[i] + " ");
            if (((arrI.length - i)) == 1){
                System.out.print("]");
            }
        }
        System.out.println();
        System.out.println("Чисел больше 8 в массиве: " + k);
        System.out.println("Чисел равных 1 в массиве: " + l);
        System.out.println("Четных чисел в массиве: " + g);
        System.out.println("Нечетных чисел в массиве: " + t);
        System.out.println("Сумма чисел в массиве: " + sum);
    }
    void task2(){
        double[] arrD = new double[100];
        int[] arrI = new int[100];
        int min = 99999;
        int max = 0;
        int count0 = 0;
        int sumCount0 = 0;
        for (int i =0; i < arrD.length; i++){
            arrD[i] = Math.floor(Math.random()*100000);
            arrI[i] = (int) arrD[i];
            System.out.print(arrI[i] + " ");
        }
        for (int x: arrI) {
            if (x > max){
                max = x;
            }
            if (x < min){
                min = x;
            }
            if ((x & 10) == 0){
                count0 += 1;
                sumCount0 += x;
            }
        }
        System.out.println();
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Количество элементов в массиве оканчивающихся на 0: " + count0);
        System.out.println("Сумма элементов в массиве оканчивающихся на 0: " + sumCount0);
    }
    void task3(){
        int m = 12;
        int n = 8;
        int maxSumJ = 0;
        int indexM = 0;
        int[] sumJ = new int[m];
        double[][] arrArrD = new double[m][n];
        int[][] arrArrI = new int[m][n];
        for (int i =0; i < m; i++){
            for( int j = 0; j < n; j++){
                arrArrD[i][j] = Math.floor((Math.random()*100)/2);
                arrArrI[i][j] = (int) arrArrD[i][j];
                sumJ[i] += arrArrI[i][j];
                System.out.print(arrArrI[i][j] + " ");
                if ((n - j) == 1){
                    System.out.println(" - Сумма строки: " + sumJ[i]);
                    System.out.println();
                }
            }
            if (sumJ[i] > maxSumJ) {
                maxSumJ = sumJ[i];
                indexM = i;
            }
        }
        System.out.println("Максимальная сумма строки в матрице равна: " + maxSumJ + " Строка с индексом: " + indexM);
    }
    void task4(){
        double[] arrD = new double[10];
        int[] arrI = new int[10];
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int maxSum = 0;
        int maxSum1 = 0;
        int maxSum2 = 0;
        int maxTotSum = 0;
        boolean flag = false;
        for (int i =0; i < arrD.length; i++) {
            arrD[i] = Math.floor(Math.random() * 10);
            arrI[i] = (int) arrD[i];
            sum += arrI[i];
            sum1 += arrI[i];
            sum2 += arrI[i];
            if(flag){
                b = sum1;
                sum1 = 0;
                flag = false;}
            if((i % 3) == 0){
                a = sum;
                sum = 0;
                flag = true;
            }
            if(((i+1) % 3) == 0){
                c = sum2;
                sum2 = 0;
            }
            if (a > maxSum) maxSum = a;
            if (b > maxSum1) maxSum1 = b;
            if (c > maxSum2) maxSum2 = c;
            System.out.print(arrI[i] + " ");
        }
        if (maxSum > maxTotSum) maxTotSum = maxSum;
        if (maxSum1 > maxTotSum) maxTotSum = maxSum1;
        if (maxSum2 > maxTotSum) maxTotSum = maxSum2;
        System.out.println();
        System.out.println("Максимальная сумма maxSum: " + maxSum);
        System.out.println("Максимальная сумма maxSum1: " + maxSum1);
        System.out.println("Максимальная сумма maxSum2: " + maxSum2);
        System.out.println("Максимальная сумма maxTotSum: " + maxTotSum);
    }
}
