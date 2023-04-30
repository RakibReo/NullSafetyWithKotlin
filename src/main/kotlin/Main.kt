fun main() {

    var name=null
   // var name1:Nothing=null
   var name3:String?=null

    name3?.let {              //not give output
        showMsg(it)

    }


    var name4="SuRa"

    println("1.my name is:  $name")
   // println("2.my name is:  $name1")
    println("3.my name is:  $name3")
    println("4.my name is:  $name4")

    showMsg(name4)

}

fun showMsg(msg:String){

    println("5.my name is:  $msg")

}