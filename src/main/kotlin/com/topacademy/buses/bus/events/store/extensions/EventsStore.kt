package com.topacademy.buses.bus.events.store.extensions

import com.topacademy.buses.bus.events.store.EventsStore
import com.topacademy.buses.bus.events.store.bucket.EventsStoreBucket
import com.topacademy.buses.bus.events.store.key.EventsStoreKey

fun EventsStore.bucket(): EventsStoreBucket = run {
    mutableListOf()
}

fun EventsStore.bucket(key: EventsStoreKey): EventsStoreBucket = run {
    get(key) ?: run {
        bucket().also {
            put(key, it)
        }
    }
}