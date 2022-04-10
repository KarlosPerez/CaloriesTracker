package com.karlosprojects.core.domain.use_case

/**
 * This class is created as a utility class and taken as a use case: this is done following clean
 * architecture best practices, and prevent doing business logic in a viewModel
 */
class FilterOutDigits {

    operator fun invoke(text: String): String {
        return text.filter { it.isDigit() }
    }
}