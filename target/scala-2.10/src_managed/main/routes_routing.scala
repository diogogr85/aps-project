// @SOURCE:C:/desenvolvimento/vetSoft/conf/routes
// @HASH:95c1dceb06f5d6537c6b7711010f1f6f8632c419
// @DATE:Tue Jan 07 22:15:16 GMT-03:00 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Procedures_procedures1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("procedimento"))))
        

// @LINE:9
private[this] lazy val controllers_Procedures_editProcedure2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("procedimento/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:11
private[this] lazy val controllers_Procedures_addProcedure3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("procedimento"))))
        

// @LINE:12
private[this] lazy val controllers_Procedures_deleteProcedure4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("procedimento/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:14
private[this] lazy val controllers_Procedures_updateProcedure5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("procedimento/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """procedimento""","""controllers.Procedures.procedures()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """procedimento/$id<[^/]+>""","""controllers.Procedures.editProcedure(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """procedimento""","""controllers.Procedures.addProcedure()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """procedimento/$id<[^/]+>""","""controllers.Procedures.deleteProcedure(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """procedimento/$id<[^/]+>""","""controllers.Procedures.updateProcedure(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Procedures_procedures1(params) => {
   call { 
        invokeHandler(controllers.Procedures.procedures(), HandlerDef(this, "controllers.Procedures", "procedures", Nil,"GET", """""", Routes.prefix + """procedimento"""))
   }
}
        

// @LINE:9
case controllers_Procedures_editProcedure2(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Procedures.editProcedure(id), HandlerDef(this, "controllers.Procedures", "editProcedure", Seq(classOf[Long]),"GET", """ GET		/procedimento				controllers.Procedures.getProcedureById(id: Long)""", Routes.prefix + """procedimento/$id<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_Procedures_addProcedure3(params) => {
   call { 
        invokeHandler(controllers.Procedures.addProcedure(), HandlerDef(this, "controllers.Procedures", "addProcedure", Nil,"POST", """""", Routes.prefix + """procedimento"""))
   }
}
        

// @LINE:12
case controllers_Procedures_deleteProcedure4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Procedures.deleteProcedure(id), HandlerDef(this, "controllers.Procedures", "deleteProcedure", Seq(classOf[Long]),"POST", """""", Routes.prefix + """procedimento/$id<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_Procedures_updateProcedure5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Procedures.updateProcedure(id), HandlerDef(this, "controllers.Procedures", "updateProcedure", Seq(classOf[Long]),"POST", """""", Routes.prefix + """procedimento/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     