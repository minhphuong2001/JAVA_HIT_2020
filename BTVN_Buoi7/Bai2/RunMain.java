/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author admini
 */
public class RunMain {
        public static void main(String[] args) {
        IShape[] shapes = new IShape[3];
        shapes[0] = new Rectangle(3.4, 5.3);
        shapes[1] = new Circle(5.5);
        shapes[2] = new Rectangle(7.4, 4.3);
        for (int i = 0; i < 3; i++) {
        System.out.println("Area of shapes[" + i + "]: " +
        shapes[i].getArea());
        System.out.println("Perimeter of shapes[" + i + "]: " +
            shapes[i].getPeriment());
        }
        }
}
