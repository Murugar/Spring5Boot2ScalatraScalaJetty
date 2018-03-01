package com.iqmsoft.scala

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport
import org.springframework.beans.factory.annotation.Autowired

class SampleScalatraServlet extends ScalatraServlet with ScalateSupport {


  get("/") {
    contentType = "text/html"
    ssp("/view")
  }

  get("/nossp") {
    "No SSP"
  }

}
