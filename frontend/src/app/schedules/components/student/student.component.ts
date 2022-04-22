import { StudentsService } from './../../services/students.service';
import { Component, OnInit } from '@angular/core';

import { Student } from '../../model/student';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.scss']
})

export class StudentComponent implements OnInit {

  student: Observable <Student[]>;

  displayedColumns = ['id', 'login', 'name'];

  constructor(private studentsService: StudentsService) {
    this.student = this.studentsService.findAll();
   }

  ngOnInit(): void {

  }

}
