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

package org.eksplorasi.unittesting.mock;

import java.util.ArrayList;
import java.util.Collection;
import org.eksplorasi.unittesting.Calculator;
import org.eksplorasi.unittesting.CalculatorService;
import org.eksplorasi.unittesting.impl.CalculatorServiceImpl;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Budi Ariyanto <fx.budi.ariyanto at gmail.com>
 */
/*
    Karena mau ngetes yang input valuenya disupply dari parameter, junit
    runnernya diset jadi pakai Parameterized.class
*/
@RunWith(Parameterized.class)
public class CalculatorParameterizedMockTest {
    private CalculatorService calculatorService;
    private Calculator calculator = null;
    
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
    
    public CalculatorParameterizedMockTest(double expectedResult, double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.expectedResult = expectedResult;
    }
    
    @Before
    public void initMockObject() {
        /*
            Object calculator dimock, jadi ibaratnya tu pokoknya ada object
            calculatornya aja deh
        */
        calculator = mock(Calculator.class);
        
        /*
            Calculator service.
            Ini class/interface yang mau ditest. Jadi harusnya testingnya fokus
            sama class/interface ini. Class/interface ini diinstantiatekan
            concrete objectnya.
        */
        calculatorService = new CalculatorServiceImpl();
        
        /*
            Interface ini punya dependensi object calculator. Daripada
            instantiate object calculator beneran, mendingan pake mock object
            calculator yang tadi udah dibuat. Kenapa? Supaya kita nggak usah
            mikirin object calculatornya. Kan tadi maunya fokus testing untuk
            CalculatorService. Pokoknya, taunya calculatornya dikasih object
            calculator aja.
        */
        calculatorService.setCalculator(calculator);
    }
    
    @Test
    public void addWithDynamicArgument() {
        /*
            Kita set behaviour dari mock object calculatornya. Pada contoh ini
            kita set calculatornya supaya pas mengeksekusi function add dengan
            argumen pertama bernilai 2 dan argumen kedua bernilai 4, maka fungsi
            add akan mengembalikan nilai 6.
        */
        when(calculator.add(anyDouble(), anyDouble())).thenReturn(expectedResult);
        
        /*
            Calculator service memanggil function add dengan argumen 2 dan 4.
            Nah calculator service ini kan sebenernya manggil function add dari
            object calculator. Terusnya object calculatornya ini kan tadi bukan
            asli tapi cuma object mock yang udah kita setting behaviournya.
            Karena argumennya 2 dan 4, berarti harusnya nanti function add
            dari mock objectnya mengembalikan nilai 6.
        */
        double result = calculatorService.add(num1, num2);
        
        /*
            Verifikasi kalau function add dari object mock calculator sudah
            dipanggil
        */
        verify(calculator).add(anyDouble(), anyDouble());
        
        //Cek apakah hasilnya beneran 6
        assertEquals(expectedResult, result, 0);
    }
}
