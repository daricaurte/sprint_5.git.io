import { Routes } from '@angular/router';
import { PaginaPrincipalComponent } from './componentes/pagina-principal/pagina-principal.component';
import { AdminComponent } from './componentes/admin/admin.component';
import { BuyComponent } from './componentes/buy/buy.component';
import { FacCompraComponent } from './componentes/fac-compra/fac-compra.component';
import { LoginComponent } from './componentes/login/login.component';
import { ProductosComponent } from './componentes/productos/productos.component';
import { RegistrerUserComponent } from './componentes/registrer-user/registrer-user.component';
import { UsuarioComponent } from './componentes/usuario/usuario.component';
import { SesionGuard } from './guardianes/sesion.guard';

export const RUTAS: Routes = [
    { path: 'pagina-principal', component: PaginaPrincipalComponent},
    { path: 'admin', component: AdminComponent},
    { path: 'buy', component: BuyComponent},
    { path: 'fac-compra', component: FacCompraComponent},
    { path: 'login', component: LoginComponent},
    { path: 'productos', component: ProductosComponent},
    { path: 'Registrer-user', component: RegistrerUserComponent},
    { path: 'usuarioComponent', component: UsuarioComponent},
    { path: '**', pathMatch: 'full', redirectTo: 'pagina-principal'},
];