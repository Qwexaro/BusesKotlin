package com.topacademy.buses.bus.extensions

import com.topacademy.buses.bus.Bus
import com.topacademy.buses.bus.events.Events
import com.topacademy.buses.bus.handlers.Handlers

fun Bus.events() = run {
    Events()
}

fun Bus.handlers() = run {
    Handlers()
}