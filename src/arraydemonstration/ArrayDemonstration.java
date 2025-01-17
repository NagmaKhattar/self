/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemonstration;

/**
 *
 * @author HP
 */
public class ArrayDemonstration {

    /**
     * @param args
     * the command
     * line
     * arguments
     * change
     changing in github
     showing fetch and merge
     * only in check branch
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] ar=new int [4];
        for(int i=0; i<=ar.length-1; i++)
        {
            ar[i]=(int)(Math.random()*100+99);
        }
        System.out.println("Values are");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
    }
    
}
