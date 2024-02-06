import kotlin.math.pow
import kotlin.math.round
import kotlin.math.exp
import kotlin.math.abs
import kotlin.math.ln
fun main ()
{
    try
    {
        println ("Задание 3")
        print ("Введите первый член прогрессии: ")
        var a = readLine()!!.toDouble()
        print("Введите знаменатель: ")
        var b = readLine()!!.toDouble()
        print ("Введите номер, с которого нужно начать: ")
        var k = readLine()!!.toInt()
        print ("Введите номер, до которого нужно выполнять прогрессию: ")
        var p = readLine()!!.toInt()
        if (k>0 && p>k)
        {
        var sum =0.toDouble()
        var z =1
        while (z<k)
        {
            a = a*b
            z = z+1
        }
        while (z<=p)
        {
            sum = sum+a
            a = a*b
            z = z+1
        }
            println("Сумма: $sum")
        }
        else println("Ошибка")
    }
    catch (e:Exception)
    {
        println("Ошибка")
    }
    try
    {
        println ("\nЗадание 13")
        print ("a: ")
        var a1 = readLine()!!.toDouble()
        print("b: ")
        var b1 = readLine()!!.toDouble()
        print ("c: ")
        var c1 = readLine()!!.toDouble()
        if (a1>0 && b1>0 && c1>0)
        {

            var p = (a1 + b1 + c1) / 2
            var h = String.format("%.2f",((2 / a1) * (Math.sqrt(p * (p - a1) * (p - b1) * (p - c1)))))
            var m = String.format("%.2f", (0.5 * (Math.sqrt(2 * b1.pow(2) * 2 * c1.pow(2) - a1.pow(2)))))
            var bis = String.format("%.2f",(((2 * (Math.sqrt(b1 * c1 * p * (p - a1)))) / (b1 + c1))))
            println("Высота по а: $h \nМедиана по а:$m \nБиссектрисса угла а:$bis")
        }
        else {
            println("У треугольника не может быть таких сторон")
        }
    }
    catch (e:Exception)
    {
        println("Ошибка")
    }

    try
    {
        println ("\nЗадание 6(3)")
        print ("x: ")
        var x = readLine()!!.toDouble()
        var x1 = String.format("%.2f", (Math.sqrt(abs(x)) * ln(x.pow(2))) / (-5 / 4 * x + exp(x / 2)))
        println("x = $x1")


    }
    catch (e:Exception)
    {
        println("Ошибка")
    }
}

