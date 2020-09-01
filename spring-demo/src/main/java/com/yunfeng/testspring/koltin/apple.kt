package com.yunfeng.testspring.koltin

object apple {
}

fun main(){
    var x=9
    when (x) {
        3 -> print(3)
        4 -> print(4)
        5 -> print(5)
        else -> print(10)
    }

    val list1 = listOf("kotlin","Android","Java","PHP","JavaScript")
    val s1= list1.map { it}.toList()
    System.out.println(s1)

}
