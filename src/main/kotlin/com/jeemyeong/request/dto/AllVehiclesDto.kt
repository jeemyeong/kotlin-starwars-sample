package com.jeemyeong.request.dto

import com.jeemyeong.request.domain.Vehicle

data class AllVehiclesDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Vehicle>
)
