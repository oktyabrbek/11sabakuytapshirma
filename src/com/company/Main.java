package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.aUzundugu=15;
        triangle.bUzundugu=30;
        triangle.cUzundugu=20;

        triangle.area(triangle.aUzundugu, triangle.bUzundugu, triangle.cUzundugu);
    }
}

