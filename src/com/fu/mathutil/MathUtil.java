/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Thinkpad
 */
public class MathUtil {
    
    //n!
    //0! = 1
    //kiểu long dương và có 18 số 0
    //=> 21! là vượt quá kiểu long, tầm 20! vẫn oke
    //try catch đưa ra ngoại lệ chứ không return -1
    
    // viết truyền thống dùng for
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid Argument, n must be between 0 and 20");
        if (n == 0 || n == 1)
            return 1;
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }
    
    public static long getFactorialRecusion(int n) {   
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid Argument, n must be between 0 and 20");
        if (n == 0 || n == 1)
            return 1;        
        return n * getFactorial(n-1);
    }
    
}
