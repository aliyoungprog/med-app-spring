package com.medapp.MedAppWeb.medicalcenter.controller

import com.medapp.MedAppWeb.exception.CoreNotFoundException
import com.medapp.MedAppWeb.medicalcenter.model.MedicalCenter
import com.medapp.MedAppWeb.medicalcenter.repository.MedicalCenterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MedicalCenterController {

    @Autowired
    val medicalCenterList = MedicalCenterRepository()

    @GetMapping(path = ["/mcenters"])
    fun getAllMedCenters() = medicalCenterList.getAll()

    @GetMapping(path = ["/mcenters/{id}"])
    fun getMedCenterById(@PathVariable id: Int): MedicalCenter?{
        return medicalCenterList.getById(id) ?: throw CoreNotFoundException("med-center not found $id")
    }
}
