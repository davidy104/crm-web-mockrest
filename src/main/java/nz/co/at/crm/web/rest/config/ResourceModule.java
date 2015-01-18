package nz.co.at.crm.web.rest.config;

import nz.co.at.crm.web.rest.resources.CrmWebResources;

import com.google.inject.AbstractModule;

public class ResourceModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(CrmWebResources.class);
	}
}
