package com.test

import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.PageableRepository

@MongoRepository
interface DocumentRepository : PageableRepository<Document, String> {

    fun findByTagsCollectionContains(tag:String): List<Document>
}