var num2 = prompt("ingrese un valor limite");
let suma = 0;



while(suma < parseInt(num2)){
    let num = prompt("ingrese numero");
    suma = (suma + parseInt(num));

};
if(suma> num2){
console.log("exedio el limite de------------"+num2)
}

console.log("la suma de los numeros es : "+suma);