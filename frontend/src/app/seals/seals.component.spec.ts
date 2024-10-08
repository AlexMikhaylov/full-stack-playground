import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SealsComponent } from './seals.component';

describe('SealsComponent', () => {
  let component: SealsComponent;
  let fixture: ComponentFixture<SealsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SealsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SealsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
