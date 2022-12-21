package com.dragon.behave.visitor;

/**
 * @date 2022/12/2 11:15
 * TODO 双分派 -- eg
 */
public class ExShuangFenPai {

    public /*static */ void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        Execute exe = new Execute();
        a.accept(exe);
        d.accept(exe);
        c.accept(exe);
    }

    public class Animal {
        public void accept(Execute exe) {
            exe.execute(this);
        }
    }
 
    public class Dog extends Animal {
        public void accept(Execute exe) {
            exe.execute(this);
        }
    }
 
    public class Cat extends Animal {
        public void accept(Execute exe) {
            exe.execute(this);
        }
    }
 
    public class Execute {
        public void execute(Animal a) {
            System.out.println("animal");
        }
 
        public void execute(Dog d) {
            System.out.println("dog");
        }
 
        public void execute(Cat c) {
            System.out.println("cat");
        }
    }



}
