package com.wbb.designpatterns.simplefactory

/**
 *  运算父类接口
 */
interface Operation {
     var numberA: Double
     var numberB: Double

    /**
     *  运算结果
     */
   fun operationResults():Double
}