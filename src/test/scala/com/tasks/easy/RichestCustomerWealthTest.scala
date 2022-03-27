package com.tasks.easy

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class RichestCustomerWealthTest extends AnyWordSpecLike with Matchers {

  "richest customer wealth" should {
    "return result for first case" in {
      val accounts = Array(Array(1, 2, 3), Array(3, 2, 1))
      val result = RichestCustomerWealth.maximumWealth(accounts)
      result should be(6)
    }
    "return result for second case" in {
      val accounts = Array(Array(1, 5), Array(7, 3), Array(3, 5))
      val result = RichestCustomerWealth.maximumWealth(accounts)
      result should be(10)
    }
    "return result for third case" in {
      val accounts = Array(Array(2, 8, 7), Array(7, 1, 3), Array(1, 9, 5))
      val result = RichestCustomerWealth.maximumWealth(accounts)
      result should be(17)
    }
  }

}
