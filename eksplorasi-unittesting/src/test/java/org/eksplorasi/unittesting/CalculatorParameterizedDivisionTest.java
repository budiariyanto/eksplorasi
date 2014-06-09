/*
 * Copyright 2014 budi.
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

import java.util.ArrayList;
import java.util.Collection;
import org.eksplorasi.unittesting.impl.CalculatorImpl;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author budi
 */
@RunWith(Parameterized.class)
public class CalculatorParameterizedDivisionTest {
    
    private double num1;
    private double num2;
    private double expectedResult;
    
    /**
    * Parameter yang dipakai untuk ngetes.
    * Yang masih jadi pertanyaan adalah parameter yang ekspektasi resultnya
    * adalah Infinity(bilangan tak terhingga). Karena kita harus memasukkan
    * expected resultnya ke dalam parameter, berarti ketika ada pembagian
    * yang pembaginya adalah 0 dan expected resultnya adalah infinity, maka
    * seolah-olah function/unit yang ditest tidak ada error padahal kalau
    * dijalankan pasti akan terjadi Arithmetic exception division by zero.
    * Ada ide gimana cara ngetesnya?
    * @return Collection
    */
    @Parameters
    public static Collection<Double[]> getTestParameters() {
        Collection<Double[]> params = new ArrayList<>();
        Double[] params1 = new Double[] {5d,100d,20d};
        Double[] params2 = new Double[] {-2d,-60d,30d};
        Double[] params3 = new Double[] {0d,0d,-40d};
        Double[] params4 = new Double[] {Double.POSITIVE_INFINITY,40d,0d};
        params.add(params1);
        params.add(params2);
        params.add(params3);
        params.add(params4);
        return params;
    }
    
    public CalculatorParameterizedDivisionTest(double expectedResult, double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.expectedResult = expectedResult;
    }
    
    @Test
    public void division() {
        Calculator calculator = new CalculatorImpl();
        double result = calculator.division(num1, num2);
        assertEquals(expectedResult, result, 0);
    }
}
