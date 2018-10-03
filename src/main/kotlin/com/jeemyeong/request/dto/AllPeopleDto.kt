package com.jeemyeong.request.dto

import com.jeemyeong.request.domain.Person


data class AllPeopleDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Person>
)
