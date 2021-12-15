function calculaIdade() {

    let data = new Date()
    let ano = data.getFullYear()
    let dataNasc = document.getElementById('calendario').value
    let dataFormat = `${dataNasc[0]}${dataNasc[1]}${dataNasc[2]}${dataNasc[3]}`
    let calcIdade = ano - dataFormat
    let resposta = document.getElementById('resposta')

    if(calcIdade >= 18) {
        resposta.innerHTML = `<p>${calcIdade} anos</p>`
        resultado.innerHTML = `<p>Voce e maior de idade</p>` 
    } else if (calcIdade < 18 && calcIdade > 14 ) {
        resposta.innerHTML = `<p>${calcIdade} anos</p>`
        resultado.innerHTML = `<p>Voce e um adolescente</p>`
    }else if (calcIdade < 14 ) {
        resposta.innerHTML = `<p>${calcIdade} anos</p>`
        resultado.innerHTML = `<p>Voce e uma criança</p>`
    }else {
        resposta.innerHTML = ``
        resultado.innerHTML = `<p>Selecione uma data</p>`
    }
}