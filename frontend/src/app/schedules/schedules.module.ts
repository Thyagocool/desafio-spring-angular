import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { ListschedulesComponent } from './listschedules/listschedules.component';
import { SchedulesRoutingModule } from './schedules-routing.module';
import { SchedulesComponent } from './schedules/schedules.component';



@NgModule({
  declarations: [SchedulesComponent, ListschedulesComponent],
  imports: [
    CommonModule,
    SchedulesRoutingModule,
    AppMaterialModule
  ]
})
export class SchedulesModule { }
