//인터페이스
interface Pet{
    var category:String
    fun feeding()
    fun patting(){
        println("keep patting!")
    }
}
class Cat(override var category: String): Pet{
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}
class Dog(override var category: String): Pet{
    override fun feeding() {
        println("Feed the dog any can!")
    }
}
fun main(){
    val obj= Cat("small")
    println("Pet Category: $(obj.category)")
    obj.feeding()  //구현된 메서드
    obj.patting() //기본 메서드
    val obj2= Dog("big")
    println("Pet Category: $(obj2.category)")
    obj2.category
    obj2.feeding()
}
