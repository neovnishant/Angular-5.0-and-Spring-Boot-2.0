import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Result } from '../../models/result.model';

@Injectable()
export class CbseService {

  public API = '//localhost:8080';
  public CBSE_API = this.API + '/cbse-result';

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Result[]> {
    return this.http.get<Result[]>(this.CBSE_API);
  }

}
