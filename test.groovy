def myCalc

// adition
myCalc = new Calc()
assert myCalc.add(2) == 2
assert myCalc.add(2) != 1

// substraction
myCalc = new Calc()
assert myCalc.sub(3) == -3

// product
myCalc = new Calc(res:1)
assert myCalc.prod(3) == 3

// division
myCalc = new Calc(res:10)
assert myCalc.div(5) == 2

// combine operations
myCalc = new Calc()
assert myCalc.add(2) == 2
assert myCalc.add(2) == 4
assert myCalc.sub(1) == 3
assert myCalc.sub(1) == 2
assert myCalc.prod(2) == 4
assert myCalc.prod(3) == 12
assert myCalc.div(2) == 6

// adding an error for travis
assert myCalc.div(2) == 2
