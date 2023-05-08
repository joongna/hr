package com.joongna.hr.order.adapter.out.persistence

import com.joongna.hr.common.BaseTimeEntity
import com.joongna.hr.order.domain.OrderStatus
import com.joongna.hr.product.domain.Product
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Orders(

    val orderId: String,

    var orderStatus: OrderStatus? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    val productSeq: Product,

    val feeAmount: Long,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

) : BaseTimeEntity() {

    init {
        orderStatus = orderStatus?: OrderStatus.DEFAULT
    }

}