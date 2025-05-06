package com.topacademy.buses.bus.handlers.store.bucket

import com.topacademy.buses.bus.events.event.Event
import com.topacademy.buses.bus.handlers.handler.Handler

typealias Bucket = MutableList<Handler<out Event>>