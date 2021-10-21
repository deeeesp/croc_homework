package com.company;

public class Circle extends Figure{

    public Circle(int x1, int y1, int r) {
        this.x1 = x1;
        this.y1 = y1;
        this.R = r;
    }

    @Override
    public int getX1() {
        return super.getX1();
    }

    @Override
    public int getY1() {
        return super.getY1();
    }

    @Override
    public int getR() {
        return super.getR();
    }

    public String toString(){
        return String.format("C (%d, %d), %d", super.getX1(), super.getY1(), getR());
    }
}
