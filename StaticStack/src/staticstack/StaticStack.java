/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticstack;

/**
 *
 * @author luan
 */
public class StaticStack {

    private static int top;
    private static int[] elements;

    public StaticStack(int capacity) {
        elements = new int[capacity];
    }
    
    public static void push(int element){
        for (int i = 0; i <elements.length; i++) {
            StaticStack.elements[i] = element;
        }
        
    }
    
    @Override
    public String toString(){ 
        String s = "[";
        for (int element : elements) {
            s += "[" + element;
            s += "]"; 
        }
       return s;
    }

}
