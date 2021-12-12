package com.medapp.MedAppWeb.user.contoller

import com.medapp.MedAppWeb.user.model.User
import com.medapp.MedAppWeb.user.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*


@RestController
class UserController(@Autowired private val userService: UserService) {

    @GetMapping(path = ["/users/{id}"])
    fun getUserById(@PathVariable id: Int): User {
        return userService.getUserById(id)
    }

    @GetMapping(path = ["/users"])
    fun getAllUsers() = userService.getAllUsers()

    @Transactional
    @PostMapping(path = ["/add_user"])
    fun addUser(@RequestBody user: User): ResponseEntity<User> {
        val createdUser = userService.addUser(user)
        return ResponseEntity<User>(createdUser, HttpStatus.CREATED)
    }

    @GetMapping(path = ["/users/find_by_phone/{phone_number}"])
    fun getUserByPhoneNumber(@PathVariable phone_number: String): User {
        return userService.findByPhoneNumber(phone_number)
    }
}
