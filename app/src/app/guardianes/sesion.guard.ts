import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { SesionService } from "../servicios/sesion.service";

@Injectable({
  providedIn: 'root'
})
export class SesionGuard implements CanActivate {
  
  constructor(private sesionService:SesionService){

  }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    
    if(this.sesionService.autorizado==false){
      return false;
    }
    
    return true;
  }
  
}
