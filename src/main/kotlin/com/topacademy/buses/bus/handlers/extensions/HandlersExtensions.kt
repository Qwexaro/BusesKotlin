package com.topacademy.buses.bus.handlers.extensions

import com.topacademy.buses.bus.handlers.Handlers
import com.topacademy.buses.bus.handlers.store.Store

fun Handlers.store(): Store = run {
    mutableMapOf()
}