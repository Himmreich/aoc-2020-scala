package aoc2020

import scala.io.Source
import scala.util.control.Breaks.break

object Day1Part1 extends App {
  val puzzle = Source.fromResource("input1.txt")

  for (line <- puzzle.getLines()) {
    for (line2 <- puzzle.getLines()) {
      if(line.toInt + line2.toInt == 2020) {
        println(s"The first result is ${line.toInt * line2.toInt}")
        break
      }
    }
  }
}
