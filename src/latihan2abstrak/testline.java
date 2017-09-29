/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2abstrak;

/**
 *
 * @author SMK TELKOM
 */
public class testline {
    public static void main(String[]args){
        line a=new line(4,5,7,9);
        line b=new line(8,2,4,2);
        System.out.println("Length a : "+a.getLength());
        System.out.println("Length b : "+b.getLength());
        System.out.println("aLen > bLen : "+a.isGreater(a,b));
        System.out.println("aLen < bLen : "+a.isLess(a,b));
        System.out.println("aLen == bLen : "+a.isEqual(a,b));
    }
}
