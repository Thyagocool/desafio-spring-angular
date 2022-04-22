import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ScheduleComponent } from './components/schedule/schedule.component';
import { StudentComponent } from './components/student/student.component';
import { TeacherComponent } from './components/teacher/teacher.component';



const routes: Routes = [
  {path: "", component: ScheduleComponent},
  {path: "student", component: StudentComponent},
  {path: "teacher", component: TeacherComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SchedulesRoutingModule { }
