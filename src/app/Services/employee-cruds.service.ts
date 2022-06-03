import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../pojo/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeCRUDSService {

   baseURL: string="http://localhost:8080/employeecrud/employee"

  constructor(private http: HttpClient) { }

  addEmployee(employee : Employee) : Observable<boolean>{
    console.log("in EmployeeCRUD service");
    console.log(employee);
    return this.http.post<boolean>(this.baseURL,employee);
   
   
    // console.log("EmployeeCRUDService end");

  }
}
