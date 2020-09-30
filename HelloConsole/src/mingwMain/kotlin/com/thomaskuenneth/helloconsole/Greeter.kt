package com.thomaskuenneth.helloconsole

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import platform.posix.*

@ExperimentalUnsignedTypes
@Suppress("UNCHECKED_CAST")
actual fun getName(): String {
    val size: size_t = 100.toULong()
    val buf = malloc(size) as CPointer<ByteVar>
    fgets(buf, 100, stdin)
    val result = buf.toKString()
    free(buf)
    return result
}

actual fun print(s: String) {
    printf("%s\n", s)
}