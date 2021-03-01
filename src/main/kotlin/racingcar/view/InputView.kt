package racingcar.view

const val CAR_DELIMITER = ","

fun getCarNames(): List<String> {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    return readLine()!!.split(CAR_DELIMITER)
}

fun getTrialNumber(): Int? {
    println("\n시도할 횟수는 몇 회인가요?")
    return readLine()!!.toInt()
}
