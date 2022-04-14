import { Component, OnInit } from '@angular/core';

import { Schedule } from './../model/schedule';

@Component({
  selector: 'app-listschedules',
  templateUrl: './listschedules.component.html',
  styleUrls: ['./listschedules.component.scss']
})
export class ListschedulesComponent implements OnInit {

  schedules:Schedule[] = [
    { _id: "1", name: "HTML 1", teacher: "THYAGO OLIVEIRA"},
    { _id: "2", name: "HTML 2", teacher: "THYAGO OLIVEIRA"},
  ];
  displayedColumns = ['name', 'teacher']

  constructor() {}

  ngOnInit(): void {
  }

}
