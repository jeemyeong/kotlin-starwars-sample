package com.jeemyeong.request.helper

class RetryHelper {
    companion object {
        fun<T> retry(count: Int = 0, logging: (Exception) -> Unit = { e ->  println(e) }, fn: () -> T): T? {
            return  try {
                fn()
            } catch (e: Exception) {
                logging(e)
                if (count > 0) {
                    retry(count - 1, logging = logging) { fn() }
                } else {
                    null
                }
            }
        }
    }
}
