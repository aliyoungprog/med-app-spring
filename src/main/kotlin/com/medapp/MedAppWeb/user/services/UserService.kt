package com.medapp.MedAppWeb.user.services

import com.medapp.MedAppWeb.user.model.User

interface UserService {

    fun getAllUsers(): List<User>

    fun getUserById(id: Int): User

    fun addUser(user: User): User

    fun findByPhoneNumber(phoneNumber: String): User

//    fun deleteUserById(id: Long)
}
