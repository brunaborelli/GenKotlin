fun main() {

    // Faça um programa que receba três inteiros e diga qual deles é o maior.

    print("Digite um valor inteiro: ")
    var yi = readLine()!!.toInt()
    print("Digite um valor inteiro: ")
    var er = readLine()!!.toInt()
    print("Digite um valor inteiro: ")
    var san = readLine()!!.toInt()

    if(yi >= er && yi >= san){
        print("O maior valor dentre os fornecidos é: $yi")
    } else if(er >= yi && er >= san){
        print("O maior valor dentre os fornecidos é: $er")
    } else{
        print("O maior valor dentre os fornecidos é: $san")
    }
}