package racingcar.ui

import racingcar.domain.Report

private const val POSITION_DELIMITER = "-"

fun printReports(reports: Map<Long, List<Report>>) {
    println("\n실행 결과")

    for (report in reports) {
        for ((name, position) in report.value) {
            val stringBuilder = StringBuilder()

            repeat(position.toInt()) {
                stringBuilder.append(POSITION_DELIMITER)
            }
            println("$name: $stringBuilder")
        }
        println()
    }
}
