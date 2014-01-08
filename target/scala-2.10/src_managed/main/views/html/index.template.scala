
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

	<h1>"""),_display_(Seq[Any](/*5.7*/message)),format.raw/*5.14*/("""</h1>

	</br></br>

    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*10.31*/routes/*10.37*/.Procedures.procedures)),format.raw/*10.59*/("""">Cadastre</a> um procedimento
    </p>



""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 07 18:26:47 GMT-03:00 2014
                    SOURCE: C:/desenvolvimento/vetSoft/app/views/index.scala.html
                    HASH: f43ab16532171597781f87eacbf03faf0ec6b555
                    MATRIX: 774->1|885->18|922->21|953->44|992->46|1034->54|1062->61|1156->119|1171->125|1215->147
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|38->10|38->10|38->10
                    -- GENERATED --
                */
            