package com.minatoorgtestcase.exporttesting1.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.minatoorgtestcase.exporttesting1.base.service.ExportTesting1Table1BaseService;
import com.minatoorgtestcase.exporttesting1.model.ExportTesting1Table1;
import com.minatoorgtestcase.exporttesting1.service.ExportTesting1Table1PerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("ExportTesting1Table1")
public class ExportTesting1Table1Service extends ExportTesting1Table1BaseService<ExportTesting1Table1> implements IExportTesting1Table1Service<ExportTesting1Table1>{

		@Autowired
		private  ExportTesting1Table1PerimeterImpl  exporttesting1table1PerimeterImpl;

		public ExportTesting1Table1Service(ChangelogService changelogService) {
		super(ExportTesting1Table1.class);	
		setChangelogService(changelogService); 
		
	}
	
}