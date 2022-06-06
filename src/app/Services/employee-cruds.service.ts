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


  getAllEmployee() : Observable<Employee[]>{
    return this.http.get<Employee[]>(this.baseURL);

  }

  addEmployee(employee : Employee) : Observable<boolean>{
    console.log("in EmployeeCRUD service");
    console.log(employee);
    return this.http.post<boolean>(this.baseURL,employee);

  }
  deleteEmployee(employeeId: number) : Observable<boolean>{
    console.log('In delete' + employeeId);
    return this.http.delete<boolean>(this.baseURL +'/'+ employeeId);
  }
  getSingleEmployee(employeeId: number): Observable<Employee>{
    console.log('in seingle()'+ employeeId);
    return this.http.get<Employee>(this.baseURL +'/' + employeeId);
  }
  updateEmployee(employee: Employee): Observable<boolean>{
    return this.http.put<boolean>(this.baseURL,employee);
  }

}

