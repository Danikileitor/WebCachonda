// Escribimos el mensaje de ayuda en el <p>
document.querySelectorAll("p:last-of-type")[0].innerHTML = "Haga CLICK en cualquier celda para activar/desactivar el Pincel";

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

// Variable para definir el color activo
let colorActivo = "color1"; // Definimos el amarilo como color inicial ya que es como viene indicado en el html

// Asignar eventos a los colores de la paleta
colores.forEach((color) => {
  if (color.id != "pincel") {
    color.addEventListener("click", () => {
      colores.forEach((c) => c.classList.remove("seleccionado"));
      colorActivo = color.className;
      color.classList.add("seleccionado");
    });
  }
});

// Función para pintar una celda
function pintarCelda(event) {
  if (document.getElementById("pincel").textContent == "PINCEL ACTIVADO") {
    event.target.className = colorActivo;
  }
}

function actualizarPincel() {
  const pincel = document.getElementById("pincel");
  if (pincel.textContent == "PINCEL ACTIVADO") {
    mostrarMensajePincel(false);
  } else {
    mostrarMensajePincel(true)
  }
}

// Asignar eventos a las celdas del tablero
const celdas = document.querySelectorAll(".celda");
celdas.forEach((celda) => {
  celda.addEventListener("click", actualizarPincel);
  celda.addEventListener("mousemove", pintarCelda);
  celda.addEventListener("mousedown", pintarCelda);
  celda.addEventListener("mouseup", pintarCelda);
});

// Función para mostrar el mensaje del pincel
function mostrarMensajePincel(activado) {
  const pincel = document.getElementById("pincel");
  pincel.textContent = activado ? "PINCEL ACTIVADO" : "PINCEL DESACTIVADO";
}

// El estado inicial del pincel será desactivado
mostrarMensajePincel(false);