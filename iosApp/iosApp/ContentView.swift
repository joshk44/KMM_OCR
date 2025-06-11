import SwiftUI
import shared

struct ContentView: View {

    var body: some View {
        if #available(iOS 26.0, *) {
            Button("Launch Camera") {}
        } else {
            // Fallback on earlier versions
        }
    }
}
struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
