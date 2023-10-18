class Cuenta constructor(var clabe: String, var titular: String, var saldo: Double) {

    fun depositar(){

        var monto: Double = 0.0

        println("Ingrese el monto a depositar: ")

        try {
            monto = readLine()!!.toDouble()
            if(monto <= 0){
                println("El monto debe ser mayor a $0.0 ")
                main()
            }else{
                saldo += monto
                println("""
                    ------------- Recibo -------------
                    
                    Clabe: $clabe - Titular: $titular
                    
                    Acción: Depósito de dinero
                    Monto: $$monto
                    Saldo anterior: $${saldo-monto}
                    Nuevo saldo: $$saldo
                    
                    ----------------------------------
                    
                """.trimIndent())
            }

        }catch (e: Exception){
            println("Monto incorrecto")
        }
        main()
    }
    fun retirar(){

        var monto: Double = 0.0

        println("Ingrese la cantidad a retirar")

        try {
            monto = readLine()!!.toDouble()
            if (monto== 0.0){
                println("Ingrese un monto a retirar diferente de 0")
                main()
            }else
                if(monto > saldo){
                println("""
                    
                    El monto a retirar ($$monto) no puede ser ma0yor al saldo ($$saldo)
                    
                    No se pudo realizar la acción solicitada
                    
                """.trimIndent())
                    main()
            }else{
                saldo -= monto

                    println("""
                    ------------- Recibo -------------
                    
                    Clabe: $clabe - Titular: $titular
                    
                    Acción: Retiro de dinero
                    Monto: $$monto
                    Saldo anterior: $${saldo+monto}
                    Nuevo saldo: $$saldo
                    
                    ----------------------------------
                    
                """.trimIndent())
                    main()
            }
        }catch (e: Exception){
            println("Monto incorrecto")
            main()
        }
    }
}