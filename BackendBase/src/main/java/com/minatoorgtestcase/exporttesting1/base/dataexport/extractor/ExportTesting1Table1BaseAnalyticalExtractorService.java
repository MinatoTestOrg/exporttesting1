package com.minatoorgtestcase.exporttesting1.base.dataexport.extractor;

import com.minatoorgtestcase.exporttesting1.base.model.ExportTesting1Table1AnalyticalBase;
import com.vs.rappit.base.analytical.extractor.logic.BaseAnalyticalExtractorService;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vs.rappit.base.analytical.extract.provider.AnalyticalExtractOptions;
import com.vs.rappit.base.listener.BaseApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

public class ExportTesting1Table1BaseAnalyticalExtractorService<T extends ExportTesting1Table1AnalyticalBase> extends BaseAnalyticalExtractorService<T>{
	private Logger LOGGER = LoggerFactory.getLogger(ExportTesting1Table1BaseAnalyticalExtractorService.class);

	public ExportTesting1Table1BaseAnalyticalExtractorService(Class<T> modelClass, BaseApplicationConfiguration baseApplicationConfiguration) {
		super(modelClass);
		addPersistenceOption(AnalyticalExtractOptions.USE_LEGACY_SQL, false);
	}
}
