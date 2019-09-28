import java.util.*

fun isCapitalized(s: String): Boolean{
    return  s[0].toString() == s[0].toString().capitalize()
}

val scans = Scanner(System.`in`)
fun main(){
    var S = readLine()!!.toString()
    print(isCapitalized(S))
    S = readLine()!!.toString()
    print(isCapitalized(S))
    S = readLine()!!.toString()
    print(isCapitalized(S))
}