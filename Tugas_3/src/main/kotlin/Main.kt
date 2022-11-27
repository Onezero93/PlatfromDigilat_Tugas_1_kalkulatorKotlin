class bunga (namabunga : String,warnabunga:String? = null ){
    val namabunga = namabunga
    val warna = warnabunga

    fun tam (){
        println("Nama bunga")
        var namabunga = readln()
        println("Nama:" + namabunga)
        println("Warna bunga")
        var warna = readln()
        println("Jenis Bunga")
        println("Nama Bunga:" + namabunga)
        println("Warna Bunga:" + warna)
    }
}
fun main(){
    var mawar = bunga (
        namabunga = "mawar",
        warnabunga = "merah")
    mawar.tam()
}