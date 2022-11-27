fun main() {

    var angka = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in angka) {
        print(i )
    }
    println()
    var c = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var a = 0
    for(i in c){
        a = a + i
        print("$a ")
    }
    println()
    //memakai while
    var i = 1
    var t = 0
    while (i <= 10) {
        t = t + i
        print("$t ")
        i++
    }
    println()
    for (i in 5  downTo 1){
        for ( j in 1 .. i ){
            print("$j ")
        }
        println()
    }

    for (i in 1.. 5){
        for(j in 1.. 4){
            print(i )
        }
        println()
    }
    var awal = 1
    var akhir = 5
    for (i in 1 .. 5) {
        for(j in 1..5){
            if (j == awal || j == akhir){
                print("* ")
            } else {
                print("$j ")
            }
        }
        println()
        awal = awal + 1
        akhir = akhir - 1
    }
    println()
    for (i in 1 .. 4) {
        for(j in 1..5){
            if( i ==1|| j ==1 ||j ==5|| i == 4){
                print("* ")
            } else {
                print("$j ")
            }
        }
        println()
    }
    for (i in 1..5){
        println()
        for (j in 1..5){
            if (i == j || i+j == 6){
                println("*")
            }else{
                print("$j ")
            }
        }
    }
}