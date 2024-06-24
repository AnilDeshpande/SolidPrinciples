package com.codetutor.solidprinciples.isp

import androidx.lifecycle.ViewModel

interface UserOperations {
    fun fetchUserProfile()
    fun authenticateUser()
    fun logoutUser()
}

class UserProfileViewModel : ViewModel(), UserOperations {
    override fun fetchUserProfile() {
        // Logic to fetch user profile
    }
    override fun authenticateUser() {
        throw UnsupportedOperationException("UserProfileViewModel does not handle authentication")
    }
    override fun logoutUser() {
        throw UnsupportedOperationException("UserProfileViewModel does not handle logout")
    }
}

class AuthenticationViewModel : ViewModel(), UserOperations {
    override fun fetchUserProfile() {
        throw UnsupportedOperationException("AuthenticationViewModel does not fetch user profile")
    }
    override fun authenticateUser() {
        // Logic to authenticate user
    }
    override fun logoutUser() {
        // Logic to logout user
    }
}