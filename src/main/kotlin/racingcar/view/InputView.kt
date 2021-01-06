package racingcar.view

class InputView {
    fun getCarNames(): List<String>? {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        return validateCarNames(readLine()?.split(","))
    }

    private fun validateCarNames(names: List<String>?): List<String>? {
        names!!.forEach { require(it.length <= 5) { "자동차 이름은 5자 이하만 가능합니다." } }
        return names
    }

    fun getHowManyTrial(): Int? {
        println("\n" + "시도할 횟수는 몇 회인가요?")
        return readLine()?.toInt()
    }
}