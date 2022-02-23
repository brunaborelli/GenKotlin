fun main() {

    /* Faça um programa que receba a idade de uma pessoa
    e mostre na saída em qual categoria ela se encontra:
    10-14 infantil
    15-17 juvenil
    18-25 adulto */

    print("Insira sua idade: ")
    val idade = readLine()!!.toInt()

    when(idade){
        in 10..14 -> println("Você se encontra na categoria Infantil")
        in 15..17 -> println("Você se encontra na categoria Juvenil")
        in 18..25 -> println("Você se encontra na categoria Adulto")
        else -> println("Puts kk")
    }
}