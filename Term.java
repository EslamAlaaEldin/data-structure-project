/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructure;

/**
 *
 * @author Eslam
 */
public class Term {
    int coefficient;
    int power;
    Term next;

    public Term(int coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
        this.next = null;
    }
}
