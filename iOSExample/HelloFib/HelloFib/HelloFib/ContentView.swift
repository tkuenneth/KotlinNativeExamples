//
//  ContentView.swift
//  HelloFib
//
//  Created by Thomas Künneth on 01.08.20.
//  Copyright © 2020 Thomas Künneth. All rights reserved.
//

import SwiftUI
import iOSExample

struct ContentView: View {
    
    @State private var n: Int32 = 2
    
    var body: some View {
        VStack {
            Stepper(onIncrement: {
                if (self.n < 30) {
                    self.n += 1
                }
            }, onDecrement: {
                if (self.n > 1) {
                    self.n -= 1
                }
            }) {
                Text("fib(\(n)) = \(FibKt.fib(n: n))")
            }.padding()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
