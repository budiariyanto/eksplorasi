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

import java.util.ArrayList;
import java.util.Collection;
import org.eksplorasi.unittesting.impl.CalculatorImpl;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Budi Ariyanto <fx.budi.ariyanto at gmail.com>
 * Test class dengan parameter yang dimasukkan melalui constructor
 */
/*
    Karena mau ngetes yang input valuenya disupply dari parameter, junit
    runnernya diset jadi pakai Parameterized.class
*/
@RunWith(Parameterized.class)
public class CalculatorParameterizedAddTest {
    
    private double num1;
    private double num2;
    private double expectedResult;
    
    @Parameters
    public static Collection<Double[]> getTestParameters() {
        Collection<Double[]> params = new ArrayList<>();
        Double[] params1 = new Double[] {50d,30d,20d};
        Double[] params2 = new Double[] {-20d,-50d,30d};
        Double[] params3 = new Double[] {10d,50d,-40d};
        params.add(params1);
        params.add(params2);
        params.add(params3);
        return params;
    }
    
    public CalculatorParameterizedAddTest(double expectedResult, double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.expectedResult = expectedResult;
    }
    
    @Test
    public void add() {
        Calculator calculator = new CalculatorImpl();
        double result = calculator.add(num1, num2);
        assertEquals(expectedResult, result, 0);
    }
}
