import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'schedule' },

  { path: 'schedule', outlet: 'dialog', loadChildren: () => import('./schedules/schedules.module').then(m => m.SchedulesModule) },



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
