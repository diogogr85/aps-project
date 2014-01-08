
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
object procedure extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Procedure],Form[Procedure],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(procedures: List[Procedure], procedureForm: Form[Procedure]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.63*/("""

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
            <form action=""""),_display_(Seq[Any](/*21.28*/routes/*21.34*/.Procedures.editProcedure(procedure.getId()))),format.raw/*21.78*/("""">
            	<input type="submit" value="Editar">
            </form>
			<p>------------------------------------------</p>
		""")))})),format.raw/*25.4*/("""
	
	
	</br></br>
	
	<h3>Cadastre um novo procedimento</h3>

	<form action=""""),_display_(Seq[Any](/*32.17*/routes/*32.23*/.Procedures.addProcedure())),format.raw/*32.49*/("""" method="post">
    	Tipo do procedimento: <input name="procedureType" value="procedureForm.getProcedureType()"> </br>
    	Descrição: <input name="description"> </br>
    	Responsável: <input name="doctor" value="procedureForm.getDoctor()"> </br>
    	Auxiliar: <input name="auxiliar"> </br>
    	Animal: <input name="animal"> </br>
    	<input type="submit" value="Cadastrar">

    </form>

""")))})))}
    }
    
    def render(procedures:List[Procedure],procedureForm:Form[Procedure]): play.api.templates.HtmlFormat.Appendable = apply(procedures,procedureForm)
    
    def f:((List[Procedure],Form[Procedure]) => play.api.templates.HtmlFormat.Appendable) = (procedures,procedureForm) => apply(procedures,procedureForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 08 03:39:41 GMT-03:00 2014
                    SOURCE: C:/desenvolvimento/vetSoft/app/views/procedure.scala.html
                    HASH: 2cffb2a08b17c5993d0dd7903ccad5e0d72ce5e0
                    MATRIX: 803->1|975->62|1005->84|1042->87|1070->107|1109->109|1182->147|1226->175|1266->177|1339->214|1357->223|1387->231|1441->249|1459->258|1500->277|1561->302|1579->311|1613->323|1671->345|1689->354|1725->368|1781->388|1799->397|1833->409|1905->445|1920->451|1988->497|2128->601|2143->607|2209->651|2373->784|2492->867|2507->873|2555->899
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|46->18|49->21|49->21|49->21|53->25|60->32|60->32|60->32
                    -- GENERATED --
                */
            