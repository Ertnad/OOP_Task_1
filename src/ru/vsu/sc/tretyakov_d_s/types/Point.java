package ru.vsu.sc.tretyakov_d_s.types;

import ru.vsu.sc.tretyakov_d_s.Rectangle;

public class Point implements Geometry {
    private final double x;
    private final double y;
    private final Rectangle mbr;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.mbr = new Rectangle(getMbr().getWidth(), getMbr().getHeight(), getMbr().getX(), getMbr().getY());
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    public Rectangle getMbr() {
        return this.mbr;
    }

    public double SumCord() {
        return x + y;
    }
}
