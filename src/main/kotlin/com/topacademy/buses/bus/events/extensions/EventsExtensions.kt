package com.topacademy.buses.bus.events.extensions

import com.topacademy.buses.bus.events.Events
import com.topacademy.buses.bus.events.store.EventsStore

fun Events.store(): EventsStore = run {
    mutableMapOf()
}
