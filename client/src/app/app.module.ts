import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { CarService } from './shared/car/car.service';
import { CbseService } from './shared/cbse/cbse.service';
import { AppComponent } from './app.component';
import { CarListComponent } from './car-list/car-list.component';
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule, MatTableModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { GiphyService } from './shared/giphy/giphy.service';
import { CarEditComponent } from './car-edit/car-edit.component';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { CbseResultComponent } from './cbse-result/cbse-result.component';

const appRoutes: Routes = [
  { 
    path: '', 
    redirectTo: '/car-list', 
    pathMatch: 'full' 
  },
  {
    path: 'car-list',
    component: CarListComponent
  },
  {
    path: 'car-add',
    component: CarEditComponent
  },
  {
    path: 'car-edit/:id',
    component: CarEditComponent
  },
  {
    path: 'cbse-result',
    component: CbseResultComponent
  }
];


@NgModule({
  declarations: [
    AppComponent,
    CarListComponent,
    CarEditComponent,
    CbseResultComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatTableModule,
    MatListModule,
    MatToolbarModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [CarService, GiphyService, CbseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
