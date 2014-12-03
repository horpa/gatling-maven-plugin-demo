package githubTest.utilities

import io.gatling.core.Predef._
import io.gatling.core.config.Protocol
import io.gatling.http.Predef._

object Protocols {
  def github(baseURL: String) = {
    val httpProtocol: Protocol = http
      .baseURL(baseURL)
      .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
      .acceptEncodingHeader("gzip, deflate")
      .userAgentHeader("Gatling-tool/2.0.0-RC3")
    httpProtocol
  }
}
