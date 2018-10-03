package com.jeemyeong.request.dto

import com.jeemyeong.request.domain.Species

data class AllSpeciesDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Species>
)
