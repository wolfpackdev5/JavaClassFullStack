import { Component } from "@angular/core";

export class SecondService {
    celsius: number;
    fah: number;

    constructor() {
        this.celsius = 6;
        this.fah = (this.celsius * (9/5)) + 32;
    }

    getWeather() {
        return this.fah;
    }
}