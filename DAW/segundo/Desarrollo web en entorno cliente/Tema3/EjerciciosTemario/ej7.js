var persona = {
    name: ['Rafa', 'Nadal'],
    age: 30,
    gender: 'masculino',
    interests: ['tenis', 'futbol'],
    bio: function () {
        alert(this.name[0] + ' ' + this.name[1] + ' tiene ' + this.age + ' años y le gusta el ' + this.interests[0] + ' y el ' + this.interests[1] + '.');
    },
    saluda: function () {
        alert('Hola, me llamo ' + this.name[0] + '.');
    }
};
console.log(persona);