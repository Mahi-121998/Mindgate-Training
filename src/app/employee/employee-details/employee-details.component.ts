import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from 'src/app/pojo/employee';
import { EmployeeCRUDSService } from 'src/app/Services/employee-cruds.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {
employee: Employee=new Employee();
employeeId : number=0;

  constructor(private employeeCRUDService:EmployeeCRUDSService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.employeeId=this.route.snapshot.params['employeeId'];

    this.loadEmployeeDetails(this.employeeId);

  }
  loadEmployeeDetails(employeeId: number){
    this.employeeCRUDService.getSingleEmployee(employeeId).subscribe(
      data =>
      {
        this.employee= data;
      }
    );

  }

}
