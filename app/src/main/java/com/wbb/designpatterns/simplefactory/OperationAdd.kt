package com.wbb.designpatterns.simplefactory

/**
 * 加法运算
 */
class OperationAdd() :Operation{

    override var numberA: Double = 0.0;
    override var numberB: Double = 0.0;

    override fun operationResults(): Double {
         return numberA + numberB;
    }
}