const botaoAbrirJanelaCadastro = document.getElementById("botaoCriar");
const botaoAtualizarCard = document.getElementById("botaoAtualizar");
const botaoExcluirCard = document.getElementById("botaoExcluir");
const botaoFecharJanelaCadastro = document.getElementById("botaoFecharJanelaModal");
const modalContainerCadastro = document.getElementById("modal_container_cadastro");

let listaCards = [];
const regexPrioridade = /[^1-5]/;
let hoje = new Date();

botaoAbrirJanelaCadastro.addEventListener('click', () => {
    modalContainerCadastro.classList.add('show');
})

botaoFecharJanelaCadastro.addEventListener('click', () => {
    cadastroCard();
    resetarFormulario();
    modalContainerCadastro.classList.remove('show');
})

/*botaoExcluirCard.addEventListener('click', () => {
    //card.removerCard();
})*/

function resetarFormulario(){
    document.getElementById("formularioCadastro").reset();
}

function cadastroCard(){
    let nome = document.getElementById("nomeCard").value;
    let descricao = document.getElementById("descricaoCard").value;
    let categoria = document.getElementById("categoriaCard").value;
    let prioridade = document.getElementById("prioridade").value;
    if(regexPrioridade.test(prioridade)){
        //corrigir depois - manter na tela de cadastro para não perder dados
        alert("Prioridade inválida!");
    }
    let status = document.getElementById("status").value;
    if(status === "status"){
        alert("Status inválido!");
    }
    let dataTermino = document.getElementById("dataTermino").value;

    let validacaoDataTermino = dataTermino.split(/-/g);

    if(hoje.getFullYear() < validacaoDataTermino[0]){
        alert("Data inválida!");
    }
    else if(hoje.getMonth() < validacaoDataTermino[1]){
        alert("Data inválida!");
    }
    else if(hoje.getDay() < validacaoDataTermino[2]){
        alert("Data inválida!");
    }

    let card = new Card(nome, descricao, categoria, status, prioridade, dataTermino);
    listaCards.push(card);
    console.log(card);
    console.log(listaCards.length);
}

class Card{
    constructor(nome, descricao, categoria, status, prioridade, dataTermino) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.status = status;
        this.prioridade = prioridade;
        this.dataTermino = dataTermino;
    }

    removerCard(card){
        let i = listaCards.findIndex(card.nome);
        listaCards.splice(i, 1);
    }

    atualizarCard(){

    }
}