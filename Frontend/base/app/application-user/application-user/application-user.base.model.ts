export interface ApplicationUserBase {
	sid: string;
	createdBy: string;
	createdDate: Date;
	modifiedBy: string;
	modifiedDate: Date;
	syncTime: Date;
	email: string;
	firstName: string;
	lastName: string;
	userRoles: string;
	appAdmin: Boolean;
	minato: Boolean;
	itachi: Boolean;
uniqueId:string;
}