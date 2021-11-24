package com.medapp.MedAppWeb.medicalcenter.model

import com.medapp.MedAppWeb.doctor.model.Doctor
import java.util.*

data class MedicalCenter(
    var id: Int ?= null,
    var name: String ?= null,
    var address: String ?= null,
    var workDays: Date ?= null,
    var rating : Double ?= null,
    var doctorList: List<Doctor> ?= null
    )
