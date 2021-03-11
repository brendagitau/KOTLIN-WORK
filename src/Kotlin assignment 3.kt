
/*Assignment 3: Strings
1. Given a string “akirachix”. Write a function that prints out a string composed of the first, third and fourth characters of the string (2 points)
2. Write a function that takes in 2 parameters, name and age and returns a String with this structure “Hi, my name is x and I am y years old.” Where x and y are the provided name and age respectively. (3 points)
3. Write a function that takes in a String and returns its length (2 points) 4. Write a function that takes in a name and prints out “That’s me!” when your name is passed to it, otherwise it prints out “I don’t know who that is” (3 points)
*/
fun main(){
akira()
    var x =intro("Brenda",20)
    println(x)

    var stringlength= length("Me i like fish")
    println(stringlength)
    var check =condition("Wuanita")
    println(check)
}
fun akira(){
    val word = "akirachix"
    println(word[0])
    println(word[2])
    println(word[3])
}
fun intro(name:String,age:Int):String{
    var introduce= "Hi,my name is" +" " +name+" "+"and I am" +" " +age+" "+"years old"
    return (introduce)
}

fun length(word:String):Int{
    var h =word.length
    return (h)
}
fun condition(name:String){
    if (name == " Gitau"){
        println("THAT'S ME")
    }else
        println("I dont know who that is!")

}