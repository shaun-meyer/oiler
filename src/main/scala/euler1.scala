package main.scala

import scala.annotation.tailrec

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

object euler1 extends App {
	val lowMult = 3
	val highMult = 5
	val below = 1000
	
	@tailrec def multiples(multipleOf: Int, currentNum: Int, multList: List[Int]): List[Int] = currentNum match {
	  case x: Int if currentNum >= below => multList
	  case _ => multiples(multipleOf, currentNum + multipleOf, currentNum :: multList)  
	}
	
	val lowList = multiples(lowMult, lowMult, List())
	val highList = multiples(highMult, highMult, List())

	println((List(lowList, highList).flatten).distinct.foldLeft(0)((a,b) => a + b))

}