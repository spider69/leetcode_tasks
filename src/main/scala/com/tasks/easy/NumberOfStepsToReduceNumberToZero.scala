package com.tasks.easy

import scala.annotation.tailrec

object NumberOfStepsToReduceNumberToZero {

  def numberOfSteps(num: Int): Int = {
    @tailrec
    def f(num: Int, acc: Int = 0): Int = {
      if (num == 0) {
        acc
      } else if (num % 2 == 0) {
        f(num / 2, acc + 1)
      } else {
        f(num - 1, acc + 1)
      }
    }

    f(num)
  }

}
