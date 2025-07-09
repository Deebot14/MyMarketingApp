package com.graissy.mymarketingapp

import java.io.Serializable

class Message(
    val contactName: String,
    val contactNumber: String,
    val myDisplayName: String,
    val includeJunior: Boolean,
    val jobTitle: String?,
    val immediateStart: Boolean,
    val startDate: String?
) : Serializable {

    // Instead of writing the method like this (Java) - (Video 102)
//    fun getFullJobDiscription(): String {
//        if(includeJunior){
//            return "a Junior $jobTitle"
//        } else {
//            return "a $jobTitle"
//        }
//    }

    // We can write it like this (Kotlin)
    fun getFullJobDiscription() = if (includeJunior) "a Junior $jobTitle" else "an $jobTitle"

    fun getAvailability() = if (immediateStart) "immediately" else "from $startDate"


}