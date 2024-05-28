abstract class Vehicle(val name:String, val color:String, val weight:Double){
    //추상 프로터티(반드시 하위클래스에서 재정의 해야 한다)
    abstract var maxSpeed:Double
    abstract var minSpeed:Double
    // 비-추상 프로퍼티 (초기 값만 상태를 저장할 수 있다)
    var year = "2018"
    //추상 메서드 (반드시 하위 크랠스에서 구현 해야 한다)
    abstract fun start()
    abstract fun stop()
    //비 추상 메서드
    fun displaySpecs(){
        println("name: $name, Color:$color, weight:$weight, Year:$year MaxSpeed: $maxSpeed, MinSpeed:$minSpeed")
    }
}
class Car(name:String,
    color:String,
    weight:Double,
    override var maxSpeed:Double, override var minSpeed:Double):Vehicle(name,color,weight){ //maxSpeed 오버라이딩 한다
        override fun start(){
            println("Car Started") }
        override fun stop(){    println("Car Stopped")}
}
class Monocycle(name:String,
          color:String,
          weight:Double,
          override var maxSpeed:Double, override var minSpeed:Double):Vehicle(name,color,weight){ //maxSpeed 오버라이딩 한다
    override fun start(){
        println("Monocycle Started") }
    override fun stop(){    println("Monocycle Stopped") }
          }
fun main(){
    val car = Car("SuperMafiz","yellow",1110.0,270.0,100.0)
    val mono = Monocycle("DreamBike","red",173.0,100.0,50.0)
    car.year = "2013"
    car.displaySpecs()
    mono.displaySpecs()
}
