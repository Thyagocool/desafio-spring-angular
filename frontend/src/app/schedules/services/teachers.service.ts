import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { take, tap } from 'rxjs/operators';

import { Teacher } from '../model/teacher';

@Injectable({
  providedIn: 'root'
})
export class TeachersService {

  private readonly API:string = 'http://localhost:8080/teachers';

  constructor(private httpClient: HttpClient) { }

  findAll(){
    return this.httpClient.get<Teacher[]>(this.API)
    .pipe(
      tap(teachers => console.log(teachers))
    );
  }

  create(teacher){

    return this.httpClient.post(this.API, teacher)
    .pipe(
      take(1),
      tap(teachers => console.log(teachers))
    )
  }


}
