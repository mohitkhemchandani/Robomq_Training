import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent {
  enteredId = "";
  enteredName = "";
  enteredSalary = "";
  enteredDept = "";

  @Output() empCreated = new EventEmitter();

    onAddEmp() {
      const emp = {
        id: this.enteredId,
        name: this.enteredName,
        salary: this.enteredSalary,
        dept: this.enteredDept
      };
      this.empCreated.emit(emp);
    }
}
