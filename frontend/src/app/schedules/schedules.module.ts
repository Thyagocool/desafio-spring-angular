import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { ScheduleComponent } from './components/schedule/schedule.component';
import { StudentComponent } from './components/student/student.component';
import { TeacherComponent } from './components/teacher/teacher.component';
import { SchedulesRoutingModule } from './schedules-routing.module';

@NgModule({
  declarations: [ ScheduleComponent, StudentComponent, TeacherComponent],
  imports: [
    CommonModule,
    SchedulesRoutingModule,
    AppMaterialModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class SchedulesModule { }
