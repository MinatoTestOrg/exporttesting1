package com.minatoorgtestcase.exporttesting1.dataexport.extractor;

import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.minatoorgtestcase.exporttesting1.base.model.ExportTesting1Table1AnalyticalBase;
import com.minatoorgtestcase.exporttesting1.base.dataexport.extractor.ExportTesting1Table1BaseExportExtractor;
import com.minatoorgtestcase.exporttesting1.dataexport.extractor.ExportTesting1Table1AnalyticalExtractorService;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = "prototype")
public class ExportTesting1Table1ExportExtractor extends ExportTesting1Table1BaseExportExtractor<ExportTesting1Table1AnalyticalExtractorService, ExportTesting1Table1AnalyticalBase> {

	private Logger LOGGER = LoggerFactory.getLogger(ExportTesting1Table1ExportExtractor.class);
	
	public ExportTesting1Table1ExportExtractor(ExportTesting1Table1AnalyticalExtractorService logic) {
		super(true, logic);
	}

	
}
