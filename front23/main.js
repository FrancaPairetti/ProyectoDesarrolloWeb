//definir una variable
var texto = "un texto";
var numero = 10;
var verdadero = true;
var cualquiera = "cualquier valor";
verdadero = false;
//constate
var nombre = "franca";
console.log("20.26 hola");
var personas = ["franca", "julieta", "agostina"];
console.log(personas);
var div_personas = document.querySelector("#personas");
div_personas.innerHTML = "<ul>" +
    personas.map(function (persona) {
        return "<li>" + persona + " </li>";
    }).join("") +
    "</ul>";
