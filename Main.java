/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructure;
import java.util.Scanner;

/**
 *
 * @author Eslam
 */
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your first polynomial");
        System.out.println(" ");
        System.out.println("please enter coefficient seberated with space");
        String[] coeff1=sc.nextLine().split(" ");
        Polynomial p1=new Polynomial();
        System.out.println("please enter power seberated with space ");
        String[] pow1 =sc.nextLine().split(" ");
        for (int i = 0; i < coeff1.length; i++) {
            int coefficient =Integer.parseInt(coeff1[i]);
            int power =Integer.parseInt(pow1[i]);
            p1.addTerm(coefficient, power);
             
        }
        System.out.println("please enter your second polynomial");
        System.out.println(" ");
        System.out.println("please enter coefficient seberated with space");
        String[] coeff2=sc.nextLine().split(" ");
        Polynomial p2=new Polynomial();
        System.out.println("please enter power seberated with space");
        String[] pow2=sc.nextLine().split(" ");
        for (int i = 0; i < coeff2.length; i++) {
            int coefficient =Integer.parseInt(coeff2[i]);
            int power =Integer.parseInt(pow2[i]);
            p2.addTerm(coefficient, power);
            
        }
        Polynomial add=p1.add(p2);
        Polynomial product=p1.multiply(p2);
        Polynomial sub=p1.subtract(p2);
        
        System.out.println("the addition of two polynomials ia: ");
        add.printPoly();
        
        System.out.println("the product of two polynomials is: ");
         product.printPoly();
        
        System.out.println("the subtract of two polynomials is: ");
        sub.printPoly();
        
        System.out.println("please enter the value of x to evaluate the polynomial");
        int x=sc.nextInt();
        
        int valAdd=add.evaluate(x);
        int valProduct=product.evaluate(x);
        int valSubtract=sub.evaluate(x);
        System.out.println("the value of the result of addition at the point x is: "+valAdd);
        System.out.println(" ");
        System.out.println("the value of the result of product at the point x  is: "+valProduct);
        System.out.println(" ");
        System.out.println("the value of the result at the point x of  is: "+valSubtract);
        
          
    }
   
}
