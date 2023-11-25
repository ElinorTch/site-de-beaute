import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ServiceAppService {

  rootURL = `${environment.api}service`;

  constructor(
    private http: HttpClient
  ) { }

  getAllService() {
    return this.http.get(`${this.rootURL}/list`);
  }
}
