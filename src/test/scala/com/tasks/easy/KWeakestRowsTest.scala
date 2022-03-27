package com.tasks.easy

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class KWeakestRowsTest extends AnyWordSpecLike with Matchers {

  "k weakest rows" should {
    "return result for first case" in {
      val mat = Array(
        Array(1, 1, 0, 0, 0),
        Array(1, 1, 1, 1, 0),
        Array(1, 0, 0, 0, 0),
        Array(1, 1, 0, 0, 0),
        Array(1, 1, 1, 1, 1)
      )
      val result = KWeakestRows.kWeakestRows(mat, 3)
      result should be(Array(2, 0, 3))
    }
    "return result for second case" in {
      val mat = Array(
        Array(1, 0, 0, 0),
        Array(1, 1, 1, 1),
        Array(1, 0, 0, 0),
        Array(1, 0, 0, 0)
      )
      val result = KWeakestRows.kWeakestRows(mat, 2)
      result should be(Array(0, 2))
    }
  }

}
