import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CbseResultComponent } from './cbse-result.component';

describe('CbseResultComponent', () => {
  let component: CbseResultComponent;
  let fixture: ComponentFixture<CbseResultComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CbseResultComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CbseResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
