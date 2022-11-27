fun main (args: Array<String>){

    println("PILIHAN OPERASI : ")
    println("1. Penjumlahan")
    println("2. Perkalian")
    println("3. Pengurangan")
    println("4. Pembagian")
    print("Pilih Operasi : ")
    var opsi = readLine()

    if (opsi.equals("1")) {
        println("OPERASI PENJUMLAHAN: ")
        print("Masukkan Angka 1 : ")
        var A = readLine()!!.toInt()
        print("Masukkan Angka 2 : ")
        var B = readLine()!!.toInt()
        val hasil = A + B
        println("Hasil penjumlahan adalah: $hasil")
    } else if (opsi.equals("2")) {
        println("OPERASI PERKALIAN: ")
        print("Masukkan Angka 1 : ")
        var A = readLine()!!.toInt()
        print("Masukkan Angka 2 : ")
        var B = readLine()!!.toInt()
        val hasil = A * B
        println("Hasil Perkalian adalah: $hasil")
    }else if (opsi.equals("3")) {
        println("OPERASI PENGURANGAN: ")
        print("Masukkan Angka 1 : ")
        var A = readLine()!!.toInt()
        print("Masukkan Angka 2 : ")
        var B = readLine()!!.toInt()
        val hasil = A - B
        println("Hasil Pengurangan adalah: $hasil")
    }else if (opsi.equals("4")) {
        println("OPERASI PEMBAGIAN: ")
        print("Masukkan Angka 1 : ")
        var A = readLine()!!.toDouble()
        print("Masukkan Angka 2 : ")
        var B = readLine()!!.toDouble()
        val hasil = A / B
        println("Hasil Pembagian adalah: $hasil")
    }else {
        println("Pilihan tidak ada!")
    }
}