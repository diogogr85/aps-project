package controllers;


import java.util.List;

import models.VetSofFacade;
import models.entitie.Procedure;
import play.data.*;
import static play.data.Form.*;
import play.mvc.*;


public class Procedures extends Controller {

	final static Form<Procedure> procedureForm = form(Procedure.class);
	
	static VetSofFacade facade = VetSofFacade.getInstance();
	
	
	public static Result procedures() {
		return ok(views.html.procedure.render(facade.allProcedures(), procedureForm));
	}
	

	public static Result addProcedure() {
    	Form<Procedure> filledForm = procedureForm.bindFromRequest();
    	  if(filledForm.hasErrors()) {
    	    return badRequest(
    	      views.html.procedure.render(facade.allProcedures(), filledForm)
    	    );
    	  } else {
    		facade.createProcedure(filledForm.get());
    	    return redirect(routes.Procedures.procedures());  
    	  }
    	
    }
    
    public static Result deleteProcedure(Long id) {
    	facade.removeProcedure(id);
    	return redirect(routes.Procedures.procedures());
    }
    
//    public static Result editProcedure(Long id) {
////    	Thing thing = Thing.find.where().idEq(id).findUnique();
////        Form<Thing> editForm = thingForm.fill(thing);
//    	
////        return ok(views.html.thingEdit.render(thing, editForm));
//    	
////    	Form<Procedure> editForm = procedureForm.fill(Procedure.getProcedureById(id));
////        
////        return ok(views.html.update.render(editForm));
//    	return TODO;
//    }
    
//    public static Result updateProcedure(Long id) {
//    	Form<Procedure> filledForm = procedureForm.bindFromRequest();
//        if (filledForm.hasErrors()) {
////          Procedure procedure = Procedure.getProcedureById(id);
//          return badRequest(views.html.procedure.render(Procedure.all(), filledForm));
//        } else {
//          Procedure procedure = filledForm.get();
//          Procedure.update(id, procedure);
//          return redirect(routes.Procedures.procedures());
//        }
//    }
}
