- **Nome:** Pedro Miranda Campos Riato
- **RM:** 562117
- **Turma:** 2CCPG
- **Curso:** Ciências da Computação
- **Github:** @Periato e @PedroMCRiato


---

## Descrição do projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (zoológico)

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces


---


## Perguntas de reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe 'Passageiro'? Não seria mais fácil apenas criar variáveis soltas no main, como 'String nomeAna = "Ana"' e 'double saldoAna = 50.0'?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?*

**Sua resposta:**
A classe Passageiro é importante porque ela organiza os dados e comportamentos de cada usuário em um único lugar. Em vez de criar várias variáveis soltas no main, como nome, saldo e telefone, podemos criar objetos que representam cada passageiro do sistema. Isso facilita muito a manutenção e o entendimento do código. Se o FiapRide tiver 1 milhão de usuários, seria impossível controlar milhões de variáveis separadas manualmente. Com a classe, podemos armazenar todos os passageiros em listas, bancos de dados ou coleções de objetos. Além disso, a classe permite reutilizar código, criar métodos como adicionarSaldo() e solicitarCorrida(), e seguir os princípios da Programação Orientada a Objetos. Assim, o sistema fica mais organizado, escalável e fácil de evoluir.

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer 'passageiro.saldo = passageiro.saldo \+ 100' diretamente no código principal, por que dá tanto trabalho criar um método específico chamado 'adicionarSaldo \(valor\)' para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador a iterar o saldo diretamente?"

**Sua resposta:**
Criar o método adicionarSaldo(valor) é importante para proteger os dados do sistema e garantir que as regras do negócio sejam respeitadas. Se qualquer programador puder alterar o saldo diretamente, alguém pode adicionar valores negativos, apagar saldo sem querer ou criar inconsistências financeiras. Em uma startup como o FiapRide, isso poderia gerar prejuízos, fraudes e reclamações de usuários. Com um método específico, a classe consegue validar as operações, por exemplo impedindo depósitos negativos ou registrando todas as movimentações do saldo. Além disso, se no futuro a empresa quiser cobrar taxas, dar bônus ou integrar pagamentos, basta alterar o método uma única vez. Isso segue o princípio do encapsulamento da POO, deixando o sistema mais seguro, organizado e fácil de manter.

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são 'private', mas os métodos 'getSaldo\(\)' e 'getNome\(\)' são 'public'. Por que é seguro deixar o 'get' público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar? "

**Sua resposta:**
Os métodos getSaldo() e getNome() podem ser públicos porque eles apenas permitem visualizar as informações, sem alterar os dados internos do objeto. É como entregar uma cópia de um documento: a pessoa consegue ler o conteúdo, mas não consegue modificar o original. Já deixar o atributo público seria perigoso porque qualquer parte do sistema poderia alterar os valores diretamente, sem controle ou validação. Isso poderia causar erros, fraudes ou dados inconsistentes, como um saldo negativo ou um nome vazio. O encapsulamento existe justamente para proteger os dados importantes da classe. Assim, a própria classe decide como os valores podem ser acessados ou modificados, mantendo mais segurança e organização no sistema.

---

### Aula 4 - Construtores

**Pergunta:** "> "Na nossa classe 'Veiculo', nós tomamos duas decisões arquitetônicas muito importantes:
>
> 1. Nós **não** criamos o método 'setModelo\(\)'.
> 2. O 'setPlaca\(\)' foi criado como **privado**, e criamos um método público chamado 'atualizarPlaca\(\)' para acessá-lo.
>
> Pensando no mundo real e no clean code: Por que é um erro gravíssimo clicar em 'Gerar getters e setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?"

_Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar um dado no banco" e "executar um processo real no Detran"_"

**Sua resposta:**
Gerar getters e setters para tudo automaticamente é um erro porque isso quebra o encapsulamento e transforma a classe em apenas um “pacote de variáveis”, sem regras de negócio. Nem todo atributo deve poder ser alterado livremente. No caso do Veiculo, não criamos setModelo() porque o modelo de um carro não muda fisicamente depois que ele existe. Permitir essa alteração poderia gerar fraudes e inconsistências, como transformar um carro popular em um carro de luxo apenas mudando uma string no sistema. Já a placa pode mudar, mas isso exige um processo oficial no Detran, documentação e validações. Por isso o setPlaca() é privado, e o método público atualizarPlaca() controla como essa mudança acontece. Assim, a classe garante regras, registra processos e impede alterações ilegais ou sem validação. Isso é clean code: proteger o domínio do sistema e representar corretamente as regras do mundo real.

---

### Aula 5 - Associação

**Pergunta:** "No construtor da 'Viagem', nós exigimos o objeto inteiro \('Passageiro solicitante'\). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem \('String nomeDoPassageiro'\) em vez do objeto todo?"

_Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?_"

**Sua resposta:"
Usar o objeto inteiro Passageiro é muito mais correto do que armazenar apenas a String do nome, porque a viagem precisa se relacionar com o passageiro real do sistema, e não apenas com um texto. A String "Ana Silva" serve apenas para exibição, mas não possui comportamentos nem acesso aos dados do usuário. Quando a viagem termina, o sistema precisa descontar saldo, verificar informações da conta e talvez registrar histórico ou pontuação. Tudo isso só é possível porque a Viagem possui referência ao objeto Passageiro. Além disso, poderiam existir várias pessoas chamadas “Ana Silva”, gerando erros graves. Em POO, objetos colaboram entre si justamente para representar relações reais e permitir que as regras de negócio funcionem corretamente.

---

### Aula 6 - Herança

**Pergunta:** "No nosso código, a mãe 'Veiculo' possui os atributos 'placa' e 'modelo' como 'private'. Quando o 'Carro' herda de 'Veiculo', ele recebe esses atributos, mas o código dentro de 'Carro' NÂO consegue fazer 'this.placa = "ABC"'. Ele é obrigado a usar o 'super\(\)' ou o 'setPlaca\(\)'.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?"

**Sua resposta:**
O Java não permite que a classe filha altere diretamente os atributos private da mãe porque o private pertence exclusivamente à própria classe que declarou o atributo. Isso protege o princípio do encapsulamento, que vimos nas aulas anteriores. Mesmo que Carro herde de Veiculo, a classe mãe continua controlando como seus dados internos podem ser acessados ou modificados. Assim, qualquer alteração em placa ou modelo precisa passar pelos métodos definidos pela própria Veiculo, como setPlaca() ou pelo super(). Isso evita que subclasses ignorem validações importantes e alterem dados de forma incorreta ou insegura. Na prática, é uma forma de garantir que as regras de negócio da mãe sejam respeitadas por todas as filhas, mantendo o sistema mais seguro, consistente e organizado.

---

### Aula 7 - Polimorfismo

**Pergunta:** "No nosso loop 'for \(Veiculo veiculo: frota\)', a variável 'veiculo' é do tipo genérico 'Veiculo'. Se esquecêssemos de criar o método 'calcularAutonomia\(\)' lá na classe mãe 'Veiculo', nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do 'Carro' e da 'Moto'? Por que o contrato precisa existir na base da hierarquia?"

**Sua resposta:**
Não conseguiríamos chamar calcularAutonomia() dentro do loop se o método não existisse na classe Veiculo. Isso acontece porque a variável do loop é do tipo genérico Veiculo, então o Java só permite acessar métodos que fazem parte do “contrato” dessa classe base. Mesmo que os objetos reais sejam Carro ou Moto, o compilador olha para o tipo da variável de referência, não para o objeto concreto naquele momento. Ao declarar calcularAutonomia() na mãe, garantimos que todos os veículos terão esse comportamento, mesmo que cada classe implemente de um jeito diferente. Isso é o princípio do polimorfismo: tratar objetos diferentes de forma uniforme através de uma interface comum. O contrato na base da hierarquia garante segurança, padronização e permite que o sistema funcione de maneira genérica e escalável.

---

### Aula 8 - Classes Abstratas

**Pergunta:** "Pense no mundo real: faz sentido existir um objeto que é APENAS 'Veiculo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que então, no código, precisamos EXPLICITAMENTE dizer ao Java que 'Veiculo' é 'abstract'? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar 'abstract', qual o risco que corremos? Alguém pode criar 'new Veiculo \(\)' e quebrar a lógica do nosso sistema?"

**Sua resposta:**
No mundo real, realmente não faz sentido existir apenas um “Veículo” genérico. Sempre estamos falando de um tipo concreto, como carro, moto ou caminhão. Por isso usamos abstract: para deixar claro que a classe Veiculo serve apenas como modelo base para herança, e não para criar objetos reais diretamente. O Java não deduz isso sozinho porque uma classe pode ser usada tanto como base quanto como objeto concreto; essa decisão precisa ser explícita do programador. Se esquecermos de colocar abstract, alguém poderia fazer new Veiculo() e criar um objeto incompleto, sem comportamentos específicos definidos corretamente. Isso quebraria a lógica do sistema, pois um “veículo genérico” talvez não saiba calcular autonomia, capacidade de carga ou outras regras importantes. A palavra-chave abstract funciona como uma proteção arquitetônica, impedindo usos inválidos e forçando que apenas classes concretas especializadas sejam instanciadas.

---

### Aula 9 - Interfaces

**Pergunta:** "Por que o Java permite herança simples \(apenas uma mãe\), mas múltipla implementação de interfaces \(vários contratos\)?

Pense: Se 'CarroEletrico' pudesse herdar de 'Veiculo' E de 'Bateria' ao mesmo tempo \(herança múltipla\), o que aconteceria se AMBAS as mães tivessem um método chamado 'ligar\(\)'?

Como as interfaces resolvem esse problema? "

**Sua resposta:**
O Java permite apenas herança simples para evitar ambiguidades e conflitos de comportamento. Se CarroEletrico herdasse de Veiculo e Bateria ao mesmo tempo, e ambas as classes tivessem um método ligar(), o Java não saberia qual implementação deveria executar. As interfaces resolvem isso porque elas definem apenas contratos, ou seja, dizem o que a classe deve fazer, mas não impõem uma implementação concreta obrigatória como uma classe mãe faria. A própria classe decide como implementar os métodos, eliminando ambiguidades e mantendo o código mais organizado, previsível e seguro.

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**

Para o meu projeto pessoal, o domínio escolhido foi o de um zoológico.

**Quais classes você criou?**

Animal (Classe Mãe / Abstrata): A base de tudo, contendo atributos como especie, nome e peso, além do método abstrato identificar().

Recinto: Classe que representa o espaço físico, com atributos como bioma e capacidade.

Zoologico: Atua como a classe de Associação, conectando um objeto Animal a um objeto Recinto.

Mamifero (Classe Filha): Especialização de Animal, adicionando o atributo corPelo.

Reptil (Classe Filha): Especialização de Animal, adicionando o atributo temperaturaCorporal.

Ave (Classe Filha): Especialização de Animal, que também implementa a interface de comportamento.

DroneVigilancia: Uma classe que não pertence à hierarquia de animais, mas que compartilha comportamentos através de interface.

Interfaces (Comportamentos)
Treinavel: Define o "contrato" para qualquer objeto que possa receber comandos, contendo os métodos executarComando() e recompensar().

Classe de Execução
SistemaPrincipal: Onde realizamos os testes de polimorfismo, herança e o das interfaces utilizando as listas e arrays.

**Qual foi o maior desafio técnico que vocÊ enfrentou?**

O maior desafio técnico foi a transição da estrutura de herança simples para uma arquitetura baseada em classes abstratas e interfaces, garantindo que o sistema permanecesse consistente. Houve uma complexidade inicial ao lidar com a tipagem de referência no Java, especialmente ao tentar verificar se um objeto pertencia a hierarquias distintas usando o operador instanceof. Outro ponto crítico foi implementar o polimorfismo de sobrescrita, onde métodos como identificar() precisavam ser obrigatoriamente definidos nas classes filhas para evitar erros de compilação. A integração de classes de domínios diferentes, como Ave e DroneVigilancia, sob a mesma interface Treinavel, exigiu um entendimento profundo sobre como desacoplar comportamentos de categorias biológicas. Por fim, ajustar o SistemaPrincipal para acessar métodos específicos de cada subclasse sem perder a flexibilidade do uso de listas genéricas demandou um controle rigoroso sobre os tipos de variáveis declaradas. Esse processo foi essencial para garantir a segurança e a extensibilidade do código. Em resumo, a transição de estrutura simples para classes abstratas e interfaces; uso do instanceof; polimorfismo de sobrescrita; e integração de classes de domínios diferentes.

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**

Aprendi a estruturar um sistema de Programação Orientada a Objetos em Java, com um aprendizado constante ao longo de 9 aulas. O projeto começou simples, mas foi evoluindo, tendo passado por diversos temas, como Associação, Herança, Polimorfismo e Interfaces. Aprendi conceitos básicos de POO, e também a dar commits no GitHub.

**Qual conceito foi mais difícil de entender?**

O conceito mais difícil de entender foi Interfaces, pois foi difícil pensar em objetos que utilizassem a mesma interface, mas não se enquadrassem na mesma classe mãe, que era Animal. Para superar essa dificuldade, estudei novamente a aula pelo material disponibilizado pelo professor, e utilizei a criatividade para pensar em bons objetos.

**O que você melhoraria no seu projeto seu pudesse refazer?**

Deixaria o código mais simples; buscaria melhorá-lo a cada aula, e não somente ir adicionando novas funcionalidades.
