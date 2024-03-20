import { Component, OnInit,inject } from '@angular/core';
import { Exporttesting1table1DetailBaseComponent } from '@baseapp/exporttesting1table1/exporttesting1table1/exporttesting1table1-detail/exporttesting1table1-detail.base.component';
import { Exporttesting1table1Service } from '@baseapp/exporttesting1table1/exporttesting1table1/exporttesting1table1.service';


@Component({
  selector: 'app-exporttesting1table1-detail',
  templateUrl: '../../../../../base/app/exporttesting1table1/exporttesting1table1/exporttesting1table1-detail/exporttesting1table1-detail.component.html',
  styleUrls: ['./exporttesting1table1-detail.scss']
})
export class Exporttesting1table1DetailComponent extends Exporttesting1table1DetailBaseComponent implements OnInit {
 
	
  ngAfterViewInit(): void {
    this.onAfterViewInit()
  }

  ngOnInit(): void {
    super.onInit();
  }
 
}