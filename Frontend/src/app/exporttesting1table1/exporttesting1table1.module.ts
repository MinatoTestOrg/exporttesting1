import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { Exporttesting1table1RoutingModule } from './exporttesting1table1-routing.module';
import { Exporttesting1table1BaseModule } from '@baseapp/exporttesting1table1/exporttesting1table1.base.module';
@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    Exporttesting1table1BaseModule,
    Exporttesting1table1RoutingModule
    
  ],
  exports: [
      Exporttesting1table1BaseModule,
  ]

})
export class Exporttesting1table1Module  { }