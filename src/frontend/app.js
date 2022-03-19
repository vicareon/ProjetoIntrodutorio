const botaoCriar = document.getElementById("botaoCriar");
const botaoAtualizar = document.getElementById("botaoAtualizar");
const botaoExcluir = document.getElementById("botaoExcluir");
const botaoFecharJanelaModal = document.getElementById("botaoFecharJanelaModal");
const modalContainerCadastro = document.getElementById("modal_container_cadastro");

let listaCards = [];

botaoCriar.addEventListener('click', () => {
    modalContainerCadastro.classList.add('show');
})

botaoFecharJanelaModal.addEventListener('click', () => {
    modalContainerCadastro.classList.remove('show');
})

function cadastroCard(){
    let card = {
        nome: document.getElementById("nome").value,
        categoria: document.getElementById("categoria").value,
        status: document.getElementById("status"),
        prioridade: document.getSelection(),
    }
    listaCards.push(card);
}

function removerCard(){

}

function atualizarCard(){

}