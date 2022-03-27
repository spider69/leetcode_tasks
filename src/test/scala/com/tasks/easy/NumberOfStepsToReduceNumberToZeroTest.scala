package com.tasks.easy

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class NumberOfStepsToReduceNumberToZeroTest extends AnyWordSpecLike with Matchers {

  "number of steps" should {
    "be right for first case" in {
      val num = 14
      val result = NumberOfStepsToReduceNumberToZero.numberOfSteps(num)
      result should be(6)
    }
    "be right for second case" in {
      val num = 8
      val result = NumberOfStepsToReduceNumberToZero.numberOfSteps(num)
      result should be(4)
    }
    "be right for third case" in {
      val num = 123
      val result = NumberOfStepsToReduceNumberToZero.numberOfSteps(num)
      result should be(12)
    }
  }

}
