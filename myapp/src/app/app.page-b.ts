import { Component, OnInit } from "@angular/core";
import { ActivatedRoute, Params } from "@angular/router";

@Component({
    template: `This is page b. {{retrievedFromStorage}} 
    <input type="text" (ngModelChange)="mychange($event)" [ngModel]="mymodel"><br>
    
    
    <input type="input" (ngModelChange)="mychange2($event)" [ngModel]="mymodel2">`

})

export class PageBComponent {
    retrievedFromStorage: string | null;
    mymodel: string;
    mymodel2: string;

    constructor() {
        if(sessionStorage.getItem("autosave")) {
            this.retrievedFromStorage = sessionStorage.getItem("autosave");
        }
        if(sessionStorage.getItem("autosave2")) {
            this.retrievedFromStorage = sessionStorage.getItem("autosave2");
        }
     }

    mychange(val:string) {
        
        sessionStorage.setItem("autosave", val);
        console.log(val); // updated value 

    }
    mychange2(val2: string) { 
        sessionStorage.setItem("autosave2", val2); 
        console.log(val2); // updated value
    }
}

