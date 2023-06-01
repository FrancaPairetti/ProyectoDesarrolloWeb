import { Component } from '@angular/core';
import { UsuariosService } from './service/usuarios.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor (private servicioUsuario:UsuariosService){

  };

  title = 'mi primera app 2023';
  edad =10;

 // nombres = ["Franca" , "julieta" , "agostina"];
 nombres=[];

  public aumentarEdad(){
    this.servicioUsuario.getDatos().subscribe(
      (rta) =>{
        ///console.log(data);
        this.nombres = rta['data'];
      },
      (error)=>{

      }
    );
    this.edad++;
  };

  public diminuirEdad(){
    this.edad--;
  }
}
