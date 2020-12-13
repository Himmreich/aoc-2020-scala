package aoc2020

import scala.io.Source
import scala.util.control.Breaks.break

object Day1Part2 extends App {
  val puzzle = Source.fromResource("input1.txt")

  for (line <- puzzle.getLines()) {
    for (line2 <- puzzle.getLines()) {
      for (line3 <- puzzle.getLines()) {
        if(line.toInt + line2.toInt + line3.toInt == 2020) {
          println(s"The second result is ${line.toInt * line2.toInt * line3.toInt}")
          break
        }
      }
    }
  }
}
