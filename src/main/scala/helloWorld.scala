// Demonstrating functions in Scala

object helloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello World!")

/*  var result = add(2,5)
    println("Addition of 2 and 5 is: " + result)*/

/*  var result = addA(2,5)
    println("Addition of 2 and 5 is: " + result)*/

/*  var result = addB(2,5)
    println("Addition of 2 and 5 is: " + result)*/

/*  var result = addC(2,5)
    println("Addition of 2 and 5 is: " + result)*/

    var result = addD(2,5)
    println("Addition of 2 and 5 is: " + result)

  }

  def add (x:Int, y:Int): Int = {
    var z = x + y
    return z
  }

  def addA (x:Int, y:Int): Int = {
    var z = x + y
    z                                             // Not mandatory to specify return keyword
  }

  def addB (x:Int, y:Int) = {                // Not mandatory to specify return Type. It is auto interpreted.
    var z = x + y
    z                                             // Not mandatory to specify return keyword
  }

  def addC (x:Int, y:Int) = {               // If you specify return keyword. You need to always specify return type
    var z = x + y
//  return z                                      // Specifying the return keyword
  }

  def addD (x:Int, y:Int) = x + y            // Not mandatory to use {} when function is written on a single line
}
