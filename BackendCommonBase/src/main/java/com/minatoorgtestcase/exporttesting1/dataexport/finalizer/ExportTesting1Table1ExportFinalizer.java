package com.minatoorgtestcase.exporttesting1.dataexport.finalizer;

import org.springframework.stereotype.Service;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.minatoorgtestcase.exporttesting1.base.dataexport.finalizer.ExportTesting1Table1BaseExportFinalizer;
import com.minatoorgtestcase.exporttesting1.service.ApplicationUserService;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = "prototype")
public class ExportTesting1Table1ExportFinalizer extends ExportTesting1Table1BaseExportFinalizer {

	private Logger LOGGER = LoggerFactory.getLogger(ExportTesting1Table1ExportFinalizer.class);
	
	public ExportTesting1Table1ExportFinalizer(ApplicationUserService applicationUserService) {
		super(applicationUserService, true);
	}

}
