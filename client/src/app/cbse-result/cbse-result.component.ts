import { Component, OnInit } from '@angular/core';
import { CbseService } from '../shared/cbse/cbse.service';
import { Observable } from 'rxjs/Observable';
import { DataSource } from '@angular/cdk/collections';
import { Result } from '../models/result.model';


@Component({
  selector: 'app-cbse-result',
  templateUrl: './cbse-result.component.html',
  styleUrls: ['./cbse-result.component.css']
})
export class CbseResultComponent implements OnInit {
  
  dataSource = new ResultDataSource(this.cbseService);
  displayedColumns = ['region','total_appeared','total_passed','total_failed','percent_appeared','percent_passed','percent_failed'];

  constructor(private cbseService: CbseService) { }

  ngOnInit() {
    
    }

}

export class ResultDataSource extends DataSource<any> {

  constructor(private cbseService: CbseService) { 
    super();
  }
  connect(): Observable<Result[]> {
    return this.cbseService.getAll();
  }

  disconnect() {}

}
