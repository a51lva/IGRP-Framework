package nosi.core.webapp.helpers;
/**
 * @author Emanuel Pereira
 * May 29, 2017
 */

import nosi.core.webapp.Igrp;
import nosi.webapps.igrp.dao.Application;
import nosi.webapps.igrp.dao.Menu;
import nosi.webapps.igrp.dao.Organization;
import nosi.webapps.igrp.dao.Profile;
import nosi.webapps.igrp.dao.ProfileType;
import nosi.webapps.igrp.dao.Transaction;
import nosi.webapps.igrp.dao.User;

public class Permission {

	public static boolean isPermition(String app,String page,String action){//check permission on app		
		if(Igrp.getInstance().getUser()!=null && Igrp.getInstance().getUser().isAuthenticated()){
			if(
				(action.equals("index") && app.equals("igrp") && page.equals("home")) || 
				(action.equals("logout") && app.equals("igrp") && page.equals("login"))|| 
				(action.equals("myMenu") && app.equals("igrp") && page.equals("pesquisar-menu"))|| 
				(action.equals("myApps") && app.equals("igrp") && page.equals("env")) ||
				(action.equals("login") && app.equals("igrp") && page.equals("login")) ||
				(action.equals("permission") && app.equals("igrp") && page.equals("error-page")) ||
				(action.equals("exception") && app.equals("igrp") && page.equals("error-page")) ||
				(action.equals("notFound") && app.equals("igrp") && page.equals("error-page"))  ||
				(action.equals("openApp") && app.equals("igrp") && page.equals("env")) 
			  ){
				return true;
			}
			boolean x = new Application().getPermissionApp(app);
			if(!x){
				x = new Menu().getPermissionMen(app);
			}
			return x;
		}else if(
					(action.equals("login") && app.equals("igrp") && page.equals("login")) ||
					(action.equals("permission") && app.equals("igrp") && page.equals("error-page")) ||
					(action.equals("exception") && app.equals("igrp") && page.equals("error-page")) ||
					(action.equals("notFound") && app.equals("igrp") && page.equals("error-page")) 
				){
			return true;
		}
		return false;
	}
	
	public static boolean isPermission(String transaction){
		return new Transaction().getPermission(transaction);
	}
	
//	public static void changeOrgAndProfile(String dad){
//		Application app = new Application();
//		app = app.findOne(app.getCriteria().where(app.getBuilder().equal(app.getRoot().get("dad"), dad)));
//		ProfileType profType = new ProfileType();
//		Organization org = new Organization();
//		if(app!=null && app.getId()!=0){
//			int id_user = Igrp.getInstance().getUser().getIdentity().getIdentityId();
//			int id_app = app.getId();
//			if(app.getPermissionApp(dad)){
//				Profile prof = (Profile) new Profile().getByUserPerfil(id_user,id_app);
//				if(prof!=null){          
//					org.setId(prof.getOrganization().getId());
//					profType.setId(prof.getProfileType().getId());
//					String data_cache = getDataCache(dad);
//					if(data_cache==null || data_cache.equals("")){
//						String data = prof.getOrganization().getId()+"-"+prof.getProfileType().getId();
//						Igrp.getInstance().getResponse().addCookie(new Cookie(dad,data));
//					}
//				}
//			}else{
//				Igrp.getInstance().getResponse().addCookie(new Cookie(dad, ""));
//			}
//		}else{
//			Igrp.getInstance().getResponse().addCookie(new Cookie(dad, ""));
//		}
//		Igrp.getInstance().getResponse().addCookie(new Cookie("_env", dad));
//		
//		((User)Igrp.getInstance().getUser().getIdentity()).setAplicacao(app);
//		((User)Igrp.getInstance().getUser().getIdentity()).setProfile(profType);
//		((User)Igrp.getInstance().getUser().getIdentity()).setOrganica(org);
//	}
	
	public static void changeOrgAndProfile(String dad){
		Application app = new Application();
		app = app.findOne(app.getCriteria().where(app.getBuilder().equal(app.getRoot().get("dad"), dad)));
		ProfileType profType = new ProfileType();
		Organization org = new Organization();
		Profile prof = new Profile();
		if(app!=null && app.getId()!=0){
			int id_user = Igrp.getInstance().getUser().getIdentity().getIdentityId();
			int id_app = app.getId();
			if(app.getPermissionApp(dad)){
				prof = (Profile) prof.getByUserPerfil(id_user,id_app);
				if(prof!=null){  
					org.setId(prof.getOrganization().getId());
					profType.setId(prof.getProfileType().getId());
				}
			}
		}		
		((User)Igrp.getInstance().getUser().getIdentity()).setAplicacao(app);
		((User)Igrp.getInstance().getUser().getIdentity()).setProfile(profType);
		((User)Igrp.getInstance().getUser().getIdentity()).setOrganica(org);
		 Igrp.getInstance().getRequest().getSession().setAttribute("org", org.getId()+ "");
		 Igrp.getInstance().getRequest().getSession().setAttribute("prof", prof.getId()+ "");
		 Igrp.getInstance().getRequest().getSession().setAttribute("env", app.getDad()+ "");
	}
	
	public static String getCurrentEnv() {
		String env = (String) Igrp.getInstance().getRequest().getSession().getAttribute("env");
		return env!=null && !env.equals("")?env:"igrp";
	}
	
	public static int getCurrentPerfilId() {
		String prof = (String) Igrp.getInstance().getRequest().getSession().getAttribute("prof");
		return prof!=null && !prof.equals("")?Integer.parseInt(prof):-1;
	}

	public static int getCurrentOrganization() {
		String org = (String) Igrp.getInstance().getRequest().getSession().getAttribute("org");
		return org!=null && !org.equals("")?Integer.parseInt(org):-1;
	}
}
