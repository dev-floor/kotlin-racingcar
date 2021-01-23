package racingcar.view

import racingcar.domain.Report

fun showResult() = println("\n실행 결과")

fun showEachResults(report: Report) = print(report.report)

fun showFinalResult(winnersName: List<String>) = println("${winnersName.joinToString()}가 최종 우승했습니다.")
