<h1 align="center" color="blue">RECIPE - Linguagem para escrever receitas e gerar um código HTML.</h1>
<h2 align="center" color="blue">TRABALHO 6 - COMPILADORES 1</h2>
<h3 align="center" color="blue"> Universidade Federal de São Carlos - Prof. Daniel Lucrédio </h2>
<br>
<h3 align="center" color="blue"> Autor:</h2>
<p align="center"> Linneu Augusto Mendo Zanco - 769155 </p>

## SUMÁRIO :pencil:

[Introdução](#introdução) <br>
[Gramática](#gramática) <br>
[Compilar](#compilar) <br>
[Vídeo auxiliar](#vídeo-auxiliar)

## INTRODUÇÃO

O trabalho desenvolvido a seguir para a matéria de Compiladores visa a criação de uma linguagem de programação e um compilador para a mesma. A linguagem criada é utilizada para a escrita de receitas de cozinha. O compilador, então, interpreta o programa dado em formato txt e interpreta-o, gerando uma página HTML.

## GRAMÁTICA

A gramática da linguagem RECIPE, está definida no arquivo [RECIPE.g4](https://github.com/linneu1997/Compiladores-T6/blob/main/recipe/src/main/antlr4/br/ufscar/dc/compiladores/recipe/RECIPE.g4)

O seguinte exemplo ilustra o uso da linguagem RECIPE:

```textX
$ Comentários são realizados dessa forma.
receita
  Nome: "Nome da Receita"
  Capa: "path/to/image/image.jpg"
  Tempo: $Tempo de preparo.

  Ingredientes:
    $Aqui se declara os ingredientes e temperos
  fim_ingredientes

  Metodo:
    $Aqui se declara cada passo da função
  fim_metodo
fim_receita
```
Na seção "Metodo" pode-se utilizar comandos da linguagem para se escrever a receita. Esses comandos são definidos a seguir:

| Comando                          | Descrição                                                               |
|----------------------------------|-------------------------------------------------------------------------|
|asse(INGREDIENTE, tempo, NUMERO)  |Comando para assar um ingrediente durante o tempo estabelecido. O parâmetro NUMERO define a temperatura.|
|cozinhe(INGREDIENTE, tempo) |Comando para cozinhar um ingrediente pelo tempo definido.|
|misture(INGREDIENTE(, INGREDIENTE)+)| Comando para misturar ingredientes.|
|corte(INGREDIENTE, tipo_corte) | Comando para cortar o ingrediente. Os tipos de corte são: cortar, ralar e picar.|
|bata(INGREDIENTE(, INGREDIENTE)+)| Comando para bater todos os ingredientes listados.|
|descanse(tempo) |Coamando para deixar o prato descansar pelo tempo definido.|
|passo(CADEIA) |Comando para escrever um passo personalizado do método de preparo |
|Pao_de_Lo() |Função pré-definida para cozinhar pão de ló.|
|cobertura() |Função pré-definida para fazer uma cobertura.|
|arroz() |Função pré-definida para cozinhar arroz.|
|risotto() |Função pré-definida para uma base de risotto.|

## COMPILAR

Para executar o programa, no terminal use o comando:

java -jar PATH/TO/EXEC/recipe-1.0-SNAPSHOT-jar-with-dependencies.jar PATH/TO/FILE/arquivo_entrada.txt PATH/TO/EXIT/arquivo_saida.html

Além disso, alguns casos de testes podem ser usados como entrada: [casos de teste](https://github.com/linneu1997/Compiladores-T6/tree/main/casos%20de%20teste)

## VÍDEO AUXILIAR
