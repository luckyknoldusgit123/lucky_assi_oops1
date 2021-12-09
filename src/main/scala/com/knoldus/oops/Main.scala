package com.knoldus.oops

object Main {
  def main(args: Array[String]): Unit = {
    //DoubleQueue class's methods
    val doubleQueue = new DoubleQueue
    println("The double queue is..")
    doubleQueue.enqueue(12)
    doubleQueue.enqueue(36)
    doubleQueue.enqueue(55)
    doubleQueue.enqueue(87)
    doubleQueue.enqueue(64)
    doubleQueue.enqueue(68)

    for(value <- doubleQueue.queue) print(value+"=>")
    println()

    doubleQueue.dequeue()
    for(value <- doubleQueue.queue) print(value+"=>")
    println()

    doubleQueue.dequeue()
    for(value <- doubleQueue.queue) print(value+"=>")
    println()

    doubleQueue.dequeue()
    for(value <- doubleQueue.queue) print(value+"=>")
    println()

    // SquareQueue class's methods
    val squareQueue = new SquareQueue
    println("The squared queue is..")
    squareQueue.enqueue(1)
    squareQueue.enqueue(2)
    squareQueue.enqueue(3)
    squareQueue.enqueue(4)
    squareQueue.enqueue(5)
    squareQueue.enqueue(6)
    squareQueue.enqueue(7)
    squareQueue.enqueue(8)
    squareQueue.enqueue(9)

    for(value <- squareQueue.queue) print(value+"=>")
    println()

    squareQueue.dequeue()
    for(value <- squareQueue.queue) print(value+"=>")
    println()

    squareQueue.dequeue()
    for(value <- squareQueue.queue) print(value+"=>")
    println()

    squareQueue.dequeue()
    for(value <- squareQueue.queue) print(value+"=>")
    println()

    squareQueue.dequeue()
    for(value <- squareQueue.queue) print(value+"=>")
    println()
    println(squareQueue.front)
    println(squareQueue.rear)
  }


}
