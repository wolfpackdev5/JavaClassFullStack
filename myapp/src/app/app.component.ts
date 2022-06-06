import { Component } from '@angular/core';
import { MyDataService } from './myDataService';
import { SecondService } from './secondService';

@Component({
  selector: 'app-root',
  template: `<h1>Hello world! {{title}} </h1>
  <second-directive [firstName]="author"></second-directive>
  <ul>{{myname}}</ul>
  <h3>Today's weather is {{fah}}</h3>`,
  providers: [MyDataService, SecondService]

  
})
export class AppComponent {
  public title = 'This is Angular!';
  public author = "Devin.";
  myname: string;
  fah: number;

  constructor(myDataService: MyDataService, mySecondService: SecondService) {
    this.myname = myDataService.getmyNames();
    this.fah = mySecondService.getWeather();
  }
  
}
