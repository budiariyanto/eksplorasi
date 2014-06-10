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

package org.eksplorasi.unittesting.impl;

import org.eksplorasi.unittesting.Calculator;
import org.eksplorasi.unittesting.CalculatorService;

/**
 *
 * @author Budi Ariyanto <fx.budi.ariyanto at gmail.com>
 */
public class CalculatorServiceImpl implements CalculatorService {

    private Calculator calculator = null;
    
    @Override
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double add(double num1, double num2) {
        return calculator.add(num1, num2);
    }

    @Override
    public double subtract(double num1, double num2) {
        return calculator.subtract(num1, num2);
    }

    @Override
    public double multiply(double num1, double num2) {
        return calculator.multiply(num1, num2);
    }

    @Override
    public double divide(double num1, double num2) {
        return calculator.division(num1, num2);
    }
    
}
