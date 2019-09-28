

fun qsort(first: Int, last: Int, arr: IntArray) {
    if (first < last) {
        var medianPos = first
        var currentMedian = arr[medianPos]
        for (i in arr){
            print("$i-")
        }
        println()
        var swapped = true
        while (swapped) {
            swapped = false
            for (i in first..last) {
                if ((arr[i] > currentMedian && i < medianPos) || (arr[i] < currentMedian && i > medianPos)) {
                    arr[medianPos] = arr[i]
                    arr[i] = currentMedian
                    medianPos = i
                    swapped = true
                }
            }
        }
        qsort(first, medianPos - 1, arr)
        qsort(medianPos + 1, last, arr)

    }
}

fun sort(arr: IntArray){
    qsort(0, arr.size, arr)
}

fun main(){
    var myarr = intArrayOf(1, 4, 19, 3, 26, 5, 7)

    sort(myarr)

}