package oop

fun main(args: Array<String>) {
    //Inheritance and Polymorphism
    var studentOne = Student("Jared", "jared@gmail.com", "jared123")
    var studentTwo = Student("Ephraim", "emphraim@gmail.com" ,"ephraim123")

    println(studentOne.name)
    studentTwo.register()


    var teacherOne = Teacher("King", "king@gmail.com", "king123")
    var teacherTwo = Teacher("Erick", "erick@gmail.com" ,"erick123")

    println(teacherOne.name)
    teacherTwo.register()
    teacherOne.suspendStudent()


    var headteacherOne = Headteacher("Ken", "ken@gmail.com", "ken123")

    println(headteacherOne.name)
    headteacherOne.register()
    headteacherOne.login()
    headteacherOne.suspendStudent()
    headteacherOne.approveCash()









}




open class Student(open var name:String,open var email:String,open var password:String){

    fun register(){
        println("You registered with email $email and password $password")
    }
    fun login(){
        println("You logged in with email $email and password $password")
    }
}


open class Teacher(name: String,email: String, password: String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I can suspend a student")
    }
}


class Headteacher(name: String,email: String, password: String):Teacher(name, email, password){
    fun approveCash(){
        println("Yeah, I can approve cash")
    }
}

