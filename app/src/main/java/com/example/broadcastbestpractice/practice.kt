package com.example.broadcastbestpractice

import java.lang.StringBuilder

fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(num1, num2)
}

fun plus(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun main() {
    val a = num1AndNum2(1,2, ::plus)
    val b = num1AndNum2(1, 2) { n1, n2 ->
        n1 + n2
    }
    val c = num1AndNum2(100, 2) { n1, n2 ->
        n1 * n2
    }
    val list = listOf("Apple", "Banana", "Orange")
    val result = with(StringBuilder()) {
        append("Start eating!\n")
        for (fruit in list) {
            append("$fruit\n")
        }
        append("FINISH")
    }
    println(result)
}