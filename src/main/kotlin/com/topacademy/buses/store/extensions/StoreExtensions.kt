package com.topacademy.buses.store.extensions

import com.topacademy.buses.bus.Bus
import com.topacademy.buses.bus.handlers.store.Store
import com.topacademy.buses.bus.handlers.store.key.Key
import com.topacademy.buses.store.value.Value

fun Store.value(): Value = run {
    Bus()
}

fun Store.value(key: Key) = run {
    get(key) ?: run {
        value().also {
            put(key, it)
        }
    }
}