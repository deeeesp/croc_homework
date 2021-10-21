package com.company;

public class Figure implements Movable {

    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected int R;


    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getR() {
        return R;
    }


    public boolean isPointInside(int x, int y) {
        return false;
    }

    @Override
    public void move(int dx, int dy) {
    }
}
