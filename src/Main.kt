fun main() {
    var history = mutableListOf<Operation>()
    var quit = false
    while(!quit){
        println("Enter first number. ")
        val input1 = readln().toDouble()
        println("Enter operation (+, -, *, or /). ")
        val oper = readln().toCharArray()[0]
        println("Enter second number. ")
        val input2 = readln().toDouble()
        history.add(Operation(oper, input1, input2))
        for (o in history){
            println(o.input1.toString() +  " " + o.op + " " + o.input2.toString() + " = " + o.evaluate().toString())
        }
        println("Enter 'quit' to quit")
        if(readln() == "quit"){
            quit = true
        }
    }

}