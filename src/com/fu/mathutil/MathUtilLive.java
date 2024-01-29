/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Thinkpad
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120 \nactual: " + result);
        //kỹ thuật kiểm thử phần mềm: ước tính kết quả trả về của hàm
        
        long recursionResult = MathUtil.getFactorialRecusion(5);
        System.out.println("expected: 5! = 120 \nactual: " + recursionResult);
    }
    
}
