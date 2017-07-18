/**
  * Created by Administrator on 18/07/2017.
  */
object Main {
  def main(args:Array[String]): Unit ={
    val numbers = Array(Tuple3(6,"million","million"),
      Tuple3(9,"billion","milliard"),
      Tuple3(12,"trillion","billion"),
      Tuple3(15,"quadrillion","billiard"),
      Tuple3(18,"quintillion","trillion"),
      Tuple3(21,"sextillion","trilliard")
      )

    var input = scala.io.StdIn.readLine()
      var inputLen = input.length
    def test(iteration:Int): Unit ={
      if(inputLen > numbers(iteration)._1){
        test(iteration+1)
      }else{
        println("Your number in short scale is: "+numbers(iteration)._2 + " or in large scale: "+ numbers(iteration)._3)
      }
    }
    test(0)


  }

}
