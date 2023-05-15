//Procura e armazena na variável form um elemento HTML 
const form = document.querySelector('form');
//Procura e armazena na variável input um elemento HTML input do tipo texto encontrado na página.
const input = document.querySelector('input[type="text"]');

//Procura e armazena na variável results um elemento HTML com a classe .results encontrado na página.
const results = document.querySelector('.results');

//Adiciona um ouvinte de eventos que será acionado quando o formulário for enviado.
form.addEventListener('submit', (event) => {

// Impede que o formulário seja enviado e a página seja recarregada.
  event.preventDefault();
//Armazena na variável searchTerm o valor inserido no campo de texto.
  const searchTerm = input.value;

//Verifica se o valor inserido não está vazio ou contém apenas espaços em branco.
  if (searchTerm.trim() !== '') {
// Exibe uma mensagem na página, informando que a busca está sendo realizada.
    results.innerHTML = `<p th:text="Buscando por: ${searchTerm}"></p>`;

    
    // Adicione aqui a lógica para buscar os resultados e exibi-los na página.
  }
});