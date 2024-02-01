var numero1 = prompt("ingrese valor 1");
var numero2 = prompt("ingrese valor 2");
console.log("que desea hacer?");


console.log("Calcular");
console.log("S- Sumar");
console.log("R- Restar");
console.log("D- Dividir");
console.log("M- Multiplicar");
var selUser = prompt("ingrese opcion");
        switch(selUser){
            case 'S':
                console.log("LA SUMA ES " + (parseInt(numero1) + parseInt(numero2)))
                break;
            case'R':
                console.log("LA RESTA ES " + (parseInt(numero1) - parseInt(numero2)))
                break;
            case'D':
                console.log("LA DIVICION ES " + (parseInt(numero1) / parseInt(numero2)))
                break;
            case 'M':
                    console.log("LA MULTIPLICACION ES " + (parseInt(numero1) * parseInt(numero2)))
                    break;

        };
