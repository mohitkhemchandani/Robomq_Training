import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';

@Component({
 selector: 'app-add',
 templateUrl: './add-user.component.html',
 styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {
 addForm: FormGroup;
 submitted = false;
 invalidAdd = false;
 username = '[a-zA-Z ]*';
 mobnumPattern = '^((\\+91-?)|0)?[0-9]{10}$';
 emailPattern = '^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$';
 pwdpattern = '(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}$';
 constructor(private formBuilder: FormBuilder) { }

 onSubmit() {
 this.submitted = true;

 if (this.addForm.invalid) {
 window.alert('Form invalid');
 return;
 }
 else {
 this.invalidAdd = true;
 window.alert('Registered');
 }
 }
 ngOnInit() {
 this.addForm = this.formBuilder.group({
 id : ['', Validators.required],
 name: ['', [Validators.required, Validators.pattern]],
 email: ['', [Validators.required, Validators.pattern]],
 password : ['', [Validators.required, Validators.pattern]],
 mobile : ['', [Validators.pattern, Validators.required]]
 });
 }

}
