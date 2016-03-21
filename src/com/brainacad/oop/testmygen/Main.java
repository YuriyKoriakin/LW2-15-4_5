package com.brainacad.oop.testmygen;

/**
 * Created by Yuriy on 18.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator=new MyNumGenerator(64,5);//створюємо об'єкт
        System.out.println(myNumGenerator.generate()); //виводимо на друк результат методу generate
        //2-15-5
        System.out.println(myNumGenerator.generateDistinct()); //виводимо на друк результат методу generate
    }
}


