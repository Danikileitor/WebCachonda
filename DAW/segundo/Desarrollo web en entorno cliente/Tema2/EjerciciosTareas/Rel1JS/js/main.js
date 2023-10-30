function mostrar(id) {
    document.getElementById(id).style.display == "" || document.getElementById(id).style.display == "none" ? document.getElementById(id).style.display = "flex" : document.getElementById(id).style.display = "none";
}

function corregir(id) {
    if (document.getElementById(id+'mal').style.display == "" || document.getElementById(id+'mal').style.display == "none") {
        document.getElementById(id+'mal').style.display = "flex";
        document.getElementById(id+'bien').style.display = "none";
    } else {
        document.getElementById(id+'mal').style.display = "none";
        document.getElementById(id+'bien').style.display = "flex";
    }
}