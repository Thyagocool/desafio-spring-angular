import { TeachersService } from './../../services/teachers.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Teacher } from '../../model/teacher';

@Component({
  selector: 'app-teacher',
  templateUrl: './teacher.component.html',
  styleUrls: ['./teacher.component.scss']
})
export class TeacherComponent implements OnInit {

  teacher: Observable <Teacher[]>;

  isShown: boolean = false;

  displayedColumns = ['id', 'name'];

  constructor(private teachersService: TeachersService) {
    this.teacher = this.teachersService.findAll();
   }

  ngOnInit(): void {
  }

  onSubmit(data){
    console.log(data);
    this.teachersService.create(data).subscribe(
      success => console.log('sucesso'),
      error => console.error(error),
      () =>console.log('request finalizado')
    );
    console.log(data);
  }

}
