val cuenta = Cuenta("01-8547-9", "Alberto Palma", 5000.00)

fun main() {

    println("PROGRAMA PARA DEPOSITAR Y RETIRAR DINERO DE UNA CUENTA")
    println("""
        Seleccione una opción
        
        1) Depositar
        2) Retirar
        
           Presione cualquier otra tecla para salir
           
    """.trimIndent())

    try {
        var opcion = readLine()!!.toInt()
        when(opcion){
            1 ->{
                cuenta.depositar()
            }
            2 ->{
                cuenta.retirar()
            }

            else->{
                println("Hasta luego")
            }
        }
    }catch (e: Exception){
        println("Hasta luego")
    }
}