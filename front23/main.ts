//definir una variable
let texto:string = "un texto";
let numero:number =10;
let verdadero:boolean = true;
let cualquiera:any ="cualquier valor";

verdadero = false;


//constate
const nombre:string = "franca";
console.log("20.26 hola");


let personas:string[] =  ["franca" , "julieta" , "agostina"];
console.log(personas);

let div_personas:HTMLElement = document.querySelector("#personas");
div_personas.innerHTML = "<ul>" +
                            personas.map((persona:string)=> {

                                return "<li>" + persona +" </li>";

                            }).join("") +
                         "</ul>";
