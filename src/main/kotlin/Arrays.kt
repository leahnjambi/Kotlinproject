fun main(args: Array<String>) {
    var names = arrayListOf("Karen","Tapiwa","Ephraim","Abdul","Michelle")
    println(names[3])
    names.add("Leah")


    //Use for in loop
    for (i in 0 until  (names.size - 1)){
        println(names[i])
    }

    // for each loop
    names.forEach {
        println(it)
    }
}