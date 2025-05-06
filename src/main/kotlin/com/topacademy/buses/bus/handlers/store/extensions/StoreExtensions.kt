package com.topacademy.buses.bus.handlers.store.extensions

import com.topacademy.buses.bus.handlers.store.Store
import com.topacademy.buses.bus.handlers.store.bucket.Bucket
import com.topacademy.buses.bus.handlers.store.key.Key

fun Store.bucket(): Bucket = run {
    mutableListOf()
}

fun Store.bucket(key: Key): Bucket = run {
    get(key) ?: run {
        bucket().also {
            put(key, it)
        }
    }
}