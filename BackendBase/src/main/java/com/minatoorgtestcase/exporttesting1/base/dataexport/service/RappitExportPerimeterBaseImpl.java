package com.minatoorgtestcase.exporttesting1.base.dataexport.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.minatoorgtestcase.exporttesting1.base.model.ApplicationUserBase;
import com.vs.rappit.base.acl.AllowedFields;
import com.vs.rappit.base.acl.IPerimeterManager;
import com.vs.rappit.base.authentication.logic.AppUserPrivilegeCache;
import com.vs.rappit.base.dal.providers.PersistenceType;
import com.vs.rappit.dataexport.base.model.RappitExportBase;

public class RappitExportPerimeterBaseImpl<T extends RappitExportBase> implements IPerimeterManager<T> {
	@Autowired
	private AppUserPrivilegeCache<ApplicationUserBase> userCache;

	@Override
	public boolean canCreate(T model) {
		return hasAccess(model);
	}

	@Override
	public boolean canUpdate(T model) {
		return hasAccess(model);
	}

	@Override
	public boolean canDelete(T model) {
		return hasAccess(model);
	}

	@Override
	public boolean canRead(T model) {
		return hasAccess(model);
	}

	protected boolean hasAccess(T model) {
		ApplicationUserBase userBase = (ApplicationUserBase) userCache.getCurrentUser();
		String templateName = model.getExportName();
		
		if (!isTemplateAllowed(templateName, userBase)) {
			if (StringUtils.isNotBlank(userBase.getEmail()) 
					&& StringUtils.isNotBlank(model.getCreatedBy()) && userBase.getEmail().equals(model.getCreatedBy())) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	private boolean isTemplateAllowed(String templateName, ApplicationUserBase userBase) {
		switch (templateName) {
						case "exportTesting1Table1 export 1":
			if (BooleanUtils.isTrue(userBase.isAppAdmin())) { return true; }
				if (BooleanUtils.isTrue(userBase.isMinato())) { return true; }
				break;

		}
		return false;
	}

	@Override
	public String getAccessQuery(PersistenceType type) {
		return null;
	}

	@Override
	public AllowedFields getSelectFields(PersistenceType type) {
		List<String> allowedAccessFields = new ArrayList<>();
		allowedAccessFields.add("*");
		AllowedFields allowedFields = new AllowedFields();
		allowedFields.setAllowedReadFields(allowedAccessFields);
		allowedFields.setAllowedWriteFields(allowedAccessFields);
		return allowedFields;
	}
}