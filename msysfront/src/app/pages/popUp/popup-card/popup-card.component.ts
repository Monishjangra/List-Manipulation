import { Component, EventEmitter, Output } from '@angular/core';
import { AddDataService } from 'src/app/services/add-data.service';

@Component({
  selector: 'app-popup-card',
  templateUrl: './popup-card.component.html',
  styleUrls: ['./popup-card.component.css'],
})
export class PopupCardComponent {
  @Output() close = new EventEmitter<void>();
  constructor(private addData: AddDataService) {}

  employee = {
    empId: '',
    name: '',
    email: '',
    location: '',
    department: '',
  };

  formSubmit() {
    console.log(this.employee);
    this.addData.data(this.employee).subscribe({
      next: (value) => {
        console.log(value);
      },
      error: (error) => {
        console.log(error);
      },
    });
  }
  closePopup() {
    this.close.emit();
  }
}
