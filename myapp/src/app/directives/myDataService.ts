import { Component } from "@angular/core";

export class MyDataService {
    myname: string;

    constructor() {
        this.myname = "Devin";
    }

    getmyNames() {
        return this.myname;
    }

}