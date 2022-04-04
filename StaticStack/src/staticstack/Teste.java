/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticstack;

/**
 *
 * @author luan
 */
public class Teste {
    public static void main(String[] args) {
        
        System.out.println("");
        StaticStack staticStack = new StaticStack(5);
        
        for (int i = 0; i <5; i+=2) {
            staticStack.push(i);
        }
        
        System.out.println(staticStack);
        
    }
}
