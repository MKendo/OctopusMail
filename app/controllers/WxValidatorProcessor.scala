package controllers

import controllers.WxValidator

class WxValidatorProcessor extends Controller {
  val memberApplyForm = Form(
      mapping(
        "msg_signature" -> text,
        "timestamp" -> text,
        "nonce" -> text,           
        "echostr" -> text
      )(WxValidator.apply)(WxValidator.unapply)
    )
    
   def save(echostr: String,msg_signature: String, timestamp: String, nonce: String) = Action {
       //request => Ok("Got request [" + request + "]") 
       Ok(views.xml.response(echostr,msg_signature,timestamp,nonce)) 
   }
}