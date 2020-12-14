package aoc2020.d2


import scala.io.Source

object Day2Part2 extends App {
  val puzzle = Source.fromResource("input2.txt")

  var validPasswordCounter = 0

  for (line <- puzzle.getLines) {
    val password = line.split(":")(1).trim
    val letter = line.split(":")(0).split(" ")(1)
    val regex1 = line.split(":")(0).split(" ")(0).split("-")(0)
    val regex2 = line.split(":")(0).split(" ")(0).split("-")(1)

    if (password.charAt(regex1.toInt - 1) == letter.charAt(0) && password.charAt(regex2.toInt - 1) != letter.charAt(0))
      validPasswordCounter += 1
    else if (password.charAt(regex1.toInt - 1) != letter.charAt(0) && password.charAt(regex2.toInt - 1) == letter.charAt(0))
      validPasswordCounter += 1
  }

  println(s"The second result is $validPasswordCounter")
}
