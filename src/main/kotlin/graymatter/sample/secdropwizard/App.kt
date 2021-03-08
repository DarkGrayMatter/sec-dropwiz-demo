package graymatter.sample.secdropwizard

import graymatter.sample.secdropwizard.health.TemplateHealthCheck
import graymatter.sample.secdropwizard.resources.HelloWorldResource
import io.dropwizard.Application
import io.dropwizard.setup.Environment

object App: Application<AppConfig>() {

    override fun run(configuration: AppConfig, environment: Environment) {
        environment.jersey().register(HelloWorldResource(configuration.template, configuration.defaultName))
        environment.healthChecks().register("template-health", TemplateHealthCheck(configuration.template))
    }

    private const val APP_NAME = "SEC DropWizard Sample App"
    override fun getName(): String = APP_NAME
    @JvmStatic
    fun main(args: Array<String>) = run(* args)

}


