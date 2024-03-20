package com.minatoorgtestcase.exporttesting1.base.model;

import com.vs.rappit.base.annotations.Searchable;
import com.vs.rappit.base.authentication.UserPrivilege;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.annotations.Searchable;
@Table(name="ApplicationUser", keys={"sid"})
public class ApplicationUserBase extends UserPrivilege {


	@Searchable(index = true)
	private Boolean appAdmin=false;
	@Searchable(index = true)
	private Boolean minato=false;
	@Searchable(index = true)
	private Boolean itachi=false;

	public void setAppAdmin(Boolean appAdmin) {
		this.appAdmin = appAdmin;
	}

	public Boolean isAppAdmin() {
		return appAdmin;
	}

	public void setMinato(Boolean minato) {
		this.minato = minato;
	}

	public Boolean isMinato() {
		return minato;
	}

	public void setItachi(Boolean itachi) {
		this.itachi = itachi;
	}

	public Boolean isItachi() {
		return itachi;
	}


}