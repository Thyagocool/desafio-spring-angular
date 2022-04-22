import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Student } from '../model/student';

import { tap } from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})
export class StudentsService {

  private readonly API:string = 'http://localhost:8080/students';

  constructor(private httpClient: HttpClient) { }

  findAll(){
    return this.httpClient.get<Student[]>(this.API)
    .pipe(
      tap(students => console.log(students))
    );
  }
}
