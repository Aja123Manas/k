class Dog(var name:String,var breed:String,var weight:Int){
    fun move(movement:String){
        println("The dog is $movement")
    }
}

fun main() {
    var dog1 =Dog("Murife","Pitbull",20)
    var dog2 =Dog("Saige","Bulldog",25)
    var dog3 =Dog("Bob","Pitbull",30)
    println(dog1.breed)
    dog2.move("running")
    dog1.move("walking")
}