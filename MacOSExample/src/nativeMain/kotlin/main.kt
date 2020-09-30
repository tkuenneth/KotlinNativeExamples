import platform.AppKit.*

fun main() {
    val alert = NSAlert()
    alert.messageText = "Welcome"
    alert.informativeText = "Hallo macOS"
    alert.icon = NSImage.imageNamed(NSImageNameInfo!!)!!
    alert.alertStyle = NSAlertStyleInformational
    alert.addButtonWithTitle("OK")
    val result = alert.runModal()
    if (result == NSAlertFirstButtonReturn) {
        println("first")
    }
}