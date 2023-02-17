/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tanphuoc.test.core;

import com.tanphuoc.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author huynh
 */
public class MathJUnitTest {
        //hàm getF() còn đc thiết kế rằng: nếu đưa tham số ko đúng, n<0 | n >20 thì
        //hàm đc thiết kế là ném ra ngoại lệ
        //tức là: nếu đưa n<0, ví dụ n = -5 thì sẽ nhận về - EXPECTED LÀ EXCEPTION
        //TA SẼ DÙNG JUNIT ĐỂ TEST XEM HÀM CÓ NÉM RA NGOẠI LỆ NHƯ THIẾT KẾ HAY KO
    
    @Test
    public void testRedGreenSignal() {
        Assert.assertEquals(69, 69);
        Assert.assertEquals(123, 123);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        //Test case 1 : test getF() with n = 0
        //expected : 1
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        //Test case 2 : test getF() with n=1
        //expected: 1
        //test hàm getF() với n=1, hy vọng trả về 1, tức là 1! = 1
        Assert.assertEquals(1, MathUtility.getFactorial(1));
        
         //Test case 3 : test getF() with n=6
        //expected: 720, hy vọng 6! = 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        //Viết code kiểu assertequal(expected, actual) lặp đi lặp lại => code bốc mùi (bad smell)
        //nhược điểm đoạn code trên: 
        //trộn lẫn nên ta khó nhìn thấy hết đầy đủ các test case
        //nguyên lý nghịch lý thuốc trừ sâu có khả năng xuất hiện
        //ta sẽ fix code bốc mùi lặp lại bằng 1 kĩ thuật mới: DDT - Data Driven Testing

    }
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //nguyên tắc kiểm thử là so sánh giữa expected vs actual value
        //Test case 4: test getF() with n<0
        //Expected: an Exception is thrown. In this case, illegal Argument is thrown
        //JUnit4 ko có hàm assert() Exception
        //JUnit5 có assert()
        MathUtility.getFactorial(-5);
        //Nếu chỉ viết lệnh này đứng 1 mình thì có nghĩa là ta chưa biết đc liệu rằng có ngoại lệ như kỳ vọng hay ko
        //Xanh đỏ trong t/hợp này ko phản ánh đúng ý nghĩa
        //
    }
}
