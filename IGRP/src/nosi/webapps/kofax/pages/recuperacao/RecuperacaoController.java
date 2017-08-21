/*-------------------------*/

/*Create Controller*/

package nosi.webapps.kofax.pages.recuperacao;
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- Import your packages here... ----*/
import java.util.HashMap;

import javax.servlet.ServletException;

import nosi.core.webapp.Igrp;
import nosi.core.xml.XMLWritter;
import nosi.webapps.kofax.dao.Campos;
import nosi.webapps.kofax.dao.Dados;
import nosi.webapps.kofax.dao.Objeto;
import nosi.core.webapp.helpers.FileHelper;
import nosi.core.webapp.helpers.IgrpHelper;
/*---- End ----*/
import nosi.core.webapp.helpers.Permission;

public class RecuperacaoController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/		
		Recuperacao model = new Recuperacao();
		RecuperacaoView view = new RecuperacaoView(model);
		view.tipo_objeto.setValue(IgrpHelper.toMap(new Objeto().find().andWhere("organica", "=", Permission.getCurrentOrganization()).all(), "id", "objeto"));
		HashMap<Integer,String> td = new HashMap<>();
		td.put(1, "Passaporte");
		td.put(2, "Livro");
		view.tipo_documento.setValue(td);
		view.campo.setValue(IgrpHelper.toMap(new Campos().findAll(), "id", "campo"));
		return this.renderView(view);
			/*---- End ----*/
	}


	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException, ServletException{
		/*---- Insert your code here... ----*/		
		Recuperacao model = new Recuperacao();
		if(Igrp.getInstance().getRequest().getMethod().toUpperCase().equals("POST")){
			model.load();
			model.setImagem(Igrp.getInstance().getRequest().getPart("p_imagem").getSubmittedFileName());	
			XMLWritter xml = new XMLWritter();
			xml.startElement("columns");
			if(model.getP_campo_fk()!=null){
				for(int i=0;i<model.getP_campo_fk().length;i++){
					xml.setElement(model.getP_campo_fk_desc()[i], model.getP_valor_fk_desc()[i]);
				}
			}
			Objeto obj = new Objeto().findOne(model.getTipo_objeto());
			Dados dados = new Dados(obj, ""+model.getN_do_negocio(), model.getN_de_processo(), model.getNome(), model.getTipo_documento(), model.getN_de_documento(), model.getEstante(), model.getPasta(), model.getLivro(), model.getFolha(), model.getData_de_registo(), xml.toString(), model.getImagem());
			System.out.println(dados);
			if(dados.insert()!=null){
				Igrp.getInstance().getFlashMessage().addMessage("success", "Operação realizada com sucesso!");
			}else{
				Igrp.getInstance().getFlashMessage().addMessage("error", "Operação falhau!");
			}
		}
		return this.redirect("kofax","Recuperacao","index");
			/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
