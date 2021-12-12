package com.medapp.MedAppWeb.medicalcenter.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.Size


data class MedicalCenter(
    var id: Int ?= null,
    @Size(min = 2, message = "not valid")
    var name: String ?= null,
    var address: String ?= null,
    var workDays: Date ?= null,
    var rating : Double ?= null
    )
