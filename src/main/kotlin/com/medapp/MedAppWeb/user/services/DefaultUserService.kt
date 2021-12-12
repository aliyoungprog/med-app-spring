package com.medapp.MedAppWeb.user.services

import com.medapp.MedAppWeb.user.model.User
import com.medapp.MedAppWeb.user.repository.CustomUserRepository
import com.medapp.MedAppWeb.user.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional


@Service
@Transactional
class DefaultUserService(
    @Autowired private val userRepository: UserRepository,
    @Autowired private val customUserRepository: CustomUserRepository
) : UserService {
    override fun getAllUsers(): List<User> {
        return userRepository.findAll() as List<User>
    }

    override fun getUserById(id: Int): User {
        return userRepository.findById(id).get()
    }

    override fun addUser(user: User): User {
        return userRepository.save(user)
    }

    override fun findByPhoneNumber(phoneNumber: String): User {
        return customUserRepository.findUserByPhoneNumber(phoneNumber)
    }

//    override fun deleteUserById(id: Long) {
//        userRepository.deleteById(id)
//    }
}
