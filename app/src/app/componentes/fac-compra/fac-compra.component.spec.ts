import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FacCompraComponent } from './fac-compra.component';

describe('FacCompraComponent', () => {
  let component: FacCompraComponent;
  let fixture: ComponentFixture<FacCompraComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FacCompraComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FacCompraComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
