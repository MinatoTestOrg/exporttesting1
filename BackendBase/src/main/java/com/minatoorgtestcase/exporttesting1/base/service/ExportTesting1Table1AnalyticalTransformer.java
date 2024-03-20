package com.minatoorgtestcase.exporttesting1.base.service;

import com.vs.rappit.base.model.IModelTransformer;
import com.minatoorgtestcase.exporttesting1.base.model.ExportTesting1Table1Base;
import com.minatoorgtestcase.exporttesting1.base.model.ExportTesting1Table1AnalyticalBase;
import com.vs.rappit.base.util.Configuration;
import java.util.stream.Collectors;

public class ExportTesting1Table1AnalyticalTransformer<T extends ExportTesting1Table1Base, M extends ExportTesting1Table1AnalyticalBase>
		implements IModelTransformer<T, M> {
	private static final String SEPARATOR = "#@$%!*&";
	@Override
	public M writeTo(T model) {
		ExportTesting1Table1AnalyticalBase exportTesting1Table1AnalyticalBase = new ExportTesting1Table1AnalyticalBase();
			exportTesting1Table1AnalyticalBase.setExporttesting1table1field1(model.getExporttesting1table1field1());
	exportTesting1Table1AnalyticalBase.setExporttesting1table1field2(model.getExporttesting1table1field2());
		exportTesting1Table1AnalyticalBase.setSid(model.getSid());
		return (M) exportTesting1Table1AnalyticalBase;
	}

	@Override
	public Object readFrom(M data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<T> getSourceClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<M> getTargetClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
