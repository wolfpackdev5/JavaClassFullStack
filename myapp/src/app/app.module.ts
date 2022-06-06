import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NewDirective } from './newDirective';
import { ThirdDirective } from './thirdDirective';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,
    NewDirective,
    ThirdDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
