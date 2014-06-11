/*
 * Copyright 2014 Budi Ariyanto <fx.budi.ariyanto at gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eksplorasi.unittesting;

import org.eksplorasi.unittesting.impl.CalculatorImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Budi Ariyanto <fx.budi.ariyanto at gmail.com>
 * Test case class. JUnit4 tidak mengharuskan test class mengextend class
 * TestCase. Cukup pakai annotation @RunWith saja.
 * 
 */
@RunWith(JUnit4.class)
public class CalculatorTest {
    
    /*
     * Nama function pada JUnit4 tidak perlu menggunakan prefix test.
     * Cukup dengan menambahkan annotation @Test pada setiap test functionnya.
     * Bisa menambahkan annotation @Ignore agar test functionnya tidak
     * dijalankan.
    */
    @Test
    public void add() {
        Calculator calculator = new CalculatorImpl();
        double result = calculator.add(30, 20);
        assertEquals(50, result, 0);
    }
    
    @Test
    @Ignore
    public void subtract() {
        Calculator calculator = new CalculatorImpl();
        double result = calculator.subtract(30, 20);
        assertEquals(10, result, 0);
    }
    
    @Test
    public void multiply() {
        Calculator calculator = new CalculatorImpl();
        double result = calculator.multiply(30, 20);
        assertEquals(600, result, 0);
    }
    
    @Test
    public void division() {
        Calculator calculator = new CalculatorImpl();
        double result = calculator.division(60, 20);
        assertEquals(3, result, 0);
    }
    
    @Test(expected = ArithmeticException.class)
    public void divisionByZero() {
        int bil1 = 60;
        int bil2 = 0;
        int result = 0;
        /*
         * Di java, double dan float tidak melempar exception division by zero
         * karena pada data type double dan float bisa mengkespresikan nilai
         * infinity ataupun NaN(Not a Number). Maka, pada function test ini
         * secara khusus akan diubah ke dalam integer lalu kita lakukan operasi
         * pembagian. Tujuan dari test ini adalah melihat bagaimana JUnit
         * dapat melakukan test berdasarkan exception yang seharusnya raised.
        */
        result = bil1/bil2;
    }
}
