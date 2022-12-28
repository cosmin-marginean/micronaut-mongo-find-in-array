package com.test

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@MicronautTest
class BugTest {

    @Inject
    lateinit var documentRepository: DocumentRepository

    @Test
    fun test() {
        documentRepository.save(Document("john", listOf("a", "b")))
        documentRepository.save(Document("anne", listOf("a", "c")))
        assertEquals(2, documentRepository.findByTagsCollectionContains("a").size)
    }
}