import { Pipe,PipeTransform } from "@angular/core";

@Pipe({ name: 'phoneNumber'})

export class PhoneNumber implements PipeTransform { transform(phone: number): string {
    let phoneNumber = phone.toString();
    let output = "(" + phoneNumber.charAt(0) + phoneNumber.charAt(1) + phoneNumber.charAt(2) + ") " 
                + phoneNumber.charAt(3) + phoneNumber.charAt(4) + phoneNumber.charAt(5) + "-" + 
                phoneNumber.charAt(6) + phoneNumber.charAt(7) + phoneNumber.charAt(8) + phoneNumber.charAt(9);
    return output;
}

}