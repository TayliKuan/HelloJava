package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_0302 {

    public static void main(String[] args) {
	Q1();
	Q2();
        Q3();
	Q4();
	Q5();
	Q6();
    }

    public static void Q1() {
        int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        System.out.println("此陣列平均值為 = " + average);
        System.out.print("大於平均的元素 = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.print(+array[i] + " ");
            }
        }
    }

    public static void Q2() {
        String s = "Hello World";
        for (int i = s.length() - 1; i >= 0; i--) {// 字串長度減一 因為索引值0開始
            System.out.print(s.charAt(i));
        }
    }

    public static void Q3() {
        String[] array = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};

        char[] find = {'a', 'e', 'i', 'o', 'u'};

        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int k = 0; k < array.length; k++) {
            char[] charArray = array[k].toCharArray();
            for (int j = 0; j < charArray.length; j++) {

                if (charArray[j] == find[0]) {
                    a++;
                }
                if (charArray[j] == find[1]) {
                    e++;
                }
                if (charArray[j] == find[2]) {
                    i++;
                }
                if (charArray[j] == find[3]) {
                    o++;
                }
                if (charArray[j] == find[4]) {
                    u++;
                }
            }
        }
        System.out.println("a有=" + a + "個");
        System.out.println("e有=" + e + "個");
        System.out.println("i有=" + i + "個");
        System.out.println("o有=" + o + "個");
        System.out.println("u有=" + u + "個");
    }

    public static void Q4() {
        int[][] workerMoney = {{25, 32, 8, 19, 27}, {2500, 800, 500, 1000, 1200}};
        
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入想借的金額:");

        int borrow = sc.nextInt();
        System.out.println("可以借的員工編號:");
        for (int j = 0; j < workerMoney[0].length; j++) {
            if (borrow <= workerMoney[1][j]) {
                System.out.print(workerMoney[0][j] + " ");
                count++;
            }
        }
        System.out.println(" 總共" + count + "人");
    }

    public static void Q5() {
        int[] days28 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] days29 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        // 2020 有29天
        System.out.println("請輸入想查詢的西元年:");
        int year = sc.nextInt();
        System.out.println("月份:");
        // 月份
        int month = sc.nextInt();
        if (month > 12) {
            System.out.println("沒有這個月份! 請再輸入一次月份");
            month = sc.nextInt();
        }
        // 日期
        System.out.println("日期:");
        int day = sc.nextInt();
        if (day > 31) {
            if (month != 2) {
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    System.out.println("這個月沒有31天喔!請再輸入一次日期");
                }
                day = sc.nextInt();
            }
            if (month == 2 && day > 29) {
                System.out.println("二月沒有這天喔!請再輸入一次日期");
                day = sc.nextInt();
            }
            System.out.println("請再輸入一次日期");
            day = sc.nextInt();
        }
        // 2月的問題
        if (year % 4 == 0) {// 29
            for (int i = 1; i < month; i++) {
                sum = sum + days29[i];
            }
            days = sum + day;
        } else {// 28
            for (int i = 1; i < month; i++) {
                sum = sum + days28[i];
            }
            days = sum + day;
        }
        System.out.println("西元" + year + "年,第" + days + "天");
    }

    public static void Q6() {
        int[][] grade = {{10, 35, 40, 100, 90, 85, 75, 70},
        {37, 75, 77, 89, 64, 75, 70, 95},
        {100, 70, 79, 90, 75, 70, 79, 90},
        {77, 95, 70, 89, 60, 75, 85, 89},
        {98, 70, 89, 90, 75, 90, 89, 90},
        {90, 80, 100, 75, 50, 20, 99, 75}};

        int[] highest = new int[8];

        for (int i = 0; i < grade.length; i++) {
            int[] gradeSort1 = Arrays.copyOf(grade[i], 8);//複製行數 並排序 取最大的
            Arrays.sort(gradeSort1);
            // System.out.println(gradeSort1[7]);//最高的分數
            for (int j = 0; j < grade[i].length; j++) {
                if (gradeSort1[7] == grade[i][j]) {
                    //System.out.println("第" + (i + 1) + "次考試最高分為 " + (j + 1) + "號同學");// 索引值 3 就是第四位同學 最高分
                    //--> 印出 第1次考試最高分為 4號同學
                    highest[j]++;//最高分的同學放進相對的陣列裡
                }
            }
        }
        for (int i = 0; i < highest.length; i++) {
            System.out.println("第" + (i + 1) + "位同學最高分次數為 " + highest[i] + "次");
        }
    }

}
