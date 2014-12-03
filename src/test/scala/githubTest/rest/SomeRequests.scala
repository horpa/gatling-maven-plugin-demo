package githubTest.rest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object SomeRequests {
  val projectPage = exec(
    http("project page")
      .get("/horpa/gatling-maven-plugin-demo"))
  
  val gitIgnore = exec(
    http("gitIgnore")
      .get("/horpa/gatling-maven-plugin-demo/blob/master/.gitignore"))
  
  val readMe = exec(
    http("readme markdown")
      .get("/horpa/gatling-maven-plugin-demo/blob/master/README.md"))
}

