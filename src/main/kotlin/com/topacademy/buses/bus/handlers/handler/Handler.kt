package com.topacademy.buses.bus.handlers.handler

import com.topacademy.buses.bus.events.event.Event

fun interface Handler<T: Event> {
    operator fun invoke(events: T)
}