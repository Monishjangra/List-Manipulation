import { Component, OnInit } from '@angular/core';
import { DepartmentService } from 'src/app/services/department.service';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  departmentData: any = [];
  employeeData: any = [];

  displayedColumns: string[] = [
    'empId',
    'name',
    'email',
    'location',
    'department',
  ];
  clickedRows = new Set<any>();

  selected = '';
  location = '';
  constructor(
    private department: DepartmentService,
    private employee: EmployeeService
  ) {}
  ngOnInit(): void {
    this.department.departmentData().subscribe({
      next: (value) => {
        this.departmentData = value;
      },
      error: (error) => {
        console.log(error);
      },
    });
    this.employee.employeeList().subscribe({
      next: (value) => {
        this.employeeData = value;
      },
      error: (error) => {
        console.log(error);
      },
    });
  }

  displayBySelect() {
    this.employee.selectedEmployeeList(this.selected).subscribe({
      next: (value) => {
        this.employeeData = value;
      },
      error: (error) => {
        console.log(error);
      },
    });
  }

  displayByLocation() {
    this.employee.selectedLocationList(this.location).subscribe({
      next: (value) => {
        console.log(value);
        this.employeeData = value;
      },
      error: (error) => {
        console.log(error);
      },
    });
  }
}
