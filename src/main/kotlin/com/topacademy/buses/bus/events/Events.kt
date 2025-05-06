package com.topacademy.buses.bus.events

import com.topacademy.buses.bus.events.event.Event
import com.topacademy.buses.bus.events.extensions.store
import com.topacademy.buses.bus.events.store.extensions.bucket

class Events {

    val store = store()

    inline fun <reified T : Event> push(event: T) = run {
        val key = T::class.java

        val bucket = with(store) {
            bucket(key)
        }

        with(bucket) {
            contains(event).not().run {
                if (this) {
                    add(event)
                }
            }
        }
    }

    inline fun <reified T : Event> read() = run {
        val key = T::class.java

        with(store) {
            bucket(key)
        }
    }

}