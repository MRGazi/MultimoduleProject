package org.mrg.mainProgram;

import org.mrg.javaSimpleMath.SimpleMath;

public class MRGMain {
    public static void main(String[] args) {
        double addition = SimpleMath.addition(10,15);
        double subtraction = SimpleMath.subtraction(100,15);
        double multiplication = SimpleMath.multiplication(10,15);
        double division = SimpleMath.division(100,15);
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
    }
}
