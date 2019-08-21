/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratchpapaer;

/**
 *
 * @author Santiago
 */
public class ScratchPapaer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a = 63;
    int b = 74;
    int c = 1;
    
    int max=0;
    int min=0;
    
    a = rand_num(1,100);
    b = rand_num(1,100);
    c = rand_num(1,100);
    
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    System.out.println("c:"+c);
    
    if(a > b)
    {
        max = a;
        min = b;
        
        if(a > c)
        {
            
            if(c < b)
            {
                min = c;
            }
        }
        else
        {
            max = c;
        }
    }
    else
    {
        max = b;
        min = a;
        
        if(a > c)
        {
            min = c;
           
        }
    }
    
    print(max,min);
    }
    public static void print(int max, int min)
    {
        System.out.println("Max:"+max+"\tMin:"+min);
    }
    public static int rand_num(int lower_bound, int upper_bound)
    {
    int x = (int) (Math.random()*((upper_bound-lower_bound)+1))+lower_bound;
    return x;
    }
}
