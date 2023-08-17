# Roteiro da criação do APP
Atividade de Fixação Android - PAM - Rebeka Lima e Paulo Ricardo

## Parte 1 - Criando o repósitorio

Para criar o reposítório, logamos na conta git hub. Dessa forma, ao entrar de cara aparece um botão verde do lado esquerdo da tela ao lado do titulo Top Repositorires, escrito ‘New’. 
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/bc1eaf33-c4c0-4473-85a5-10392e57c39a)
Ao clicar, a página é redirecionada a sequinte tela:
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/e7dbb32f-5871-4f0a-a06d-33f5ada74869)
Nessa tela, preenchemos com o nome desejado para o repositório, em seguida a descição. Depois disso é necessário selecionar um das opções para deixar seu repositório publico ou privado. E por ultimo, temos a opçaõ de criar o repositório com um readme e com um gitigone.
Depois de escolher tudo, basta criar clicando no botão verde inferior “Create repository”; Em seguida o repositório será criado.
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/9df79e26-cce9-4ddf-b691-f01558b5aefc)

## Parte 2 - Configurando o Git Bash
Abrimos o git bansh e digitamos os seguintes comandos para configura-lo na conta git do usuario:
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/e10783a0-bb24-45d6-b337-36402da24707)
- O primeiro serve para colocar o nome do usuario, o segundo para o email.

## Parte 3 - Criando o Projeto no Android Studio

Entra no Android Studio e siga o caminho igual o da imagem:
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/0c64c237-3058-4778-93fc-e2180c9904ed)

*_File > New > New Project_

Depois disso a seguinte tela aparecerá:
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/b2b7a36e-1ed0-4d56-ae61-594677b25dd4)
Ela serve para escolher o tipo de tela. Neste caso, escolhemos Empy Views Activity, que é a vazia.

Após escolher, aperte em next e aparecerá outra tela para configurar seu projeto: 

![image](https://github.com/rebekaamorim/atividade_/assets/127617481/0bf61700-0002-45dc-9758-b3f11cc88278)

Prenchemos o campo de Nome, Package Name, e escolhemos a lingugem Java. Em seguida selecionamos o modelo da API e escolhemos a Buid configuration Language “Groovy DSL”.
Feito isso, só finalizar apertando em finish.
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/46292828-5259-4af9-9202-e726f5fef228)

## Passo 4 - Colocar projeto no GitHub

Primeiro, procure a pasta do projeto, clique com o botão direito nele e abra o Git Bash Here. O terminal irá abrir da seguinte forma:
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/f938a3a1-ba47-4910-9364-f82cb8bb8d53)

Neste terminal, use o comando git init, para inicializar. Em seguida digite git remote add origin e a URL do repositório, para se conectar a ele. 

![image](https://github.com/rebekaamorim/atividade_/assets/127617481/1e28e84b-a12d-4b1f-8511-090fbe81ca49)

Depois disso digite git add . para adicionar todos os arquivos do diretório como na imagem:
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/8f1d8ca4-a709-4ba7-b08d-5e474e9c5e2e)
Para ver a situaçaõ dos aquivos basta digitar git status:
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/7336f518-3eef-42cf-a080-74fbf7e94d5d)
Feito isso, só dar o comit, usando o código git commit -m “teste” (usamos o parâmetro -m para conseguir colocar uma descrição no comit. 
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/15007cca-1134-4588-a00a-916e181f7216)

 Para renomar um ramo (branch) digite “git Branch -M <nome desejado>”. Após estes procedimentos, só escrever git push -u origin main, que o projeto será enviado ao GitHub.
 ![image](https://github.com/rebekaamorim/atividade_/assets/127617481/89268cec-ea65-41ab-84f1-05ffb50f28e0)

Resultado:
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/fbc3ae70-2f60-45d0-9ab0-bf15391a9cd4)

Caso fizer alguma alteração, simplemente utilizar os três códigos da imagem:
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/360894f8-818c-4b00-8f4c-b1f25e28e616)

- git add .
- commit -m “descricao”
- git push origin main;

