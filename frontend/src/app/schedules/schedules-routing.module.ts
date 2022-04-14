import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ListschedulesComponent } from './listschedules/listschedules.component';
import { SchedulesComponent } from './schedules/schedules.component';


const routes: Routes = [
  { path: '', component: SchedulesComponent }
  ,
  { path: 'listschedules', component: ListschedulesComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SchedulesRoutingModule { }
