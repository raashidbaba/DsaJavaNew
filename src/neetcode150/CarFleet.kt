package neetcode150


fun main(){

}



fun CarFleet(target: Int, position: IntArray, speed: IntArray):Int{
    val stack = mutableListOf<Double>()
    val cars = position.zip(speed)
        .sortedByDescending { it.first }

    for ((pos, spd) in cars) {

        val time = (target - pos).toDouble() / spd


        if (stack.isEmpty() || time > stack.last()) {
            stack.add(time)
        }

    }

    return stack.size


}
