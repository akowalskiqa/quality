
object Main {
  def main(args:Array[String]): Unit ={
    var input = scala.io.StdIn.readLine()
   // buildString("",0,input,1)
    buildString("",0,input,1)
  }
  var resultA =""

  val numbers = Array(Tuple2("",""),
    Tuple2(" thousands and "," thousands and "),
    Tuple2(" million "," million "),
    Tuple2(" billion "," milliard "),
    Tuple2(" trillion "," billion "),
    Tuple2(" quadrillion "," billiard "),
    Tuple2(" quintillion "," trillion "),
    Tuple2(" sextillion "," trilliard ")
  )
  def getPosition(index:Int, shortOrLong:Int): String ={
    shortOrLong match{
      case 1 => numbers(index)._1
      case 2 => numbers(index)._2
    }}

  def buildString(currentString:String,byThrees:Int,message:String,printExample:Int): Unit ={
    var outPut = currentString
    if (message.length > 3) {
      outPut = message.substring(message.length - 3, message.length) + getPosition(byThrees,printExample) + outPut
      val restOfMessage = message.substring(0, message.length - 3)
      buildString(outPut, byThrees + 1, restOfMessage, printExample)
    } else {
      outPut = message + getPosition(byThrees,printExample) + outPut
      println(outPut)
      resultA= outPut
    }
  }

}
