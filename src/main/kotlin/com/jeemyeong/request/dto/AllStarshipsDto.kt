package com.jeemyeong.request.dto

import com.jeemyeong.request.domain.Starship


data class AllStarshipsDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Starship>
)
