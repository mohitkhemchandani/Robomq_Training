import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  submitted = false;
  invalidLogin = false;

  constructor(private formbuilder: FormBuilder)
  {
    this.loginForm = this.formbuilder.group({
    email: ['', Validators.required],
    password: ['', Validators.required]
  });
}
  onSubmit() {
    this.submitted = true;
    if (this.loginForm.invalid){
      console.log("form invalid");
      return;

    }
    if (this.loginForm.controls.email.value === 'mk@gmail.com'
    && this.loginForm.controls.password.value === 'password'){
      window.alert("Login Successfull");
      console.log("Login");
    }
    else{
      console.log("Invalid details");
    }
  }
  ngOnInit() {

  }
}
