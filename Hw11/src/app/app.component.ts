import { Component } from '@angular/core';
@Component({
selector: 'app-root',
template: `<p [ngStyle]="myStyle">style binding example</p>`,
})
export class AppComponent {
myStyle = {
'font-weight':'bold',
'color':'blue'
}
}