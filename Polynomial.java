/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructure;

/**
 *
 * @author Eslam
 */
public class Polynomial {
    Term head;
    Polynomial(){
        this.head=null;
    }
    void addTerm(int coefficient,int power){
        if(coefficient==0){
            return;
        }
        Term newTerm =new Term(coefficient,power);
        if(head == null){
            head = newTerm;
        }
        else{
            Term current = head;
            while(current.next != null){
                current =current.next;
            }
            current.next  = newTerm;
        }
        
    }
    Polynomial add(Polynomial p2){
        Polynomial result =new Polynomial();
        Term t1 = head;
        Term t2 = p2.head;
        while(t1 !=null && t2 !=null){
            if(t1.power == t2.power){
                int sum =t1.coefficient +t2.coefficient;
                result.addTerm(sum, t1.power);
                t1 =t1.next;
                t2 =t2.next;
            }
            else if(t1.power >t2.power){
                result.addTerm(t1.coefficient, t1.power);
                t1 =t1.next;
            }
            else{
                result.addTerm(t2.coefficient, t2.power);
                t2 =t2.next;
            }
        }
        while(t1 != null){
            result.addTerm(t1.coefficient, t1.power);
            t1 =t1.next;
        }
        while(t2 != null){
            result.addTerm(t2.coefficient, t2.power);
            t2 =t2.next;
        }
        return result;
    }
    
    Polynomial subtract(Polynomial p2){
        Polynomial result =new Polynomial();
        Term t1 =head;
        Term t2 =p2.head;
        while(t1 !=null && t2 !=null){
            if(t1.power == t2.power){
                int sub =t1.coefficient - t2.coefficient;
                result.addTerm(sub, t1.power);
                t1 =t1.next;
                t2 =t2.next;
            }
            else if(t1.power > t2.power){
                result.addTerm(t1.coefficient, t1.power);
                t1 =t1.next;
            }
            else{
                result.addTerm(t2.coefficient, t2.power);
                t2 =t2.next;
            }
        }
        while(t1 !=null){
            result.addTerm(t1.coefficient, t1.power);
            t1 =t1.next;
        }
        while(t2 !=null){
            result.addTerm(t2.coefficient, t2.power);
            t2 =t2.next;
        }
        return result;
    }
    Polynomial multiply(Polynomial p2){
        Polynomial result =new Polynomial();
        Term t1=head;
        while(t1 !=null){
            Term t2=p2.head;
            while(t2 !=null){
                int coeff=t1.coefficient * t2.coefficient;
                int pow =t1.power + t2.power;
                result.addTerm(coeff, pow);
                t2 =t2.next;
            }
            t1 =t1.next;
        }
        return result;
    }
    int evaluate(int x){
        int result =0;
        Term current =head;
        while( current !=null){
            result += current.coefficient * Math.pow(x, current.power);
            current =current.next;
        }
        return result;
    }
    void printPoly(){
        Term current =head;
        boolean flag=true;
        while(current !=null){
            if(current.coefficient !=0){
                if(flag){
                    System.out.print(current.coefficient +"x^" +current.power);
                    flag =false;
                }
                else{
                    if(current.coefficient >0){
                        System.out.print("+");
                    }
                    else{
                        System.out.print("-");
                    }
                    System.out.print(Math.abs(current.coefficient) +"x^" +current.power);
                }
            }
            current =current.next;
        }
         System.out.println(" ");
    }
   public Polynomial arrange(Polynomial p){
        Polynomial result =new Polynomial();
        Term t1=head;
        Term current=head;
        int coef=0;
        while(t1 !=null){
            while(current !=null){
                if(current.power ==head.power){
                     int coeff =current.coefficient;
                     coef +=coeff;  
                }
                current =current.next;
            }
            result.addTerm(coef,head.power );
            head =head.next;
          
        }
        return result;
    }
      
}
