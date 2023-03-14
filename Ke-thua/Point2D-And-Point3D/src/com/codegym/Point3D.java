package com.codegym;

import java.util.Arrays;

public class Point3D extends Point2D {
   private float z = 0.0f;
   public Point3D(){}
    public Point3D(float x,float y,float z){
       super(x,y);
       this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
       setXY(x,y);
       setZ(z);
    }
    public float [] getXYZ(){
       float[] arr1=new float[3];
       arr1[0]=getX();
       arr1[1]=getY();
       arr1[2]=getZ();
       return arr1;
    }
    public String toString() {
        return super.toString()+" ,z = "+getZ()+" has array = "+ Arrays.toString(getXYZ());
    }
}
