package graymatter.sample.secdropwizard.health

import com.codahale.metrics.health.HealthCheck
import graymatter.sample.secdropwizard.api.Saying

class TemplateHealthCheck(private val template: String) : HealthCheck() {
    override fun check(): Result {
        val saying = Saying("TEST")
        return when {
            "TEST" in saying.content -> Result.healthy()
            else -> Result.unhealthy("Template does not include a name.")
        }
    }
}
