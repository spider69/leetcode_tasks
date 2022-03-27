package com.tasks.easy

object KWeakestRows {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] =
    mat
      .zipWithIndex
      .map {
        case (row, rowNum) => (rowNum, row.takeWhile(_ != 0).length)
      }
      .sortBy(_._2)
      .map(_._1)
      .take(k)
}
