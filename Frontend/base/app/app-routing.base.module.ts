import {Routes } from '@angular/router';
import { AppLayoutComponent } from '@app/app-layout/app-layout.component';
import { AppHomePageComponent } from '@app/app-home-page/app-home-page.component';
import { AuthenticationResolver } from '@app/auth/authentication.resolver';
import { LoginDetailComponent } from '@app/auth/login/login.component';

export const routes: Routes = [ 
  {
     path: '',
     redirectTo: "/home",
     pathMatch: 'full'
  }, 

    {
    path: '',
    component: AppLayoutComponent,
    resolve:{authResolver:AuthenticationResolver},
    children: [
    {
    	path:'exports',
        loadChildren:() =>import('@app/exports/exports.module').then(m=>m.ExportsModule)
    },
    {
    path: 'home',
    component: AppHomePageComponent,
    },
      {
        path: 'applicationuser',
        loadChildren: () => import('@app/application-user/application-user.module').then(m => m.ApplicationUserModule)
      },
      {
        path: 'exporttesting1table1',
        loadChildren: () => import('@app/exporttesting1table1/exporttesting1table1.module').then(m => m.Exporttesting1table1Module)
      }
   	]
  }
];