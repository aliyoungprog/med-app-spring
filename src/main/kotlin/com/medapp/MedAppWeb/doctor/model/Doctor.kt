package com.medapp.MedAppWeb.doctor.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Doctor(
    @Id
    @GeneratedValue
    var id: Int ?= null,
    var name: String ?= null,
    var position: String ?= null
)
