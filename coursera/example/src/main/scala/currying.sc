def product(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 1
  else f(a) * product(f)(a + 1, b)

product(x => x * x)(4, 6)

def fact(x: Int): Int =
  product(x => x)(1, x)

fact(4)


def domath(f: Int => Int, combinator: (Int, Int) => Int , unitvalue: Int)(a: Int, b: Int): Int =
  if (a > b) unitvalue
  else combinator(f(a), domath(f, combinator, unitvalue)(a + 1, b))

domath(x => x * 2, (a, b) => a * b, 1)(2, 3)




