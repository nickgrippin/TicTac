package src.main.scala

import akka.actor.{ActorRef, ActorSystem}
import akka.event.Logging
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer


/**
  * Created by grippinn on 6/30/16.
  */
object TicTac extends App with Skynet {
  implicit val system = ActorSystem("TicTac")
  implicit val materializer = ActorMaterializer()
  implicit val ec = system.dispatcher

  val log = Logging(system, getClass)
  //val config = ConfigFactory.load()

  val host = "0.0.0.0"
  val port = 8089

  var board = Array(" ", " ", " ", " ", " ", " ", " ", " ", " ")

  val routes =
    path("start") {
      get {
        complete {
          "Ready to begin\n" + printBoard(board)
        }
      }
    } ~
    path("") {
      get {
        complete {
          "healthy"
        }
      }
    } ~
    path("move") {
      post {
        entity(as[String]) {
          string => complete {
            board = string.split("")
            if(checkWin(board)) {
              "You win!"
            } else {
              "I need to make a move\n" + printBoard(board)
            }
          }
        }
      }
    }

  val http = Http().bindAndHandle(
    routes,
    host,
    port
  )

  http onFailure {
    case ex: Exception =>
      log.error(ex, "Failed to bind to {}:{}", host, port)
  }
}
