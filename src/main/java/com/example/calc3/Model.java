package com.example.calc3;

public class Model {
    public int calc(int a, int b, String op){
        switch (op){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if(b == 0) return 0;
                return a/b;
        }
        System.out.println("Неизвестный оператор " + op);
        return 0;
    }
}
