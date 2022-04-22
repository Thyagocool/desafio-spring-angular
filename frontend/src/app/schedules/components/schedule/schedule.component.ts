import { SchedulesService } from './../../services/schedules.service';
import { Component, OnInit } from '@angular/core';

import { Schedule } from '../../model/schedule';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-schedule',
  templateUrl: './schedule.component.html',
  styleUrls: ['./schedule.component.scss']
})

export class ScheduleComponent implements OnInit {

  schedule: Observable <Schedule[]>;

  displayedColumns = ['id', 'date', 'schedules', 'description', 'students_id', 'students_name', 'teacher_id', 'teacher_name'];

  constructor(private schedulesService: SchedulesService) {
    this.schedule = this.schedulesService.findAll();
   }


  ngOnInit(): void {
  }

}
