/*-------------------------*/

/*Create Controller*/

package nosi.webapps.kofax.pages.listaobjeto;
import nosi.core.webapp.Controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.kofax.pages.listaobjeto.ListaObjeto.Table_1;

import nosi.core.webapp.Response;
import nosi.webapps.kofax.dao.Objeto;

/*---- Import your packages here... ----*//*---- End ----*/

public class ListaObjetoController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		ListaObjeto model = new ListaObjeto();
		ListaObjetoView view = new ListaObjetoView(model);
		
		Objeto obj = new Objeto();
		List<Objeto> lista_obj = obj.findAll();
		List<ListaObjeto.Table_1> data = new ArrayList<>();
		
		for(Objeto o:lista_obj) {
			ListaObjeto.Table_1 tabela = new ListaObjeto.Table_1();
			tabela.setObjeto(o.getObjeto());
			tabela.setPagina(o.getLink_pagina());
			tabela.setOrganica(o.getOrganica());
			tabela.setEstado(o.getEstado());
			data.add(tabela);
		}
		view.table_1.addData(data);
		view.p_id.setParam(true);
		
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionNovo() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("kofax","NovoObjeto","index");
		/*---- End ----*/
	}
	

	public Response actionEditar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("kofax","NovoObjeto","index");
		/*---- End ----*/
	}
	

	public Response actionEliminar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("kofax","ListaObjeto","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
