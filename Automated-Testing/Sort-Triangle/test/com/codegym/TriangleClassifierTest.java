package com.codegym;

import static org.junit.jupiter.api.Assertions.*;

import com.sun.deploy.ui.AboutDialog;
import org.junit.jupiter.api.Test;

class TriangleClassifierTest {

    @Test
    void equilateralTriangleTest() {
        double firstSide = 2;
        double secondSide = 2;
        double thirdSide = 2;

        String actual = TriangleClassifier.triangleClassifier(firstSide,secondSide,thirdSide);
        String expected = "Tam giác đều";
        assertEquals(expected,actual);
    }
    @Test
    void isoscelesTriangleTest() {
        double firstSide = 2;
        double secondSide = 2;
        double thirdSide = 3;

        String actual = TriangleClassifier.triangleClassifier(firstSide,secondSide,thirdSide);
        String expected = "Tam giác cân";
        assertEquals(expected,actual);
    }
    @Test
    void isTriangleTest() {
        double firstSide = 3;
        double secondSide = 4;
        double thirdSide = 5;

        String actual = TriangleClassifier.triangleClassifier(firstSide,secondSide,thirdSide);
        String expected = "Tam giác thường";
        assertEquals(expected,actual);
    }
    @Test
    void isNotTriangleTest() {
        double firstSide = 8;
        double secondSide = 2;
        double thirdSide = 3;

        String actual = TriangleClassifier.triangleClassifier(firstSide,secondSide,thirdSide);
        String expected = "Không phải tam giác";
        assertEquals(expected,actual);
    }
    @Test
    void isNotTriangleTest1() {
        double firstSide = -1;
        double secondSide = 2;
        double thirdSide = 1;

        String actual = TriangleClassifier.triangleClassifier(firstSide,secondSide,thirdSide);
        String expected = "Không phải tam giác";
        assertEquals(expected,actual);
    }
    @Test
    void isNotTriangleTest2() {
        double firstSide = 0;
        double secondSide = 1;
        double thirdSide = 1;

        String actual = TriangleClassifier.triangleClassifier(firstSide,secondSide,thirdSide);
        String expected = "Không phải tam giác";
        assertEquals(expected,actual);
    }
    @Test
    void isNotTriangleTest3() {
        double firstSide = 0;
        double secondSide = 0;
        double thirdSide = 0;

        String actual = TriangleClassifier.triangleClassifier(firstSide,secondSide,thirdSide);
        String expected = "Không phải tam giác";
        assertEquals(expected,actual);
    }
}