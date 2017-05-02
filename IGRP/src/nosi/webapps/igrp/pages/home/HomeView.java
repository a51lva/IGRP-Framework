package nosi.webapps.igrp.pages.home;

import nosi.core.config.Config;
import nosi.core.gui.components.IGRPHome;
import nosi.core.webapp.View;

public class HomeView extends View{

	private IGRPHome home;
	public HomeView(){
		this.home = new IGRPHome("home");
	}
	@Override
	public void render() {
		Config.TITLE = "Home";
		this.addToPage(home);
	}

}
