package com.topacademy.buses.bus

import com.topacademy.buses.bus.events.event.Event
import com.topacademy.buses.bus.extensions.events
import com.topacademy.buses.bus.extensions.handlers
import com.topacademy.buses.bus.handlers.handler.Handler

class Bus {
    val events = events()

    val handlers = handlers()

    @Suppress("UNCHECKED_CAST")
    inline fun <reified T : Event> produce(block: () -> T) = run {
        val value = block()

        with(events) {
            push {
                value
            }
        }

        with(handlers) {
            read<T>().forEach {
                (it as Handler<T>)(value)
            }
        }
    }

    inline fun <reified T : Event> consume(handler: Handler<T>) = run {
        with(handler) {
            with(events) {
                read<T>().forEach {
                    handler(it as T)
                }
            }

            with(handlers) {
                push(handler)
            }
        }
    }
}