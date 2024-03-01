package org.example.example1;

public class Test {
    public static void main(String[] args) {

        Bicycle peugeot = new Bicycle("Peugeot", 120, 10, 5);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat = peugeot.new Seat();

        Bicycle.Pump pump = new Bicycle.Pump();
        pump.pumpIt();

        seat.getSeatParam();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();

        System.out.println(Bicycle.Seat.x);

    }
}
