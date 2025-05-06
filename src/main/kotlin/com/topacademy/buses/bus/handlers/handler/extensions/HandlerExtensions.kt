package com.topacademy.buses.bus.handlers.handler.extensions

import com.topacademy.buses.bus.events.event.Event
import com.topacademy.buses.bus.handlers.handler.Handler
import com.topacademy.buses.bus.handlers.handler.disposer.Disposer

fun <T: Event> Handler<T>.disposer(disposer: Disposer) = run {
    disposer
}