import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home/home.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { MatTableModule } from '@angular/material/table';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSelectModule } from '@angular/material/select';

import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatSidenavModule } from '@angular/material/sidenav';
import { PopupCardComponent } from './pages/popUp/popup-card/popup-card.component';

@NgModule({
  declarations: [AppComponent, HomeComponent, PopupCardComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    MatTableModule,
    BrowserAnimationsModule,
    MatSelectModule,
    MatInputModule,
    MatFormFieldModule,
    FormsModule,
    MatButtonModule,
    MatCardModule,
    MatSidenavModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
