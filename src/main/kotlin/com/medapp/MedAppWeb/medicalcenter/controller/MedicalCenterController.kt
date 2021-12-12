package com.medapp.MedAppWeb.medicalcenter.controller

import com.medapp.MedAppWeb.exception.CoreNotFoundException
import com.medapp.MedAppWeb.medicalcenter.model.MedicalCenter
import com.medapp.MedAppWeb.medicalcenter.repository.MedicalCenterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MedicalCenterController(@Autowired private val medRepository: MedicalCenterRepository) {

    @GetMapping(path = ["/medcenters"])
    fun getAllMedCenters() = medRepository.getAll()

    @GetMapping(path = ["/medcenters/{id}"])
    fun getMedCenterById(@PathVariable id: Int): MedicalCenter? {
        return medRepository.getById(id) ?: throw CoreNotFoundException("med-center not found $id")
    }

    @GetMapping(path = ["/medcenters/best"])
    fun getBestMedCenters() = medRepository.getBestMedCenters()
}
