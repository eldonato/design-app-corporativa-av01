
<h1>Repositório para a prmieira avaliação da disciplina de Design de Aplicação corporativa</h1>

## Vantagens de cada padrão

### 1- Builder
<ul>
  <li>O uso do padrão Builder permite a representação do objeto dentro do próprio código</li>
  <li>Permite a criação de objetos complexos passo a passo, permitindo adiar algumas etapas sem quebrar o objeto final</li>
</ul>

### 2- Facade
<ul>
  <li>Com este padrão é possível simplificar uma gama de processos complexos em uma interface mais simples e acessível para o cliente</li>
  <li>É definido uma nova interface para objetos já existentes, trabalhando com um subsistema inteiro de objetos</li>
  <li>O código do facade isola a complexidade do sistema utilizado</li>
</ul>

### 3- Factory Method
<ul>
  <li>É fornecido uma interface para criar diversos objetos de uma superclasse em comum permitindo que cada objeto
    criado tenha seu tipo alterado sem a necessidade de especificar</li>
  <li>Evita-se forte acoplamento entre o criador e os produtos concretos</li>
  <li>O princípio Aberto/Fechado é respeitado permitindo que novos subtipos de objetos sejam criados sem o risco de quebrar outros subtipos já existentes</li>
</ul>

### 4- Strategy
<ul>
  <li>Permite que seja definido uma família de algoritmos em classes separadas e torna seus objetos substituiveis entre si</li>
  <li>Utiliza-se o princípio do Aberto/Fechado, permitindo que sejam inseridas novas estratégias sem mudar o contexto dos objetos</li>
  <li>Os detalhes de implementação de um algoritmo são isolados do código que os usa</li>
</ul>
