package scalera.moonrover.interpreter

import org.scalatest.{Matchers, FlatSpec}

class InterpreterTest extends FlatSpec with Matchers {

  behavior of "Interpreter"

  private val add = new Command[Int]{
    def perform(state: State[Int]): State[Int] =
      state.value + 1
  }

  it should "eval a command and return a new interpreter" in {
    val interpreter = Interpreter(1,List(add,add,add))
    val newInterpreter = interpreter.eval
    newInterpreter.state shouldEqual State(2)
    newInterpreter.commandsLeft shouldEqual Seq(add,add)
  }

  it should "make full evaluation of pending commands" in {
    val interpreter = Interpreter(1,List(add,add,add)).fullEval
    interpreter.state shouldEqual State(4)
    interpreter.commandsLeft.isEmpty shouldEqual true
  }

}