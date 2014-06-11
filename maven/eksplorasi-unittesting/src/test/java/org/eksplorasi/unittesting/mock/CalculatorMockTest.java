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

import org.eksplorasi.unittesting.Calculator;
import org.eksplorasi.unittesting.CalculatorService;
import org.eksplorasi.unittesting.impl.CalculatorImpl;
import org.eksplorasi.unittesting.impl.CalculatorServiceImpl;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Budi Ariyanto <fx.budi.ariyanto at gmail.com>
 */

/* 
    Karena JUnit mau integrasi sama mockito, junit diset supaya pakai
    MockitoJUnitRunner
*/
@RunWith(MockitoJUnitRunner.class)
public class CalculatorMockTest {
    private CalculatorService calculatorService;
    private Calculator calculator = null;
    
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
    public void add() {
        /*
            Kita set behaviour dari mock object calculatornya. Pada contoh ini
            kita set calculatornya supaya pas mengeksekusi function add dengan
            argumen pertama bernilai 2 dan argumen kedua bernilai 4, maka fungsi
            add akan mengembalikan nilai 6.
        */
        when(calculator.add(2d, 4d)).thenReturn(6d);
        
        /*
            Calculator service memanggil function add dengan argumen 2 dan 4.
            Nah calculator service ini kan sebenernya manggil function add dari
            object calculator. Terusnya object calculatornya ini kan tadi bukan
            asli tapi cuma object mock yang udah kita setting behaviournya.
            Karena argumennya 2 dan 4, berarti harusnya nanti function add
            dari mock objectnya mengembalikan nilai 6.
            Argumennya harus 2 dan 4 (harus sesuai) biar mock objectnya bereaksi 
            manggil function add, soalnya kan tadi kita set behaviour dari 
            function add dari object mocknya argumennya 2 dan 4.
        */
        double result = calculatorService.add(2d, 4d);
        
        /*
            Verifikasi kalau function add dari object mock calculator sudah
            dipanggil dari function calculatorService.add(num1, num2)
        */
        verify(calculator).add(2d, 4d);
        
        //Cek apakah hasilnya beneran 6
        assertEquals(6d, result, 0);
    }
    
}
