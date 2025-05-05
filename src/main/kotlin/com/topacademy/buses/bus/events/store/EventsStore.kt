package com.topacademy.buses.bus.events.store

import com.topacademy.buses.bus.events.store.bucket.EventsStoreBucket
import com.topacademy.buses.bus.events.store.key.EventsStoreKey

// это нужно дополнить

typealias EventsStore = MutableMap<EventsStoreKey, EventsStoreBucket>