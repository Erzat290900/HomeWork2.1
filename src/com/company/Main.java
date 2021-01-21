package com.company;

public class Main {


    public static void main(String[] args) {
        System.out.println(oneTest(30, 20));
        System.out.println(oneTest(50, -30));
        System.out.println(oneTest(15, 35));
        System.out.println(oneTest(20, 10));
        System.out.println(oneTest(18, 35));
    }

    public static String oneTest(int age, int tempareture) {
        if (age > 20 || age < 45 && tempareture > -20 || tempareture < 30)
            return "можно идти гулять";
        else if (age < 20 && tempareture > 0 || tempareture < 30)
            return "можно идти гулять";
        else if (age >= 45 && tempareture >= -10 || tempareture <= 25)
            return "можно идти гулять";
        else
            return "оставайтесь дома";
    }


}
