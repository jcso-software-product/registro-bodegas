import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Registro } from './registro';
import { REGISTROS } from './registro.json';

@Injectable({
  providedIn: 'root'
})
export class RegistroService {

  constructor() { }


  getRegistros(): Observable<Registro[]> {
    return of(REGISTROS); 
  }
}
