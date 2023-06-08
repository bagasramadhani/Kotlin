package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        validation("Bagas Ramadhani")
        validation("")
    }
    catch (error : Exception){
        println( "${error.message}")

    }
}

fun validation (name:String)  {
    if (name.isBlank()){
        throw Exception ("Nama tidak boleh kosong") }
    else {
        println("Selamat datang  $name")
    }


}