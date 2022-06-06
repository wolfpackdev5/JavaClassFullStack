import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NewDirective } from './directives/newDirective';
import { ThirdDirective } from './directives/thirdDirective';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FahrenheitPipe } from './app.fahrenheitPipe';
import { PhoneNumber } from './app.phoneNumber';

@NgModule({
  declarations: [
    AppComponent,
    NewDirective,
    ThirdDirective,
    FahrenheitPipe,
    PhoneNumber
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
