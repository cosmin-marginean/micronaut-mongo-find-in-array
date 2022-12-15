package com.test

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

@MicronautTest
class BugTest {

    @Inject
    lateinit var documentRepository: DocumentRepository

    @Test
    fun test() {
        documentRepository.findByTags("tag")
    }
}