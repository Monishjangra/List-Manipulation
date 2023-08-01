import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  constructor(private http: HttpClient) {}

  public employeeList() {
    return this.http.get(`http://localhost:8080/employee/list`);
  }

  public selectedEmployeeList(selected: any) {
    return this.http.get(
      `http://localhost:8080/employee/listBySelection/${selected}`
    );
  }

  selectedLocationList(location: string) {
    return this.http.get(
      `http://localhost:8080/employee/listByLocation/${location}`
    );
  }

  public employeeAdd(data: any) {
    return this.http.post(`http://localhost:8080/employee/save`, data);
  }

  public employeeDelete(id: number) {
    return this.http.delete(`http://localhost:8080/employee/delete/${id}`);
  }
}
