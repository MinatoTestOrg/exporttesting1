import { Component, OnInit,inject } from '@angular/core';
import { Exporttesting1table1ListBaseComponent } from '@baseapp/exporttesting1table1/exporttesting1table1/exporttesting1table1-list/exporttesting1table1-list.base.component';
import { Exporttesting1table1Service } from '@baseapp/exporttesting1table1/exporttesting1table1/exporttesting1table1.service';


@Component({
  selector: 'app-exporttesting1table1-list',
  templateUrl: '../../../../../base/app/exporttesting1table1/exporttesting1table1/exporttesting1table1-list/exporttesting1table1-list.component.html',
  styleUrls: ['./exporttesting1table1-list.scss']
})
export class Exporttesting1table1ListComponent extends Exporttesting1table1ListBaseComponent implements OnInit {
 
	
  ngAfterViewInit(): void {
    this.onAfterViewInit()
  }

  ngOnInit(): void {
    super.onInit();
  }
 
}