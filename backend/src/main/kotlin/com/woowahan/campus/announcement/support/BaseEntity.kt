package com.woowahan.campus.announcement.support

import org.springframework.data.annotation.Id
import org.springframework.data.domain.AbstractAggregateRoot

abstract class BaseEntity(
    @Id
    val id: Long = 0L
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BaseEntity

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}

abstract class BaseRootEntity<T : AbstractAggregateRoot<T>>(
    @Id
    val id: Long = 0L
) : AbstractAggregateRoot<T>() {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BaseEntity

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
