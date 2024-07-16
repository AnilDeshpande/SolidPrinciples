package com.codetutor.solidprinciples.integrated

interface DetailedAddress {
    fun getFullAddress(): String
    fun getLocalAddress(): String
    fun getHomeAddress(): String
    fun getPostalCode(): String
}

class Address(
    val localAddress: String?,
    val homeAddress: String
): DetailedAddress {
    override fun getFullAddress(): String {
        return "$localAddress, $homeAddress"
    }

    override fun getLocalAddress(): String {
        return localAddress ?: ""
    }

    override fun getHomeAddress(): String {
        return homeAddress
    }

    override fun getPostalCode(): String {
        throw UnsupportedOperationException("Postal code is not supported")
    }
}