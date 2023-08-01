import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DepartmentService {

  constructor(
    private http:HttpClient,
  ) { }

  public departmentData(){
    return this.http.get(`http://localhost:8080/department/all`);
  }

}
