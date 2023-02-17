/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanphuoc.mathutil.core;

/**
 *
 * @author huynh
 */
public class MathUtility {
    //21! vượt kiểu long - 18 con số 0
    // ta thí nghiệm hàm n! với n = 0...20 ->đủ điều kiện long
    //n! = 1 * 2 * 3 *...*n
    //ko có giai thừa âm
    //21! tràn long 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            
            throw new IllegalArgumentException("Invalid n, n must be in 1...20");
        }
        if (n == 0 || n == 1) {
            return 1;
        
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
