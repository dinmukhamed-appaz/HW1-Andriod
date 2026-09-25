fun main() {
    println(compare(timeSpentToday = 300, timeSpentYesterday = 250))
    println(compare(timeSpentToday = 300, timeSpentYesterday = 300))
    println(compare(timeSpentToday = 200, timeSpentYesterday = 220))
}

fun compare(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

