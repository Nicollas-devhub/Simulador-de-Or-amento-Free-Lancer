let total = 0;
let listaServicos = [];

function adicionarServico(valor, nome) {
    total += valor;

    listaServicos.push(nome);

    atualizarTela();
}

function atualizarTela() {
    document.getElementById("total").innerText = total;

    const lista = document.getElementById("lista");
    lista.innerHTML = "";

    for (let i = 0; i < listaServicos.length; i++) {
        let li = document.createElement("li");
        li.innerText = listaServicos[i];
        lista.appendChild(li);
    }
}

function limpar() {
    total = 0;
    listaServicos = [];
    atualizarTela();
}
