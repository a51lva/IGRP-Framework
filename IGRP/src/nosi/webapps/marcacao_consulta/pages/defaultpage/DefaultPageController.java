package nosi.webapps.marcacao_consulta.pages.defaultpage;
import nosi.webapps.igrp.pages.home.HomeAppView;
import java.io.IOException;
import nosi.core.webapp.Response;
import nosi.core.webapp.Controller;
public class DefaultPageController extends Controller {	
public Response actionIndex() throws IOException{
HomeAppView view = new HomeAppView();
view.title = "Marca��o de Consulta";
return this.renderView(view,true);
}
}