open class Bird1(var name:String, var wing:Int, var beak:String, var color:String){
    fun fly() = println("Fly wing:$wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}

//주생성자를 사용하는 상속
class Lark(name:String, wing:Int, beak:String, color:String, age:Int)
    :Bird1(name,wing,beak,color){
        fun singHitone()= println("Happy Song") //자식이 새로 만든 것
    }

//부생성자를 사용하는 상속
class Parrot :Bird1{
    val language: String

    constructor(name: String,
                wing: Int,
                beak: String,
                color: String,
                language: String) : super(name, wing, beak, color){
        this.language = language
    }

    fun speak() = println("Speak: $language")
}

fun main(){
    val coco = Bird1("mybird",2,"short","blue")
    val lark1 = Lark("mybird",2,"long","blown",120)
    val parrot = Parrot("mybird",2,"short","multiple","korean")

    println("coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark1.name}, ${lark1.wing}, ${lark1.beak}, ${lark1.color}")
    println("Parrot: ${parrot.name},${parrot.wing}, ${parrot.beak}, ${parrot.color},${parrot.language}")
    lark1.singHitone()
    parrot.speak()
    lark1.fly()
}


