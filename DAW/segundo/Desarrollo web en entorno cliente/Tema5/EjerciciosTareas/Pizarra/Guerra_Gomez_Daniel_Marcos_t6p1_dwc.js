// Obtener el elemento del tablero de dibujo
const zonadibujo = document.getElementById("zonadibujo");

// Crear el tablero de 30x30 celdas
const tablero = document.createElement("table");
tablero.classList.add("tablerodibujo");
zonadibujo.appendChild(tablero);

for (let i = 0; i < 30; i++) {
    const fila = document.createElement("tr");
    tablero.appendChild(fila);
  for (let j = 0; j < 30; j++) {
    const columna = document.createElement("td");
    columna.classList.add("celda");
    fila.appendChild(columna);
  }
}

// Obtener los elementos de la paleta de colores
const colores = document.querySelectorAll("#paleta td");

// Color activo inicial
let colorActivo = "white"; // Color blanco (borrador)

// Asignar eventos a los colores de la paleta
colores.forEach((color) => {
  color.addEventListener("click", () => {
    colorActivo = color.style.backgroundColor;
    colores.forEach((c) => c.classList.remove("seleccionado"));
    color.classList.add("seleccionado");
    mostrarMensajePincel(true);
  });
});

// Función para pintar una celda
function pintarCelda(event) {
  if (event.buttons === 1) {
    event.target.style.backgroundColor = colorActivo;
  }
}

// Asignar eventos a las celdas del tablero
const celdas = document.querySelectorAll(".celda");
celdas.forEach((celda) => {
  celda.addEventListener("mousemove", pintarCelda);
  celda.addEventListener("mousedown", pintarCelda);
  celda.addEventListener("mouseup", () => mostrarMensajePincel(false));
});

// Función para mostrar el mensaje del pincel
function mostrarMensajePincel(activado) {
  const pincel = document.getElementById("pincel");
  pincel.textContent = activado ? "PINCEL ACTIVADO" : "PINCEL DESACTIVADO";
}

// Mostrar mensaje inicial
mostrarMensajePincel(false);