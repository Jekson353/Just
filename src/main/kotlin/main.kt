fun main() {
    var seconds = 0
    while (true){
        seconds+=59
        agoToText(seconds)
        if (seconds>259199) break
        println(seconds)
    }

}
fun agoToText(secondsAgo: Int) {
    when (secondsAgo) {
        in 0..59 -> println("Был(а) в сети только что")
        in 60..3599 -> calcMinute(secondsAgo)
        in 3600..86399 -> calcHour(secondsAgo)
        in 86400..172799 -> println("Сегодня был в сети")
        in 172800..259199 -> println("Был в сети вчера")
        else -> println("Был в сети давно")
    }
}
fun calcMinute(secondsAgo: Int)  {
    when (val minute = secondsAgo / 60) {
        1, 21, 31, 41, 51 -> println("Был(а) в сети $minute минуту назад")
        in 5..20, in 25..30, in 35..40, in 45..50, in 55..59 -> println("Был(а) в сети $minute минут назад")
        else -> println("Был(а) в сети $minute минуты назад")
    }
}
fun calcHour(secondsAgo: Int)  {
    when (val hour = secondsAgo / 3600) {
        1, 21, 31, 41, 51 -> println("Был(а) в сети $hour час назад")
        in 5..20, in 25..30 -> println("Был(а) в сети $hour часов назад")
        else -> println("Был(а) в сети $hour часа назад")
    }
}