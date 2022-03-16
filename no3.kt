class barang (val _nama: String, var _harga: Int = 5000, var _jumlah: Int = 2, var _diskon: Int = 1000) {
    val nama = _nama
    var harga = _harga
    var jumlah = _jumlah
    var diskon = _diskon

    fun tampil() {
        println("Nama : " + nama)
        println("Harga : " + harga)
        println("Jumlah : " + jumlah)
        println("Diskon : " + diskon)
    }

    fun hitungTotal () {
        var total = harga * jumlah * diskon
        print(total)
    }
}

fun main(args: Array<String>) {
    val peci = barang("Peci")
    val total = barang("total")
    peci.tampil()
    total.hitungTotal()
}