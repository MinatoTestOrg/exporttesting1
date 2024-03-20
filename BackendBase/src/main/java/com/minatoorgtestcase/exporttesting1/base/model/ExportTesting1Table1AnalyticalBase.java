package com.minatoorgtestcase.exporttesting1.base.model;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.model.BaseAnalyticalModel;


@Table(name="ExportTesting1Table1")
public class ExportTesting1Table1AnalyticalBase extends BaseAnalyticalModel {
	private static final long serialVersionUID = -1653584662510644834L;
		private String exporttesting1table1field1;
	private String exporttesting1table1field2;

	public void setExporttesting1table1field1(String exporttesting1table1field1) {
		this.exporttesting1table1field1 = exporttesting1table1field1;
	}

	public String getExporttesting1table1field1() {
		return exporttesting1table1field1;
	}

	public void setExporttesting1table1field2(String exporttesting1table1field2) {
		this.exporttesting1table1field2 = exporttesting1table1field2;
	}

	public String getExporttesting1table1field2() {
		return exporttesting1table1field2;
	}


}