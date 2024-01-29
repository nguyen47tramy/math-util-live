package com.fu.mathutil;

public class MathUtilLive {

    
    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120 \nactual: " + result);
        System.out.println("expected: 1! = 1 \nactual: " + MathUtil.getFactorial(1));
        //kỹ thuật kiểm thử phần mềm: ước tính kết quả trả về của hàm
        
        long recursionResult = MathUtil.getFactorialRecusion(5);
        System.out.println("expected: 5! = 120 \nactual: " + recursionResult);
        System.out.println("expected: 1! = 1 \nactual: " + MathUtil.getFactorialRecusion(1));
    }
    
}
