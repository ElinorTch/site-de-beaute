import { Component } from '@angular/core';
import { panier } from '../models/panier';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {
  table : any[] = panier;
  nombreArticle = this.table.length;
  montantTotal : number = 0;

  ngOnInit() {
    this.getTotalAmount();
  }

  getTotalAmount() {
    for (let i = 0; i < panier.length; i++) {
      this.montantTotal = this.montantTotal + this.table[i].prix;
    }
    this.nombreArticle = panier.length;
  }

  removeProduct(produit : any) {
  }
}
