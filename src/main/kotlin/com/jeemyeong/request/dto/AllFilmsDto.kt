package com.jeemyeong.request.dto

import com.jeemyeong.request.domain.Film

data class AllFilmsDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Film>
)
