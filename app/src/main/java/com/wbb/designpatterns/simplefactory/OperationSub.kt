package com.wbb.designpatterns.simplefactory

/**
 * 减法运算
 */
class OperationSub :Operation{

    override var numberA: Double = 0.0;
    override var numberB: Double = 0.0;

    override fun operationResults(): Double {
         return numberA - numberB;
    }
}