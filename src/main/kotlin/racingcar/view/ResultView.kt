package racingcar.view

import racingcar.domain.Report

const val NAME_AND_POSITION_DELIMITER = " : "
const val POSITION_DELIMITER = "-"
const val ROUND_DELIMITER = "\n"

fun showEachResults(report: Report) {
    println("\n실행 결과")

    for (roundReport in report.report.values) {
        showRoundReport(roundReport)
        print(ROUND_DELIMITER)
    }
}

private fun showRoundReport(roundReport: Set<Pair<String, Int>>) =
    roundReport.forEach { (name, position) ->
        showCarReport(name, position)
    }

private fun showCarReport(name: String, position: Int) =
    println("${name}$NAME_AND_POSITION_DELIMITER${numberToPositionDelimiter(position)}")

private fun numberToPositionDelimiter(position: Int): String {
    var positionWithDelimiter = ""
    for (i in 1..position)
        positionWithDelimiter += POSITION_DELIMITER
    return positionWithDelimiter
}

fun showFinalResult(winnersName: List<String>) = println("${winnersName.joinToString()}가 최종 우승했습니다.")
