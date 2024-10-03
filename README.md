## Consulta de CEP - API ViaCEP
Este projeto Java realiza a consulta de endereços a partir de um CEP informado pelo usuário, utilizando a API ViaCEP. Após obter os dados do endereço, o programa exibe as informações e salva o resultado em um arquivo JSON.

## Funcionalidades
- Busca de endereços via API ViaCEP.
- Exibição do endereço completo com base no CEP.
- Salvamento do resultado em um arquivo JSON com o nome baseado no CEP.

## Estrutura do Projeto
O projeto contém as seguintes classes:

- ConsultaCep: Responsável por realizar a consulta do CEP utilizando a API ViaCEP.
- Endereco: Modelo de dados que representa um endereço (CEP, logradouro, complemento, bairro, localidade, UF).
- GeradorArquivo: Classe responsável por salvar o resultado da consulta em um arquivo JSON.
- Main: Classe principal que interage com o usuário e coordena a execução do programa.

## Como Executar
1. Clone o repositório para sua máquina local.
2. Certifique-se de que o Java 11 (ou superior) esteja instalado e configurado corretamente.
3. Adicione a biblioteca Gson ao seu classpath.
   - [Download da Gson](https://github.com/google/gson)
4. Compile e execute o programa através da classe Main.
