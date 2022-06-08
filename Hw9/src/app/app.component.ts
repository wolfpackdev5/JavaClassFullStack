import { Component } from '@angular/core';



@Component({
  selector: 'app-root',
  template: `<section>
  <form #myForm="ngForm">
    Name:
  <input type="text" pattern="[a-zA-Z]*" minlength="3" required
  [(ngModel)]="myName" name="firstName" #firstName="ngModel">
  <div [hidden]="firstName.valid || firstName.pristine">This control is invalid.</div>
  <p *ngIf="firstName?.errors?.['required']">.This field is required.</p>
  <p *ngIf="firstName?.errors?.['pattern']">Only alphabetical characters are allowed.</p>
  <p *ngIf="firstName?.errors?.['minlength']"> this entry must have at least three characters.</p>
  <button type="submit" class="btn btn-default" [disabled]="!myForm.form.valid" (click)="onSubmit()">Submit</button>

  LastName:
  <input type="text" pattern="[a-zA-Z]*" minlength="3" required 
  [(ngModel)]="lastName" name="lastName" #lastName="ngModel">
  <div [hidden]="lastName.valid || lastName.pristine">This control is invalid.</div>
  <p *ngIf="lastName?.errors?.['required']">.This field is required.</p>
  <p *ngIf="lastName?.errors?.['pattern']">Only alphabetical characters are allowed.</p>
  <p *ngIf="lastName?.errors?.['minlength']"> this entry must have at least three characters.</p>
  <button type="submit" class="btn btn-default" [disabled]="!myForm.form.valid" (click)="onSubmit()">Submit</button>
</form>
</section>`,
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = "Hw9";

  myName: string;
  lastName: string;

  constructor() {
    this.myName = "";
    this.lastName! = "";
  }

  onSubmit() {
    alert(this.myName);
    alert(this.lastName);
  }

}
