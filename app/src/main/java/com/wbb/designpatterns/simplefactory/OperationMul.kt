package com.wbb.designpatterns.simplefactory

/**
 * 乘法运算
 */
class OperationMul :Operation{

    override var numberA: Double = 0.0;
    override var numberB: Double = 0.0;

    override fun operationResults(): Double {
         return numberA * numberB;
    }
}