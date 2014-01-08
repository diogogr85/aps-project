// @SOURCE:C:/desenvolvimento/vetSoft/conf/routes
// @HASH:95c1dceb06f5d6537c6b7711010f1f6f8632c419
// @DATE:Tue Jan 07 22:15:16 GMT-03:00 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:7
class ReverseProcedures {
    

// @LINE:11
def addProcedure(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "procedimento")
}
                                                

// @LINE:7
def procedures(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "procedimento")
}
                                                

// @LINE:9
def editProcedure(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "procedimento/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:12
def deleteProcedure(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "procedimento/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:14
def updateProcedure(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "procedimento/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:7
class ReverseProcedures {
    

// @LINE:11
def addProcedure : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Procedures.addProcedure",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "procedimento"})
      }
   """
)
                        

// @LINE:7
def procedures : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Procedures.procedures",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "procedimento"})
      }
   """
)
                        

// @LINE:9
def editProcedure : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Procedures.editProcedure",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "procedimento/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def deleteProcedure : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Procedures.deleteProcedure",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "procedimento/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def updateProcedure : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Procedures.updateProcedure",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "procedimento/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:7
class ReverseProcedures {
    

// @LINE:11
def addProcedure(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Procedures.addProcedure(), HandlerDef(this, "controllers.Procedures", "addProcedure", Seq(), "POST", """""", _prefix + """procedimento""")
)
                      

// @LINE:7
def procedures(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Procedures.procedures(), HandlerDef(this, "controllers.Procedures", "procedures", Seq(), "GET", """""", _prefix + """procedimento""")
)
                      

// @LINE:9
def editProcedure(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Procedures.editProcedure(id), HandlerDef(this, "controllers.Procedures", "editProcedure", Seq(classOf[Long]), "GET", """ GET		/procedimento				controllers.Procedures.getProcedureById(id: Long)""", _prefix + """procedimento/$id<[^/]+>""")
)
                      

// @LINE:12
def deleteProcedure(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Procedures.deleteProcedure(id), HandlerDef(this, "controllers.Procedures", "deleteProcedure", Seq(classOf[Long]), "POST", """""", _prefix + """procedimento/$id<[^/]+>""")
)
                      

// @LINE:14
def updateProcedure(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Procedures.updateProcedure(id), HandlerDef(this, "controllers.Procedures", "updateProcedure", Seq(classOf[Long]), "POST", """""", _prefix + """procedimento/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    