class Operation(val op: Char, val input1: Double, val input2: Double) {
    val validOps : List<Char> = listOf('+', '-', '*', '/')

    fun evaluate(): Double{
        require(op in validOps) {"Invalid Operation"}
        return when(op){
            '*' -> input1 * input2
            '/' -> input1 / input2
            '+' -> input1 + input2
            '-' -> input1 - input2
            else -> 0.0
        }
    }


}