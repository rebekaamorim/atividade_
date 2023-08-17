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

## Passo 5 - Criando um layout

 Pela interfasse, basta arrastar as views para a tela, colocar os seus IDs e definir sua string, ou seja, o texto que vai dentro do elemento pelo arquivo String.xml. 

##### elementos arrastados para a tela Menu.
 ![image](https://github.com/rebekaamorim/atividade_/assets/127617481/f56d765f-0367-461d-a5e4-1b7daff0b06f)


_OBS: para posiciona-los, arrastar as bolinhas brancas até as extreminadades da tela, assim, o objeto fica fixo. Como nas fotos a seguir:

![image](https://github.com/rebekaamorim/atividade_/assets/127617481/5c1e97b3-0e12-43c8-9c67-daa213e92e9b)
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/65e82dd9-1f01-4a25-bd41-48b6f17f370f)


##### Adicionando o ID do elementos:

![image](https://github.com/rebekaamorim/atividade_/assets/127617481/c0698f10-ef8c-4d41-af54-4d68f3d7dbed)
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/44355a30-0704-4f4c-b7ad-8a522dd45bf9)
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/6687d76f-9869-4b62-8f73-37a6bb612678)
 
 ##### Adicionando texto peo arquivo string.xml

 ![image](https://github.com/rebekaamorim/atividade_/assets/127617481/f2918ae4-a1d0-480d-8c9b-ed40c322c29d)
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/5c0db7b9-f7e4-4da9-9d9b-287d5e6b3714)

_Clicar no boão retangular ao lado do atributo para adicionar a string
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/2a81f44c-c3dc-4ce2-aaf0-7f625bb651b8)
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/384d06f5-6250-4294-85e3-6010b84da79a)

Pronto! O resultado fica assim:

![image](https://github.com/rebekaamorim/atividade_/assets/127617481/0a78adc2-af49-4083-ae9d-1f57ade83060)

 A tela pode ser estilizada, utilizando os atributos, ficando da seguinte forma:

 ![image](https://github.com/rebekaamorim/atividade_/assets/127617481/32177e0d-37c3-4750-9a60-5807913f4f5f)

 
#### A mesma lógica segue nos demais layouts, sendo eles

- ##### Exercicio 3

 Nessa activity o elemento diferenciado que usamos, foi o CheckBox, usado no lugar no Button.
 
 ![image](https://github.com/rebekaamorim/atividade_/assets/127617481/dee3bea9-5025-4bd3-93bb-cfc2410236c1)

- 

#### *Adicionando nova activiespara cada tela

![image](https://github.com/rebekaamorim/atividade_/assets/127617481/58d3faf9-06ff-4ea3-bc4f-7762a7f2aa78)

*_Caminho: APP > Java > New > Activity > Empity Views Activity*

## Parte 6 - Programando

####- Código da tela do Exercício 3

  Primeiro criamos as variáveis
 ![image](https://github.com/rebekaamorim/atividade_/assets/127617481/173ca048-bf32-47f2-94f1-1e4949d86cdf)

 Depois, vinculamos ela ao elemento da activity que irá ser manipulado, assim, adicionamos a funcionalidade ao botão
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/eb0fc3dc-89c5-41f8-ae0d-e3fc1ef757a9)

- Criando o método que vai calcular
  
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/d74bc4ae-ab06-4b77-aabc-a27059d3e95e)

- Criando método para converter os minutos em hora

   ![image](https://github.com/rebekaamorim/atividade_/assets/127617481/6ce3ae41-ce15-470c-91c6-bef772a88dc3)

#### - Código do Menu

 Aqui, utilizamos as intents Explícitas para mudar de tela. 
![image](https://github.com/rebekaamorim/atividade_/assets/127617481/df5414a8-d0eb-486f-9599-1255a6e6d010)

