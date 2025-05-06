package com.topacademy.buses.bus.observers.observer

import com.topacademy.buses.bus.events.event.Event

interface Observer<T: Event> {
    operator fun invoke(event: T)
}