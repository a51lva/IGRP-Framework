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
import nosi.webapps.agenda.dao.Balcao;
import nosi.webapps.agenda.dao.Entidade;
import nosi.webapps.agenda.dao.Servicos;

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
			List<Balcao> balcoes = Entidade.getAllBalcao(Integer.parseInt(model.getEntidade()));
			for(Balcao b:balcoes){
				PontoAtendimento.Table_1 t1 = new PontoAtendimento.Table_1();
				t1.setPonto_atendimento(b.getNome_balcao());
				t1.setEstado_list(b.getEstado());
				table1.add(t1);
			}

			List<Servicos> servicos = Entidade.getAllServicos(Integer.parseInt(model.getEntidade()));
			for(Servicos s:servicos){
				PontoAtendimento.Table_2 t2 = new PontoAtendimento.Table_2();
				t2.setP_id_servico(""+s.getId());
				t2.setServicos(s.getNome_servico());
				table2.add(t2);
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
		Map<Integer,String> entidades = new HashMap<>();
		entidades.put(null, "--- Selecionar Entidade ---");
		List<Entidade> listE = Entidade.getAllEntidade();
		if(listE!=null){
			for(Entidade e:listE){
				entidades.put(e.getId(), e.getNome_entidade());
			}
		}
		view.entidade.setValue(entidades);
		view.n_de_servicos.setValue(n_servicos);
		view.confirmacao_automatica.setValue(sim_nao);
		view.n_de_servicos.setLabel("Nº de Serviços");
		view.localizacao.setLabel("Localização");
		view.horario_de_atendimento.setLabel("Horário Atendimento");
		view.fuso_horario.setLabel("Fuso Horário");
		view.confirmacao_automatica.setLabel("Confirmação Automática");
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
