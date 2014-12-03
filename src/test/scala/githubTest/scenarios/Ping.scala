package githubTest.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import githubTest.rest.SomeRequests
import scala.concurrent.duration._

object Ping {
  val scn = scenario("Ping")
    .repeat(3) {
      SomeRequests.projectPage
    }
    .exec(SomeRequests.gitIgnore)
    .uniformRandomSwitch(
      SomeRequests.projectPage,
      SomeRequests.gitIgnore,
      SomeRequests.readMe)
}
