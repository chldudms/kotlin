abstract class Printer{
    abstract fun print()   //
    abstract fun display()

}
val myprinter = object : Printer(){ //추상클래스의 1회성 객체 인스턴스 만들려면 object
    override fun print(){
        println("출력합니다.") }
    override fun display(){
        println("화면에 출력합니다.") }
}
fun main(){
    myprinter.print()
    myprinter.display()
}