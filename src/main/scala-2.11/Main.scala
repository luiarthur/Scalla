package Scalla

object Main extends App {
  println(Console.CYAN + """
  I want to in R:
    - source functions conveniently from scala
    - conveniently get and put variables to and from scala

    For example: 

      R> sourceScala("scalaFunc.scala")
    
    should read the file scalaFunc.scala and source the contents.
    The user should then be able to use the function like an R function.
    That is the function should be wrapped.

      R> x <- scalaGet("x")
      R> scalaVal(x,"y")
      R> scalaVar(x,"y")

    should first read a variable from scala (of any type) into (x)
    then put x into a scala val (or var) called "y"


  I want to in Scala (like in RCall.jl):
    - run any R function I want
      
      For Example:
        scala> val R =  org.ddahl.rscala.callback.RClient()
        scala> val plot = R get plot
        scala> plot(x,y)

      should yield a plot

    - Realistically, try doing this for the plot function only
    - allow arguments to be 
        - Matrix, Array, scalar, 
        - DenseMatrix, DenseVector 
      of any type

  """ + Console.RESET)
}
