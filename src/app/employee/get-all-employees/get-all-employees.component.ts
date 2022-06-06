import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/pojo/employee';
import { EmployeeCRUDSService } from 'src/app/Services/employee-cruds.service';

@Component({
  selector: 'app-get-all-employees',
  templateUrl: './get-all-employees.component.html',
  styleUrls: ['./get-all-employees.component.css']
})
export class GetAllEmployeesComponent implements OnInit {

  allEmployees : Employee[]= [];
  constructor(private employeeCRUDService : EmployeeCRUDSService, private router : Router) { }

  ngOnInit(): void {
    this.reloadData();
  }
  getdetails(employeeId:number){
    console.log(employeeId);
    this.router.navigate(['employeedetails',employeeId])
  }
  updatedetails(employeeId: number){
    this.router.navigate(['updatedetails',employeeId]);

  }
reloadData(){
  this.employeeCRUDService.getAllEmployee().subscribe(
    data =>
    {
      this.allEmployees= data;
      console.log(this.allEmployees);

    }
  );
}
deleteEmployee(employeeId:number){
  this.employeeCRUDService.deleteEmployee(employeeId).subscribe(
    data =>
    {
      console.log(data);
      this.reloadData();
    }
  );
  
}
}
