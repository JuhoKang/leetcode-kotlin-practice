package problems.medium

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

fun main() {
    val lRUCache = LRUCache(2)

    lRUCache.put(1, 1) // cache is {1=1}

    lRUCache.put(2, 2) // cache is {1=1, 2=2}

    println(lRUCache.get(1)) // return 1

    lRUCache.put(3, 3) // LRU key was 2, evicts key 2, cache is {1=1, 3=3}

    println(lRUCache.get(2)) // returns -1 (not found)

    lRUCache.put(4, 4) // LRU key was 1, evicts key 1, cache is {4=4, 3=3}

    println(lRUCache.get(1)) // return -1 (not found)

    println(lRUCache.get(3)) // return 3

    println(lRUCache.get(4)) // return 4

}

// HashMap + Queue
class LRUCache(capacity: Int) {
    private val map = HashMap<Int, Int>()
    private val keyQueue = ArrayDeque<Int>(capacity + 1)
    private val cap = capacity

    fun get(key: Int): Int {
        if (keyQueue.contains(key)) {
            keyQueue.remove(key)
        } else {
            return -1
        }
        keyQueue.addFirst(key)

        return map.getOrDefault(key, -1)
    }

    fun put(key: Int, value: Int) {
        if (keyQueue.contains(key)) {
            keyQueue.remove(key)
        }

        keyQueue.addFirst(key)

        if (keyQueue.size > cap) {
            keyQueue.pollLast()
        }

        map[key] = value
    }
}

// Use LinkedHashMap for LRU Cache
//class LRUCache(capacity: Int) : LinkedHashMap<Int, Int>(capacity, 0.75F, true) {
//    private val capacity = capacity
//
//    override fun get(key: Int): Int {
//        return super.getOrDefault(key, -1)
//    }
//
//    override fun put(key: Int, value: Int): Int? {
//        return super.put(key, value)
//    }
//
//    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?): Boolean {
//        return size > capacity
//    }
//}