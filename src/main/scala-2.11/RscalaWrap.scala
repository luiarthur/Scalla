package Scalla

import breeze.linalg._

object RClient2 {
  val R =  org.ddahl.rscala.callback.RClient()
  R.eval("plot(rnorm)")
  R eval """
    plot(rnorm(100))
  """
  R eval "plot(rnorm(100))"
  R eval "pairs(matrix(rnorm(100),25,4))"
  R evalD0 "x"

  val M = R evalD2 "matrix(rnorm(100),ncol=4)"
  val X = DenseMatrix.tabulate(25,4){ (i,j) => M(i)(j) }

  R eval "print(iris)"
  R evalD1 "iris[,1]"
}
