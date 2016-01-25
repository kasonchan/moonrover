package scalera.moonrover

import scalera.moonrover.RoverProgram._
import scalera.moonrover.interpreter.Program

/**
  * Define here the program that
  * your rovers must execute
  * Solution by Kason Chan @kasonlchan on 1/25/16.
  */
object Launch {

  // 44
  val program = Program(
    1 -> RIGHT,
    2 -> `IF FOUND PARACHUTE`(GOTO(4)),
    3 -> GOTO(1),
    4 -> RIGHT,
    5 -> RIGHT,
    6 -> RIGHT,
    7 -> RIGHT,
    8 -> RIGHT,
    9 -> RIGHT,
    10 -> RIGHT,
    11 -> RIGHT,
    12 -> RIGHT,
    13 -> RIGHT,
    14 -> RIGHT,
    15 -> RIGHT,
    16 -> RIGHT,
    17 -> GOTO(4))

}
