import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-principal',
  templateUrl: './menu-principal.component.html',
  styleUrls: ['./menu-principal.component.scss']
})
export class MenuPrincipalComponent {

  constructor(
    private router: Router
  ) { }

  goToCatalogue() {
    this.router.navigate(['catalogue'])
  }
}
