package com.joongna.hr.order.domain

enum class OrderStatus(
    val code: Long,
    val description: String,
) {
    DEFAULT(0, "기본"),
    ORDER_COMPLETE(1, "주문 완료")
}