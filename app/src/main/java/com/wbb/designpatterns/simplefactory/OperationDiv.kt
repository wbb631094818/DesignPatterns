package com.wbb.designpatterns.simplefactory

import java.lang.Exception

/**
 * 除法运算
 */
class OperationDiv :Operation{

    override var numberA: Double = 0.0;
    override var numberB: Double = 0.0;

    override fun operationResults(): Double {
        if (this.numberB == 0.0){
            throw Exception("除数不能为0");
        }
         return numberA / numberB;
    }
}