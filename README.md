# [Inteligência Artificial] Lights Out

Neste trabalho, desenvolvemos um modelo de Espaço de Estados para resolver o Jogo "Desliga as Luzes" (Ou, em inglês, Lights Out). Nosso programa recebe uma instância (Matriz 3x3 ou 4x4) não resolvida, e devolve ao usuário sua solução (caso exista).


## 1. Regras do Jogo

### Entrada
A entrada do jogo é um tabuleiro quadrado de tamanho NxN onde cada célula (i,j), com i, j entre 0 e N-1, está em um de dois estado: ligado ou desligado.


### Jogada
Em cada turno o jogador deve escolher uma célula (i,j), esta célula (i,j) e cada uma das suas vizinhas (i-1,j), (i+1,j), (i,j-1) e (i,j+1), se ela existir no tabuleiro deve trocar de estado: se está ligado se torna desligado; se está desligado se torna ligado.

### Objetivo
O objetivo do jogador é deixar todas as células desligadas.

```python
#[4x4]           [3x3]
0 0 0 0	        0 0 0
0 0 0 0         0 0 0
0 0 0 0	        0 0 0
0 0 0 0
```

### A Solução
A solução para o a instância é a lista de jogadas que o jogador deve fazer para chegar ao objetivo.

## 2. Funcionalidades

Primeiramente, nossa solução foi criada com base em espaços de estado. Assim, a matriz inicial fica em estados abertos (**Pilha**), pegamos a matriz de estados abertos, guardamos a mesma em uma variável X, verifica se X é objetivo, se for finaliza, se não for gera filhos de X, guarda X em estados fechados (**Lista**), verifica se os filhos já existem em estados fechados ou abertos, descarta os já existentes e guarda o restante em estados abertos, fica em loop ate não existir estados abertos ou encontrar o objetivo. 

Um pouco mais sobre a lógica do programa:

- É gerado 9 estados para matriz 3x3, um para cada posição (linha, coluna) e 16 estados para matriz 4x4 também um para  cada posição (linha, coluna)
- Para cada estado criado baseado na posição inverte o valor armazenado da posição se valor armazenado for 0 troca para 1, se for 1 troca para 0.
- Posição (linha, coluna) , inverte valor armazenado.
- Se vizinho (linha+1, coluna) existir, inverte valor armazenado.
- Se vizinho (linha-1, coluna) existir, inverte valor armazenado.
- Se vizinho (linha, coluna+1) existir, inverte valor armazenado.
- Se vizinho (linha, coluna-1) existir, inverte valor armazenado.


## Integrantes
Desenvolvedores do tarbalho (UNIP - 5º Semestre 2021):

```python
Gabriel Romano Orlando   RA: N420111
Victoria Deorio Silva    RA: F0378B2
Vanderlei Toscano Junior RA: D9327I8
Gabriel Da Silva Souza   RA: D9152F5
```

## License
[MIT](https://choosealicense.com/licenses/mit/)

