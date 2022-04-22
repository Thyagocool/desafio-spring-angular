import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { tap } from 'rxjs/operators';

import { Schedule } from './../model/schedule';

@Injectable({
  providedIn: 'root'
})
export class SchedulesService {

  private readonly API:string = 'http://localhost:8080/schedules';

  constructor(private httpClient: HttpClient) { }

  findAll(){
    return this.httpClient.get<Schedule[]>(this.API)
    .pipe(
      tap(schedule => console.log(schedule))
    );
  }
}
