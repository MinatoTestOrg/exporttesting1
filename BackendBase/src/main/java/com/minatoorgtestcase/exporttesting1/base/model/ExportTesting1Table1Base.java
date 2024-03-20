package com.minatoorgtestcase.exporttesting1.base.model;
import com.vs.rappit.base.model.BaseModel;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.annotations.Searchable;


@Table(name="ExportTesting1Table1", keys={"sid"})
public class ExportTesting1Table1Base extends BaseModel {

	@Searchable(index = true)
	private String exporttesting1table1field1;
	@Searchable(index = true)
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