import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from "@angular/router";

import { AppComponent } from './app.component';

import { PaginaPrincipalComponent } from './componentes/pagina-principal/pagina-principal.component';
import { LoginComponent } from './componentes/login/login.component';
import { ProductosComponent } from './componentes/productos/productos.component';
import { UsuarioComponent } from './componentes/usuario/usuario.component';
import { FacCompraComponent } from './componentes/fac-compra/fac-compra.component';
import { HeaderComponent } from './componentes/header/header.component';

import { RUTAS } from "./app.routes";
import { AdminComponent } from './componentes/admin/admin.component';
import { BuyComponent } from './componentes/buy/buy.component';
import { RegistrerUserComponent } from './componentes/registrer-user/registrer-user.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PaginaPrincipalComponent,
    LoginComponent,
    ProductosComponent,
    UsuarioComponent,
    FacCompraComponent,
    AdminComponent,
    BuyComponent,
    RegistrerUserComponent
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(RUTAS, {useHash: true})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
