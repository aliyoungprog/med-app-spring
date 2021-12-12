package com.medapp.MedAppWeb.user.model

import java.io.Serializable
import java.util.*
import javax.persistence.*


@Entity
@Table(name = "user")
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private val id: Int,

    @Column(name = "phone_number")
    val phone_number: String,

    @Column(name = "fname")
    val fname: String,

    @Column(name = "lname")
    val lname: String,

    @Column(name = "records")
    val records: Date? = null
): Serializable
