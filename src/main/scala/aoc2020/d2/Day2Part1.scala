package aoc2020.d2

import scala.io.Source

object Day2Part1 extends App {
  val puzzle = Source.fromResource("input2.txt")

  var validPasswordCounter = 0

  for (line <- puzzle.getLines) {
    val password = line.split(":")(1).trim
    val letter = line.split(":")(0).split(" ")(1)
    val regex1 = line.split(":")(0).split(" ")(0).split("-")(0)
    val regex2 = line.split(":")(0).split(" ")(0).split("-")(1)

    var counter = 0

    for (i <- 0 until password.size) {
      if(password.charAt(i) == letter.charAt(0))
        counter += 1
    }

    if(counter >= regex1.toInt && counter <= regex2.toInt)
      validPasswordCounter += 1
  }

  println(s"The first result is $validPasswordCounter")
}
