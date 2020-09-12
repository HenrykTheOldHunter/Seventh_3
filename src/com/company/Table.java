package com.company;

public class Table extends Furniture {

    public Table(float weight, float length, float width, float height, String color, int numSeats){
        super(weight, length, width, height, color, numSeats);
    }

    @Override
    public void say() {
        System.out.println("Стол" + "\nС размерами: " + getWidth() + " x " + getLength() + " x " + getHeight() + "\nВесит " + getHeight() + " кг" + "\nЦвет " + getColor() + "\nНа него сядут " );
        if(getNumSeats()==0) System.out.println("0 человек, это же стол, зачем садиться на него");
        else {
            System.out.println(getNumSeats() + " человек");
        }
    }
}