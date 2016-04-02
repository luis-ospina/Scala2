package actors

import akka.actor.Actor
import hubs.{ChatPage, ChatHub}
import signalJ.GlobalHost
import signalJ.services.HubContext

// Una super-inteligencia artificial creada para dominar el mundo 
class Robot extends Actor{
  def receive = {
    case _  => {
    	//Obtenemos el "contexto" de la aplicación, es decir la ventana de chat.
      val hub: HubContext[ChatPage] = GlobalHost.getHub(classOf[ChatHub])
      hub.clients.all.sendMessage("Robot", "I am alive!")
    }
  }
}