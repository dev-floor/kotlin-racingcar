package racingcar.view

const val CAR_DELIMITER = ","

fun inputCarNames(): List<String> {
    println("\n경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    return readLine()!!.split(CAR_DELIMITER)
}

fun inputTrialNumber(): Int {
    println("\n시도할 횟수는 몇 회인가요?")
    return readLine()!!.toInt()
}
