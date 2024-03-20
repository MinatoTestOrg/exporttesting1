import { NgModule } from '@angular/core';
import { BsModalService } from 'ngx-bootstrap/modal';
import { SharedModule } from '@app/shared/shared.module';
import { WidgetsBaseModule } from '@libbase/widgets.base.module';
import { ExportsModule } from '@app/exports/exports.module';
import { Exporttesting1table1ListComponent } from '@app/exporttesting1table1/exporttesting1table1/exporttesting1table1-list/exporttesting1table1-list.component';
import { Exporttesting1table1DetailComponent } from '@app/exporttesting1table1/exporttesting1table1/exporttesting1table1-detail/exporttesting1table1-detail.component';
import { CanDeactivateGuard } from '@baseapp/auth.can-deactivate-guard.service';

@NgModule({
  declarations: [
    Exporttesting1table1ListComponent,
    Exporttesting1table1DetailComponent
  ],
  imports: [
    SharedModule,
    WidgetsBaseModule,
    ExportsModule,
  ],
  exports: [
    SharedModule,
	WidgetsBaseModule,
    Exporttesting1table1ListComponent,
    Exporttesting1table1DetailComponent
  ],
  providers: [
  	BsModalService,
	CanDeactivateGuard
  ],
  
})
export class Exporttesting1table1BaseModule { }