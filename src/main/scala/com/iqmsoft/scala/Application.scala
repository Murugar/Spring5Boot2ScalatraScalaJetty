package com.iqmsoft.scala

import java.lang.Long

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.{RepositoryRestResource, RestResource}

@SpringBootApplication
class Application {

  @Bean
  def addServlet() = new ServletRegistrationBean(getScalatraServlet, "/scalatra/*")

  @Bean
  def getScalatraServlet = new SampleScalatraServlet
}

object Application {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Application], args: _*)
  }

  
}


