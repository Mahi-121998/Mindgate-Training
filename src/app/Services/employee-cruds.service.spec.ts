import { TestBed } from '@angular/core/testing';

import { EmployeeCRUDSService } from './employee-cruds.service';

describe('EmployeeCRUDSService', () => {
  let service: EmployeeCRUDSService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmployeeCRUDSService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
