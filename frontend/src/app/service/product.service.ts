import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  rootURL = `${environment.api}produit`;

  constructor(
    private http: HttpClient
  ) { }

  getAllProduct() {
    return this.http.get(`${this.rootURL}/list`);
  }

  getMenProduct() {
    return this.http.get<any[]>(`${this.rootURL}/list`)
      .pipe(map((students) => students.filter((etudiant) => etudiant.sexe == "homme")));
  }

  getWomenProduct() {
    return this.http.get<any[]>(`${this.rootURL}/list`)
      .pipe(map((students) => students.filter((etudiant) => etudiant.sexe == "femme")));
  }

}
