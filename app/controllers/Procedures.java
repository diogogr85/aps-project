package controllers;


import java.util.List;

import models.Procedure;
import play.data.*;
import static play.data.Form.*;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class Procedures extends Controller {

	final static Form<Procedure> procedureForm = form(Procedure.class);
	
	public static Result procedures() {
		return ok(
				views.html.procedure.render(Procedure.all(), procedureForm)
		);
	}
	
//	public static Result getProcedureById(Long id) {
//		Procedure procedure = new Model.Finder<>(Long.class, Procedure.class).byId(id);
//		return ok(Json.toJson(procedure));
//	}

	public static Result addProcedure() {
    	Form<Procedure> filledForm = procedureForm.bindFromRequest();
    	  if(filledForm.hasErrors()) {
    	    return badRequest(
    	      views.html.procedure.render(Procedure.all(), filledForm)
    	    );
    	  } else {
    	    Procedure.create(filledForm.get());
    	    return redirect(routes.Procedures.procedures());  
    	  }
    	
    }
    
    public static Result deleteProcedure(Long id) {
    	Procedure.delete(id);
    	return redirect(routes.Procedures.procedures());
    }
    
    public static Result editProcedure(Long id) {
//    	Thing thing = Thing.find.where().idEq(id).findUnique();
//        Form<Thing> editForm = thingForm.fill(thing);
    	
//        return ok(views.html.thingEdit.render(thing, editForm));
    	Form<Procedure> editForm = procedureForm.fill(Procedure.getProcedureById(id));
        
        return ok(views.html.update.render(editForm));
        
        
    }
    public static Result updateProcedure(Long id) {
    	Form<Procedure> filledForm = procedureForm.bindFromRequest();
        if (filledForm.hasErrors()) {
//          Procedure procedure = Procedure.getProcedureById(id);
          return badRequest(views.html.procedure.render(Procedure.all(), filledForm));
        } else {
          Procedure procedure = filledForm.get();
          Procedure.update(id, procedure);
          return redirect(routes.Procedures.procedures());
        }
    }
}
