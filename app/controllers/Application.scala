package controllers

import play.api._
import play.api.mvc._
import play.api.i18n._
import play.api.cache.Cache
import play.api.cache.Cached
import play.api.cache._
import play.api.Play.current
import scala.io.Source
import scala.xml._
import java.io._
import scala.io.Source
import play.api.libs.ws._
import scala.concurrent.Future

object Application extends Controller {


  def index = {
  Action  {
    Ok(views.html.wxrequest())
    }
  }

  def mobile = Cached("mobile") {
  Action  {
    Ok(views.html.mobile())
    }
  }
  
  //def wx =  Action{ Ok(views.xml.response("echostr","msg_signature","timestamp","nonce")) }
  
  def wx = Action { request => Ok("Got request [" + request + "]") }

}
