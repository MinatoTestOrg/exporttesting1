package com.minatoorgtestcase.exporttesting1.base.dataexport.extractor;

import org.springframework.beans.factory.annotation.Autowired;

import com.minatoorgtestcase.exporttesting1.base.model.ExportTesting1Table1AnalyticalBase;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vs.rappit.dataexport.handler.ExportExtractor;
import com.vs.rappit.dataexport.model.RappitExport;

public class ExportTesting1Table1BaseExportExtractor<SERVICE extends ExportTesting1Table1BaseAnalyticalExtractorService<M>,M extends ExportTesting1Table1AnalyticalBase> extends ExportExtractor<RappitExport> {

	private Logger LOGGER = LoggerFactory.getLogger(ExportTesting1Table1BaseExportExtractor.class);

	protected SERVICE logic;
	
	public ExportTesting1Table1BaseExportExtractor(boolean isChunk, SERVICE logic) {
		super(isChunk);
		this.logic = logic;
	}

	@Override
	public Object extractFile(String outputBucketName, String outputGcsFolderUrl, String query) {
		return logic.createExtract(query, outputBucketName, outputGcsFolderUrl);
	}

}
