/*-------------------------*/

/*Create Controller*/

package nosi.webapps.agenda.pages.pontoatendimento;
/*---- Import your packages here... ----*/
import nosi.core.webapp.Controller;
import nosi.core.webapp.Igrp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nosi.core.webapp.Response;
import nosi.core.webapp.helpers.IgrpHelper;
import nosi.core.webapp.helpers.Permission;
import nosi.webapps.igrp.dao.Application;
import nosi.webapps.igrp.dao.Organization;

/*---- End ----*/

public class PontoAtendimentoController extends Controller {		


	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*---- Insert your code here... ----*/
		PontoAtendimento model = new PontoAtendimento();
		String ichange = Igrp.getInstance().getRequest().getParameter("ichange");
		List<PontoAtendimento.Table_1> table1 = new ArrayList<>();
		List<PontoAtendimento.Table_2> table2 = new ArrayList<>();
		if(Igrp.getInstance().getRequest().getMethod().toUpperCase().equals("POST") && ichange!=null){
			model.load();
			for(Organization org:new Organization().find().andWhere("application", "=", model.getP_id_entidade()).all()){
				PontoAtendimento.Table_1 t1 = new PontoAtendimento.Table_1();
				t1.setOrganica(org.getName());
				table1.add(t1);
			}
		}
		
		PontoAtendimentoView view = new PontoAtendimentoView(model);		
		Map<Integer, String> sim_nao = new HashMap<Integer,String>();
		sim_nao.put(1, "Sim");
		sim_nao.put(0, "Não");
		Map<Integer,Integer> n_servicos = new HashMap<Integer,Integer>();
		n_servicos.put(2,2);
		n_servicos.put(3,3);
		n_servicos.put(4,4);
		n_servicos.put(5,5);
		n_servicos.put(6,6);
		view.entidade.setValue(IgrpHelper.toMap(new Application().find().andWhere("dad", "=", Permission.getCurrentEnv()).all(), "id", "name","--- Selecionar Entidade ---"));
		view.n_de_servicos.setValue(n_servicos);
		view.confirmacao_automatica.setValue(sim_nao);
		view.n_de_servicos.setLabel("Nº Serviço");
		view.localizacao.setLabel("Localização");
		view.horario_de_atendimento.setLabel("Horário Atendimento");
		view.fuso_horario.setLabel("Fuso Horário");
		view.confirmacao_automatica.setLabel("Confirmação Automática");
		view.organica.setLabel("Orgânica");
		view.servicos.setLabel("Serviços");
		view.table_1.addData(table1);
		view.table_2.addData(table2);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionGravar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","PontoAtendimento","index");
		/*---- End ----*/
	}
	

	public Response actionNovo() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","AddServicos","index");
		/*---- End ----*/
	}
	

	public Response actionConfigurar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","AddServicos","index");
		/*---- End ----*/
	}
	

	public Response actionRemover() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","PontoAtendimento","index");
		/*---- End ----*/
	}
	

	public Response actionRequisitos() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","REQ_SERVICOS","index");
		/*---- End ----*/
	}
	

	public Response actionEliminar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","PontoAtendimento","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
