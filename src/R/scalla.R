# sourceScala("file.scala")
# Should source all the files in "file.scala"

library(rscala)
S <- scalaInterpreter()

file <- "hello.scala"
scalaSource <- function(file) {
  readLines(file)
}


S$def('x: Int',1)
S$def('x: Int','Dict("x"=>x)')
