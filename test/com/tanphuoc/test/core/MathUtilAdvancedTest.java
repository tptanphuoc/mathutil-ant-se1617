/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tanphuoc.test.core;

import com.tanphuoc.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author huynh
 */
@RunWith(value = Parameterized.class)
//báo với JUnit và JVM rằng class này sẽ tách data ra khỏi câu lệnh Assertequal()
//về logic, khi run class này, JUnit sẽ tự sinh ra thêm code để fill data vào trong hàm assertEqual() cho mình
//mình bị phải viết code theo cách JUnit yêu cầu thì mới sửa đc bad smell
//dùng code theo cách thức bị ép tuân thủ theo 1 logic nào đó => framework
public class MathUtilAdvancedTest {
    //chuẩn bị data - mảng 2 chiều
    @Parameterized.Parameters
    public static Object[][] initData() {
        //mảng 1 chiều
        int a[] = {5, 10, 15, 20};
        
        return new Object [][]  {
                                        {0, 1},
                                        {1, 1},
                                        {2, 2},
                                        {3, 6},
                                        {4, 24},
                                        {5, 120}
            
                                    };
    }
    //map 1 dòng gồm 2 cột vào 2 biến n và expected
    //JUnit sẽ tự loop qua từng dòng của mảng để gán data các cột vào 2 biến tương ứng
    @Parameterized.Parameter(value = 0)
    public int n;
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    //Test
    @Test
    public void testFactorialGivenRightRightArgumentRunsWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
