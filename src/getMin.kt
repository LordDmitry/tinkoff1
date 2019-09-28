

fun getMin(a: Int, b: Int, c: Int, d: Int):Int{
    var fm = b
    var sm = c
    if (a < b){
        fm = a
    }
    if (d < c){
        sm = d
    }
    if (fm < sm){
        return fm
    }
    return sm
}


fun main() {
    print(getMin(15, 2, 1, 4))
}