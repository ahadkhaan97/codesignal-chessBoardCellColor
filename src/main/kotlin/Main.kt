//https://app.codesignal.com/arcade/intro/level-6/t97bpjfrMDZH8GJhi/solutions

fun main() {
    print(solution("A1", "A2"))
}

fun solution(cell1: String, cell2: String): Boolean {
    return getColor(cell1) == getColor(cell2)
}

fun getColor(cell: String): String {
    return if (cell[0].code % 2 == 0) {
        if (cell[1].digitToInt() % 2 != 0) {
            "dark"
        } else {
            "light"
        }
    } else {
        if (cell[1].digitToInt() % 2 != 0) {
            "light"
        } else {
            "dark"
        }
    }
}
