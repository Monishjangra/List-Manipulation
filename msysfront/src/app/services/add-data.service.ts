import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AddDataService {
  constructor(private http: HttpClient) {}

  public data(data: any) {
    return this.http.post(`http://localhost:8080/employee/save`, data);
  }
}
