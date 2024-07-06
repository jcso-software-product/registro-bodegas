import { Component, OnInit } from '@angular/core';
import { Registro } from './registro';
import { RegistroService } from './registro.service';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  registros: Registro[] = []; 

  constructor(private registroService: RegistroService) { }

  ngOnInit(): void {
    this.registroService.getRegistros().subscribe(
      registros => this.registros = registros
    ); 
  }

}
