import { BrowserModule } from '@angular/platform-browser'; 
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { PageAComponent } from './app.page-a';
import { PageBComponent } from './app.page-b';
import { routing } from './app.routing';
import { PageDefault } from './app.pagedefault';

@NgModule({
  declarations: [
    AppComponent,
    PageAComponent,
    PageBComponent,
    PageDefault
    
], 
imports: [
BrowserModule,
FormsModule, 
 routing
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }