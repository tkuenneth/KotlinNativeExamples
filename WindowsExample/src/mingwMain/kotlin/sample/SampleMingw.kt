package sample

import kotlinx.cinterop.convert
import platform.windows.MB_ICONINFORMATION
import platform.windows.MB_OK
import platform.windows.MessageBoxW

fun main(args: Array<String>) {
    val caption = "Kotlin/Native"
    val name = if (args.isNotEmpty()) args[0] else "Windows"
    val message = "Hello, $name"
    MessageBoxW(null, message,
            caption, (MB_OK or MB_ICONINFORMATION).convert())
}