package com.yunfeng.testspring.koltin
    fun main() {
        println("hello")
        sum(5,7)
       var c= listOf("1","333","oo")
        println(c.size)
        val s=Constructors(1)
        System.out.println(s)
        val numbers = listOf("one", "two", "three", "four")
        println(numbers.associateWith { it.length })
    }
 var s:String ="jjj"

 var stringRepresentation: String
    get() = "垃圾"
    set(value) {
      //  setDataFromString(value) // 解析字符串并赋值给其他属性
    }

var names:String?=null

fun sum(a: Int, b: Int){
    println("sum of $a and $b is ${a + b}")
}


class MyClass {
    companion object {
        fun sum(a: Int, b: Int){
            println("sum of $a and $b is ${a + b}")
        }
    }
}