//Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor, 
//Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario 
//y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
//numero de páginas.

var libro = {

      ISBN : prompt("ingrese ISBN"),
      Titulo : prompt("ingrese titulo"),
      Autor : prompt("ingrese Autor"),
      Npaginas : prompt("ingrese numero de paginas"),

};
console.log(libro);