package nz.co.at.crm.web.rest;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import nz.co.at.crm.web.rest.config.ResourceModule;

import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;
import org.jolokia.jvmagent.JvmAgent;

import com.google.inject.Module;

public class Bootstrap extends GuiceResteasyBootstrapServletContextListener {

	@Override
	protected List<? extends Module> getModules(final ServletContext context) {
		JvmAgent.agentmain(null);
		return Arrays.asList(new ResourceModule());
	}

	@Override
	public void contextDestroyed(final ServletContextEvent event) {
		super.contextDestroyed(event);
		JvmAgent.agentmain("mode=stop");
	}

}
