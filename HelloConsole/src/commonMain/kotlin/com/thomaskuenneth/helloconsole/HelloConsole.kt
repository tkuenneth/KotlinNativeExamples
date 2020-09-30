package com.thomaskuenneth.helloconsole

fun main(args: Array<String>) {
    val name = if (args.size == 1)
        args[0]
    else
        getName()
    print("Hello, $name")
}