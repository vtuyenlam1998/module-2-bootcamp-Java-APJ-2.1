package com.codegym;

public class TriangleClassifier {
    public static String triangleClassifier(double firstSide, double secondSide, double thirdSide) {
        boolean isEquilateralTriangle = firstSide == secondSide && firstSide == thirdSide;
        boolean isIsoscelesTriangle = firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide;
        boolean IsTriangle = firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide;
        boolean isSideTriangle = firstSide != 0 && secondSide != 0 && thirdSide != 0;
        if (isSideTriangle) {
            if (isEquilateralTriangle) {
                return "Tam giác đều";
            } else {
                if (isIsoscelesTriangle) {
                    return "Tam giác cân";
                } else {
                    if (IsTriangle) {
                        return "Tam giác thường";
                    } else {
                        return "Không phải tam giác";
                    }
                }
            }
        } return "Không phải tam giác";
    }
}