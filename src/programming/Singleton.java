/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming;

/**
 *
 * @author user
 */
public class Singleton {
    private static Singleton singInst;
    private int count = 0;
    
    private Singleton(){
    }
    
    public static Singleton getInst(){
        if(singInst == null){
            singInst = new Singleton();
        }
        return singInst;
    }
    
    public void increment(){
        if(count <= 10){
           count += 1; 
        }
    }
    
    public int displayCount(){
        if(count <= 10){
            System.out.println(count);
            return count;
        }
        else{
            return -1;
        }
    }
    
    
    
}
