import scalaj.http.{HttpResponse, Http}
import com.typesafe.config.{Config, ConfigFactory}

object Main extends App {
  val config: Config = ConfigFactory.load()

  val response: HttpResponse[String] = Http(config.getString("app.requestLink"))
    .header("Content-Type", "application/json")
    .asString
}