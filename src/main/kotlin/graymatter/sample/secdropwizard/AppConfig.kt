package graymatter.sample.secdropwizard

import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration
import io.dropwizard.db.DataSourceFactory

class AppConfig : Configuration() {

    @JsonProperty("template")
    lateinit var template:String

    @JsonProperty("default_name")
    lateinit var defaultName: String

    @JsonProperty("database")
    val database: DataSourceFactory = DataSourceFactory()
}
