package cn.learn.rpc

import akka.actor.Actor

class Master extends Actor{
  println("constructor invoked")
  override def preStart(): Unit = {
    println("preStart invoked")
  }
  //用于接收消息
  override def receive: Receive = {
    case "connect" => {
      println("a client connected")
    }
  }
}

object Master{
  def main(args: Array[String]) {
    
  }
}
