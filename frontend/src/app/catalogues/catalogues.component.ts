import { Component, OnInit } from '@angular/core';
import { ProductService } from '../service/product.service';
import { Form, FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { panier } from '../models/panier';

@Component({
  selector: 'app-catalogues',
  templateUrl: './catalogues.component.html',
  styleUrls: ['./catalogues.component.scss']
})
export class CataloguesComponent implements OnInit{

  products !: any[];
  private productsTempon !: any[];
  productModal !: any;
  productGender : string = "all";
  form !: FormGroup;

  constructor(
    private _product: ProductService,
    private formBuilder: FormBuilder,
  ) {
    this.form = this.formBuilder.group({
      all: new FormControl(''),
      hommes: new FormControl(''),
      femmes: new FormControl(''),
    })
   }

  ngOnInit(): void {
    this.getAllProduct();
  }

  getAllProduct() {
    this._product.getAllProduct().subscribe(
      (data : any) => {
        this.products = data;
        this.productsTempon = data;
        console.log("Tous les produits : " , this.products);
      }
    )
  }

  addProductModal(produit : any) {
    this.productModal = produit;
  }

  addProductToBasket(produit : any) {
    panier.push(produit);
  }

  initProductGender(genre : string) {
    this.productGender = genre

    if (this.productGender == "all") {
      this.products = this.productsTempon;
    }

    else if (this.productGender == "homme") {
      this._product.getMenProduct().subscribe(
        (data) => {
          this.products = data;
        }
      )
    }

    else if (this.productGender == "femme") {
      this._product.getWomenProduct().subscribe(
        (data) => {
          this.products = data;
        }
      )
    }
  }
}
