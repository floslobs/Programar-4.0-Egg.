
var max;
var min;
var promedio;
var numero;
var total = 0;
var contador = 0;

do {
  numero = parseInt(prompt("Ingresa un número"));
  if (contador === 0) {
    max = numero;
    min = numero;
  }
  if (numero > max) {
    max = numero;
  }
  if (numero < min & numero !== 0) {
    min = numero;
  }
  total += numero;
  contador++;
} while (numero !== 0);

promedio = total / contador;
console.log(`El mayor número ingresado fue: ${max}`);
console.log(`El mayor menor ingresado fue: ${min}`);
console.log(`El promedio de los números ingresados es: ${promedio}`);