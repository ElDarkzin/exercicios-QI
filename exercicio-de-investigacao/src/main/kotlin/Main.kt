fun main() {
    println("Responda usando 1 ou 0:\n1= Sim\n0= Nao")
    detetive()
}
fun detetive():Unit{
    println("Telefonou para a vítima?")
    val pergunta = readLine()!!.toInt()
    if(pergunta ==1)
    else if(pergunta==0)
    else
        println("Resposta Invalida!!!")

    println ("Esteve no local do crime?")
    val pergunta2 = readLine()!!.toInt()
    if (pergunta2 == 1)
    else if (pergunta2 ==0)
    else
        println("Resposta Invalida!!!")

    println("Mora perto da Vitima?")
    val pergunta3 = readLine()!!.toInt()
    if(pergunta3 == 1)
    else if (pergunta3== 0)
    else
        println("Resposta Invalida!!!")

    println("Devia para a Vitima?")
    val pergunta4 = readLine()!!.toInt()
    if (pergunta4 ==1)
    else if (pergunta4 ==0)
    else
        println("Resposta Invalida!!!")

    println("Já trabalhou com a Vitima?")
    val pergunta5 = readLine()!!.toInt()
    if(pergunta5 ==1)
    else if(pergunta5 ==0)
    else
        println("Resposta Invalida!!!")

    val media= (pergunta + pergunta2 + pergunta3 + pergunta4 + pergunta5)
    if(media<=1)
        println("Você é Inocente!!!")
    else if (media == 2)
        println("Você é Suspeito!!!")
    else if (media <=4)
        println("Você é Cumplice!!!")
    else if (media == 5)
        println("Você é o assassino!!!")
    else
        println("Resposta Invalida!!!")

}
