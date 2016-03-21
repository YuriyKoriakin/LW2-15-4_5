package com.brainacad.oop.testmygen;

import java.util.*;

/**
 * Created by Yuriy on 18.03.2016.
 */
public class MyNumGenerator {
    int numOfElm;//оголошуємо змінні
    int maxNumb;

    public MyNumGenerator(int maxNumb, int numOfElm) {//створюємо конструктор
        this.maxNumb = maxNumb;
        this.numOfElm = numOfElm;
    }
    public List<Integer> generate() {//з використанням циклу та методу рендом заповнюємо нашу колекцію
        List<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            Random random = new Random();
            int num = random.nextInt(maxNumb);
            arraylist.add(num);
        }
        return arraylist;//повертаємо значення

    }
    //2-15-5
    public Set<Integer> generateDistinct (){
        Set<Integer> hashSet = new HashSet<>();//HashSet дозволяє сформувати колекцію без дублювання значень
        for (int i = 0; i < numOfElm; i++) {
            Random random = new Random();
            int num = random.nextInt(maxNumb);
           hashSet.add(num);
        }
        return hashSet;//повертаємо значення
    }
}

