package controllers;

import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(views.html.index.render("VetSoft system - Gerencie a sua clínica com facilidade e segurança."));
    }
    
}
