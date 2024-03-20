package com.minatoorgtestcase.exporttesting1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatoorgtestcase.exporttesting1.base.controller.ExportTesting1Table1BaseController;
import com.minatoorgtestcase.exporttesting1.service.IExportTesting1Table1Service;
import com.minatoorgtestcase.exporttesting1.service.ExportTesting1Table1Service;
import com.minatoorgtestcase.exporttesting1.model.ExportTesting1Table1;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/exporttesting1table1s/", produces = "application/json")
public class ExportTesting1Table1Controller extends ExportTesting1Table1BaseController<IExportTesting1Table1Service<ExportTesting1Table1>, ExportTesting1Table1> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExportTesting1Table1Controller.class.getName());
	public ExportTesting1Table1Controller(ExportTesting1Table1Service exporttesting1table1Service) {
		super(exporttesting1table1Service);
	}
}
