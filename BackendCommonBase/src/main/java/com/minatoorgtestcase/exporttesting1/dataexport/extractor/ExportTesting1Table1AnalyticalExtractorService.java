package com.minatoorgtestcase.exporttesting1.dataexport.extractor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.minatoorgtestcase.exporttesting1.base.model.ExportTesting1Table1AnalyticalBase;
import com.minatoorgtestcase.exporttesting1.base.dataexport.extractor.ExportTesting1Table1BaseAnalyticalExtractorService;
import com.vs.rappit.base.listener.BaseApplicationConfiguration;

@Component
@Scope(value = "prototype")
public class ExportTesting1Table1AnalyticalExtractorService extends ExportTesting1Table1BaseAnalyticalExtractorService<ExportTesting1Table1AnalyticalBase> {
	private Logger LOGGER = LoggerFactory.getLogger(ExportTesting1Table1AnalyticalExtractorService.class);
	
	public ExportTesting1Table1AnalyticalExtractorService(BaseApplicationConfiguration baseApplicationConfiguration) {
		super(ExportTesting1Table1AnalyticalBase.class, baseApplicationConfiguration);
	}
}
