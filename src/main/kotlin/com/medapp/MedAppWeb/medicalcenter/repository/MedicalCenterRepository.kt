package com.medapp.MedAppWeb.medicalcenter.repository

import com.medapp.MedAppWeb.medicalcenter.model.MedicalCenter
import org.springframework.stereotype.Component
import java.util.*

@Component
class MedicalCenterRepository {
    private val medCenterList = arrayListOf<MedicalCenter>()

    init {
        medCenterList.add(MedicalCenter(
            id = 0,
            name = "test",
            address = "test",
            workDays = Date(),
            rating = 1.0))
        medCenterList.add(MedicalCenter(
            id = 1,
            name = "test",
            address = "test",
            workDays = Date(),
            rating = 1.0))
        medCenterList.add(MedicalCenter(
            id = 2,
            name = "test",
            address = "test",
            workDays = Date(),
            rating = 1.0))
    }

    fun getAll() = medCenterList

    fun getById(id: Int): MedicalCenter? {
        return medCenterList.find {
            it.id == id
        }
    }


}
