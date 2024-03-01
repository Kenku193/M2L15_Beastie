package org.example.example3;

public class Test {
    public static void main(String[] args) {

//        Cat cat = new Cat() {
//            @Override
//            public void run() {
//                System.out.println("Анонимный кот побежал");
//            }
//
//            @Override
//            public void eat() {
//                System.out.println("Анонимный кот поел");
//            }
//        };

        Cat с = new Cat() {
            @Override
            public void run() {

            }

            @Override
            public void eat() {

            }
        };

       Runnable r = new Runnable() {
           @Override
           public void run() {
               System.out.println("xxx");
           }
       };

       Thread t = new Thread(r);
       t.start();

    }
}
