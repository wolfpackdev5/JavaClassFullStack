import { Component } from '@angular/core';
import { FahrenheitPipe } from './app.fahrenheitPipe';
import { PhoneNumber } from './app.phoneNumber';
@Component({
    selector: 'app-root',
    template: `<p>{{phone | phoneNumber }}</p>`,
})
export class AppComponent {

  phone: number;
  constructor() {
    this.phone = 6049222222;
  }
    
}