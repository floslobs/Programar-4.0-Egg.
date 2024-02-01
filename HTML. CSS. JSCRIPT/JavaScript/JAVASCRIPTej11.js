let palabras = prompt("Ingresa una frase");

let separadas = palabras.split(" ");
let palabraLarga = "";
for (let i = 0; i < separadas.length; i++) {
  if (separadas[i].length > palabraLarga.length) {
    palabraLarga = separadas[i];
  }
}

console.log(`La palabra más larga es "${palabraLarga}" con ${palabraLarga.length} caracteres`)