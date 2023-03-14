package com.codegym;

import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    public Point2D(){}
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float [] arr= new float[2];
        arr[0]=getX();
        arr[1]=getY();
        return arr;
    }
    @Override
    public String toString() {
        return "x = "+getX()+" ,y = "+getY()+" has array = "+ Arrays.toString(getXY());
    }
}
