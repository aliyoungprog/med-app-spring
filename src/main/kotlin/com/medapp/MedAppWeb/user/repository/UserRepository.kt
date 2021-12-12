package com.medapp.MedAppWeb.user.repository

import com.medapp.MedAppWeb.user.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository


interface UserRepository : CrudRepository<User, Int> {
}


interface CustomUserRepository : JpaRepository<User, Int> {
    @Query(value = "select * from user where phone_number = ?1", nativeQuery = true)
    fun findUserByPhoneNumber(phone_number: String): User
}


