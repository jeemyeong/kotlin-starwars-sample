package com.jeemyeong.request.dto

import com.jeemyeong.request.domain.Planet

data class AllPlanetsDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Planet>
)
