import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SesionService {

  autorizado:boolean = false;

  constructor() {
    
    let sesion = sessionStorage.getItem("autorizado");
    if (sesion!=null) {
      let respuesta = JSON.parse(sesion);
      if (respuesta.autorizado==true) {
        this.autorizado = true;
      } else {
        this.autorizado = false;
      }
    }else{
      this.autorizado = false;
    }

  }
}
