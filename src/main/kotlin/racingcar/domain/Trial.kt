package racingcar.domain

class Trial(val trialNumber: Int) {
    init{
        require(trialNumber > TRIAL_LOWER_BOUND) { "최소 1회 이상 시도 가능합니다." }
    }

    companion object{
        const val TRIAL_LOWER_BOUND = 0
    }
}