
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
object procedure extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[entitie.Procedure],Form[entitie.Procedure],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(procedures: List[entitie.Procedure], procedureForm: Form[entitie.Procedure]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.79*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("CRUD Actions")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""

	<h3>Procedimentos</h3>
	
	
		"""),_display_(Seq[Any](/*10.4*/for(procedure <- procedures) yield /*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
			Identificação do Procedimento: """),_display_(Seq[Any](/*11.36*/procedure/*11.45*/.getId())),format.raw/*11.53*/(""" </br>
			Tipo: """),_display_(Seq[Any](/*12.11*/procedure/*12.20*/.getProcedureType())),format.raw/*12.39*/(""" </br>
			Responsável: """),_display_(Seq[Any](/*13.18*/procedure/*13.27*/.getDoctor())),format.raw/*13.39*/(""" </br>
			Auxiliar: """),_display_(Seq[Any](/*14.15*/procedure/*14.24*/.getAuxiliar())),format.raw/*14.38*/(""" </br>
			Animal: """),_display_(Seq[Any](/*15.13*/procedure/*15.22*/.getAnimal())),format.raw/*15.34*/(""" </br>
			
			
			<form action=""""),_display_(Seq[Any](/*18.19*/routes/*18.25*/.Procedures.deleteProcedure(procedure.getId()))),format.raw/*18.71*/("""">
            	<input type="submit" value="Deletar">
            </form>
            
			<p>------------------------------------------</p>
		""")))})),format.raw/*23.4*/("""
	
	
	</br></br>
	
	<h3>Cadastre um novo procedimento</h3>

	<form action=""""),_display_(Seq[Any](/*30.17*/routes/*30.23*/.Procedures.addProcedure())),format.raw/*30.49*/("""" method="post">
    	Tipo do procedimento: <input name="procedureType"> </br>
    	Descrição: <input name="description"> </br>
    	Responsável: <input name="doctor"> </br>
    	Auxiliar: <input name="auxiliar"> </br>
    	Animal: <input name="animal"> </br>
    	<input type="submit" value="Cadastrar">

    </form>

""")))})))}
    }
    
    def render(procedures:List[entitie.Procedure],procedureForm:Form[entitie.Procedure]): play.api.templates.HtmlFormat.Appendable = apply(procedures,procedureForm)
    
    def f:((List[entitie.Procedure],Form[entitie.Procedure]) => play.api.templates.HtmlFormat.Appendable) = (procedures,procedureForm) => apply(procedures,procedureForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 08 20:40:35 GMT-03:00 2014
                    SOURCE: C:/desenvolvimento/vetSoft/app/views/procedure.scala.html
                    HASH: 4edef1090bc766076df1c0fbb3c8ac58ea4f6419
                    MATRIX: 819->1|1007->78|1037->100|1074->103|1102->123|1141->125|1214->163|1258->191|1298->193|1371->230|1389->239|1419->247|1473->265|1491->274|1532->293|1593->318|1611->327|1645->339|1703->361|1721->370|1757->384|1813->404|1831->413|1865->425|1937->461|1952->467|2020->513|2199->661|2318->744|2333->750|2381->776
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|46->18|51->23|58->30|58->30|58->30
                    -- GENERATED --
                */
            