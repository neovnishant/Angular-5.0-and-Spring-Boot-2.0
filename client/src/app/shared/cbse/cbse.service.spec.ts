import { TestBed, inject } from '@angular/core/testing';

import { CbseService } from './cbse.service';

describe('CbseService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CbseService]
    });
  });

  it('should be created', inject([CbseService], (service: CbseService) => {
    expect(service).toBeTruthy();
  }));
});
