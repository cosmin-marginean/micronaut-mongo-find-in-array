package com.test

import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.PageableRepository

@MongoRepository
interface PojoRepository : PageableRepository<Pojo, String> {

    fun findByTagsCollectionContains(tag: String): List<Pojo>
}