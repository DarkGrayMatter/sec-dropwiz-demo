package graymatter.sample.secdropwizard.resources

import com.codahale.metrics.annotation.Timed
import graymatter.sample.secdropwizard.api.Saying
import java.util.*
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
class HelloWorldResource(private val template: String, private val defaultName: String) {

    @GET
    @Timed
    fun sayHello(@QueryParam("name") name: String?): Saying {
        val from = name ?: defaultName
        return Saying(
            id = UUID.randomUUID().toString(),
            content = template.format(from)
        )
    }
}
