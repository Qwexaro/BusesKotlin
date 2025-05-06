package com.topacademy.buses.bus.handlers

import com.topacademy.buses.bus.events.event.Event
import com.topacademy.buses.bus.handlers.extensions.store
import com.topacademy.buses.bus.handlers.handler.Handler
import com.topacademy.buses.bus.handlers.handler.extensions.disposer
import com.topacademy.buses.bus.handlers.store.extensions.bucket

class Handlers {

    val store = store()

    inline fun <reified T : Event> push(value: Handler<T>) = run {
        val key = T::class.java

        val bucket = with(store) {
            bucket(key)
        }

        with(bucket) {
            contains(value).not().run {
                if (this) {
                    add(value)
                }
            }

            with(value) {
                disposer {
                    remove(this)
                }
            }
        }
    }

}