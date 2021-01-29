package racingcar.domain

data class Trial(val trialNumber: Int) {
    init {
        require(trialNumber > TRIAL_LOWER_BOUND) { "시도 횟수는 최소 1회 이상 가능합니다." }
    }

    companion object {
        const val TRIAL_LOWER_BOUND = 0
    }
}
