package graymatter.sample.secdropwizard.api

import java.util.*

data class Saying(val id: String, val content: String) {
    constructor(content: String): this(UUID.randomUUID().toString(), content)
}
