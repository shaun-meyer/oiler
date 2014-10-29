package main.scala

import scala.annotation.tailrec

//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

object euler2 extends App {
  val maximum = 4000000
  @tailrec def fibonacci(num1: Int, num2: Int, current: List[Int]): List[Int] = {
    if (num2 >= maximum) current
    else fibonacci(num2, num1 + num2, num2 :: current)
  }
  println(fibonacci(1,2,List(1)).filter(_ % 2 == 0).foldLeft(0)((a,b) => a + b))
}
