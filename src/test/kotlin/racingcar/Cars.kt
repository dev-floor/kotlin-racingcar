package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.Random

class Cars() {

    @Test
    fun `Each car should move properly`() {
        val cars = Cars()
        cars.carList = listOf(Car("carA"), Car("carB"), Car("carC"))
        cars.carList[0].move(4)
        cars.carList[0].move(4)
        cars.carList[1].move(4)
        assertThat(cars.carList[0].position.position).isEqualTo("--")
        assertThat(cars.carList[1].position.position).isEqualTo("-")
        assertThat(cars.carList[2].position.position).isEqualTo("")
    }

    @Test
    fun `Should get the most moved car when we want to get winner`() {
        val cars = Cars()
        cars.carList = listOf(Car("carA"), Car("carB"), Car("carC"))
        cars.carList.map { it.move(Random().getRandomValue()) }
        val winnerPosition = cars.getWinner()!!.position.position.length
        cars.carList.map { assertThat(it.position.position.length).isLessThanOrEqualTo(winnerPosition) }
    }

    @Test
    fun `Should get the most moved cars when we want to get winner list`() {
        val cars = Cars()
        cars.carList = listOf(Car("carA"), Car("carB"), Car("carC"))
        cars.carList[0].move(4)
        cars.carList[1].move(4)
        assertThat(cars.getWinnerList().count()).isEqualTo(2)
    }
}
