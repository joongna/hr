package com.joongna.hr.product.domain

import com.joongna.hr.common.BaseTimeEntity
import jakarta.persistence.*

@Entity
class Product(

    val productName: String,

    val quantity: Long,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

) : BaseTimeEntity() {
}