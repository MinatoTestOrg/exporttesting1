import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CanDeactivateGuard } from '@baseapp/auth.can-deactivate-guard.service';

import { Exporttesting1table1ListComponent } from '@app/exporttesting1table1/exporttesting1table1/exporttesting1table1-list/exporttesting1table1-list.component';
import { Exporttesting1table1DetailComponent } from '@app/exporttesting1table1/exporttesting1table1/exporttesting1table1-detail/exporttesting1table1-detail.component';

export const routes: Routes = [

{
     path: 'exporttesting1table1list',
     component: Exporttesting1table1ListComponent,
     canDeactivate: [ CanDeactivateGuard ],
     data: {
     	label: "EXPORTTESTING1TABLE1_LIST",
        breadcrumb: "EXPORTTESTING1TABLE1_LIST",
        roles : [					"all"
				]
     }
},
{
     path: 'exporttesting1table1detail',
     component: Exporttesting1table1DetailComponent,
     canDeactivate: [ CanDeactivateGuard ],
     data: {
     	label: "EXPORTTESTING1TABLE1_DETAIL",
        breadcrumb: "EXPORTTESTING1TABLE1_DETAIL",
        roles : [					"all"
				]
     }
}
];

@NgModule({
  imports: [ RouterModule.forChild(routes) ],
  exports: [ RouterModule ]
})
export class Exporttesting1table1BaseRoutingModule
{
}
