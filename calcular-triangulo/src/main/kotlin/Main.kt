fun main() {
    //trinagulo()
    anoBissexto()
}
    fun triangulo(): Unit {
        println("Digite o primeiro lado do triângulo:")
        val primeiroLado = readLine()!!.toInt()
        println("Digite o segundo lado do tiângulo:")
        val segundoLado = readLine()!!.toInt()
        println("Digite o terceiro lado do triângulo:")
        val terceiroLado = readLine()!!.toInt()

        if (primeiroLado == segundoLado && segundoLado == terceiroLado) {
            println("Triângulo Equilátero")
        } else if (primeiroLado == segundoLado && segundoLado != terceiroLado || primeiroLado != segundoLado && segundoLado == terceiroLado || primeiroLado == terceiroLado && segundoLado != terceiroLado) {
            println("Triângulo Isosceles")
        } else if (primeiroLado != segundoLado && segundoLado != terceiroLado)
            println("Triângulo Escaleno")
        else{
            println("Invalido!!!")
        }
    }
fun anoBissexto():Unit{
    println("Digite o ano:")
    val ano= readLine()!!.toInt()

    if(ano % 4 ==0 && ano % 100 !=0)
        println("É um ano bissexto")
    else if (ano % 4 == 0 && ano% 100== 0 && ano% 400== 0)
        println("Éum ano Bissexto")
    else
        println("Não é um ano bissexto")
}
