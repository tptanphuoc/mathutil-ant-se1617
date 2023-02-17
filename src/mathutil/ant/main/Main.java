/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathutil.ant.main;

import com.tanphuoc.mathutil.core.MathUtility;

/**
 *
 * @author huynh
 */
public class Main {
    
    public static void main(String[] args) {
        testFactorialGivenRightArgumentRerturnWell();
    }

    /*Dân dev phải có trách nhiệm với những hàm/method mình viết ra
    tức là đảm bảo rằng hàm chạy đúng như thiết kế
    hàm getFactorial() đc thiết kế rằng:
    nếu đưa n<0 hoặc n>20 sẽ chửi, ném ra ngoại lệ
    nếu đưa n=0...20 -> tính đúng n!
    Dân dev sẽ kiểm thử hàm đúng như thiết kế hay ko
    KIỂM THỬ - DÙNG THỬ - MÔ PHỎNG CÁC TÌNH HUỐNG - CASE
    Hàm sẽ đc dùng trong tương lai
    hàm sẽ đc dùng theo 2 cách dựa theo thiết kế
    đưa data tử tế n từ 0...20
    đưa data cà chớn n<0 hoặc n>20
     */
    //tên hàm kiểm thử viết theo cú pháp con lạc đà - camel case notation
    //và phải mang ý nghĩa/mục đích kiểm thử
    public static void testFactorialGivenRightArgumentRerturnWell() {
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); //gọi hàm tính giai thừa, xem kq trả về, so sánh expected và actual value
        System.out.println("Test " + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        /*Case 2: test getF() with n=1
        expected value =1 luôn
        -> Kiểm tra xem 1! có đúng là 1 ko
         */
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        //Test case 3: test getF() with n = 2
        System.out.println("Test " + 2 + "! | expected: " + 2
                + " | actual: " + MathUtility.getFactorial(3));
    }
}
