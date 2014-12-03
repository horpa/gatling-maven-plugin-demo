package githubTest.simulations

import githubTest.scenarios.Ping
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import githubTest.utilities.Protocols

class Basic extends Simulation {
  val threads = Integer.getInteger("threads", 1).toInt
  val rampup = Integer.getInteger("rampup", 30).toLong
  var baseURL = System.getProperty("baseURL")
  
  if(baseURL == null){
    baseURL = "https://github.com"
  }

  setUp(
      Ping.scn.inject(rampUsers(threads) over (rampup seconds))
  ).protocols(Protocols.github(baseURL))
}