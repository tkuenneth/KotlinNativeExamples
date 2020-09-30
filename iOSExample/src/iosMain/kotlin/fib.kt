package com.thomaskuenneth.iosexample

actual fun fib(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> if (n >= 2) fib(n - 1) + fib(n - 2) else 0
    }
}
