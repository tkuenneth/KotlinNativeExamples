#include <QApplication>
#include <QLabel>
#include <QWidget>

#include "libnative_api.h"

int main(int argc, char *argv[])
{
  libnative_ExportedSymbols* lib = libnative_symbols();
  const char* msg = lib->kotlin.root.getMessage();

  QApplication app(argc, argv);
  QLabel hello(msg);
  hello.setWindowTitle("Kotlin/Native");
  hello.resize(400, 400);
  hello.show();
  int result = app.exec();

  lib->DisposeString(msg);  
  return result;
}
