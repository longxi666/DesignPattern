package com.dragon.behave.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/12/2 10:43
 * TODO 对象结构类
 */
public class Home {

    //声明集合存储元素对象
    private List<Animal> animalList = new ArrayList<>();

    public void add(Animal animal){
        animalList.add(animal);
    }

    public void action(Person person){
        for (Animal animal : animalList) {
            animal.accept(person);
        }
    }
}
