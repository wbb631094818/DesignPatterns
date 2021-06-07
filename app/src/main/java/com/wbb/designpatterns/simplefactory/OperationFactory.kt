package com.wbb.designpatterns.simplefactory

/**
 *  简单工程  运行
 */
public class OperationFactory {

   companion object{
       // 这里的全是静态的方法和变量
       public fun  createOperate(operate:String):Operation{
           var operation:Operation? = null;
           when(operate){
               "+"->operation= OperationAdd()
               "-"->operation= OperationSub()
               "*"->operation= OperationMul()
               "/"->operation= OperationDiv()
           }
           return operation!!
       }
   }
}