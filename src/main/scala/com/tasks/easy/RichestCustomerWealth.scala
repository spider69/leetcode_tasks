package com.tasks.easy

object RichestCustomerWealth {

  def maximumWealth(accounts: Array[Array[Int]]): Int = {
    var max = 0
    accounts.foreach { account =>
      val sum = account.sum
      if (sum > max) {
        max = sum
      }
    }
    max
  }

}
