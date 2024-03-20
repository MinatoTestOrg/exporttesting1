package com.minatoorgtestcase.exporttesting1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatoorgtestcase.exporttesting1.base.controller.ApplicationUserBaseController;
import com.minatoorgtestcase.exporttesting1.service.IApplicationUserService;
import com.minatoorgtestcase.exporttesting1.service.ApplicationUserService;
import com.minatoorgtestcase.exporttesting1.model.ApplicationUser;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping(path = "/rest/applicationusers/", produces = "application/json")
public class ApplicationUserController extends ApplicationUserBaseController<IApplicationUserService<ApplicationUser>, ApplicationUser> {

	public ApplicationUserController(ApplicationUserService applicationUserService) {
		super(applicationUserService);
	}
	
		
	
	
}
