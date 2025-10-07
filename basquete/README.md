# Projeto Abstract Factory - Basquete

## Descrição
Adaptação do projeto Abstract Factory para o contexto de basquete usando Maven.

## Estrutura do Projeto Maven
```
basquete/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── basquete/
│   │           └── abstractfactory/
│   │               ├── Certificado.java              ← Interface para certificados
│   │               ├── CertificadoAmador.java        ← Certificado para jogadores amadores
│   │               ├── CertificadoProfissional.java  ← Certificado para jogadores profissionais
│   │               ├── Estatistica.java              ← Interface para estatísticas
│   │               ├── EstatisticaAmador.java        ← Estatísticas para jogadores amadores
│   │               ├── EstatisticaProfissional.java  ← Estatísticas para jogadores profissionais
│   │               ├── FabricaAbstrata.java          ← Interface da fábrica abstrata
│   │               ├── FabricaAmador.java            ← Fábrica para jogadores amadores
│   │               ├── FabricaProfissional.java      ← Fábrica para jogadores profissionais
│   │               └── Jogador.java                  ← Classe cliente que usa as fábricas
│   └── test/
│       └── java/
│           └── basquete/
│               └── abstractfactory/
│                   └── JogadorTest.java              ← Testes do padrão Abstract Factory
├── target/                                           ← Pasta gerada pelo Maven
│   ├── classes/                                      ← Classes compiladas
│   ├── test-classes/                                 ← Testes compilados
│   └── surefire-reports/                             ← Relatórios de teste
├── pom.xml                                           ← Configuração Maven
└── README.md
```

## Padrão Abstract Factory Implementado
O projeto implementa o padrão Abstract Factory com duas famílias de produtos:

### Interfaces dos Produtos:
- **Certificado**: Interface para emissão de certificados
- **Estatistica**: Interface para emissão de estatísticas

### Produtos Concretos:
- **CertificadoAmador / CertificadoProfissional**: Certificados específicos para cada nível
- **EstatisticaAmador / EstatisticaProfissional**: Estatísticas específicas para cada nível

### Fábricas:
- **FabricaAbstrata**: Interface que define os métodos de criação
- **FabricaAmador**: Cria produtos para jogadores amadores
- **FabricaProfissional**: Cria produtos para jogadores profissionais

### Cliente:
- **Jogador**: Utiliza as fábricas para criar certificados e estatísticas

## Testes
- **deveEmitirEstatisticaAmador()**: Testa criação de estatística para jogador amador
- **deveEmitirEstatisticaProfissional()**: Testa criação de estatística para jogador profissional
- **deveEmitirCertificadoAmador()**: Testa criação de certificado para jogador amador
- **deveEmitirCertificadoProfissional()**: Testa criação de certificado para jogador profissional

## Comandos Maven

### Compilar o projeto:
```bash
mvn compile
```

### Executar os testes:
```bash
mvn test
```

### Limpar o projeto:
```bash
mvn clean
```

### Compilar e executar testes:
```bash
mvn clean test
```

## Como usar

### Criando um jogador amador:
```java
FabricaAbstrata fabrica = new FabricaAmador();
Jogador jogador = new Jogador(fabrica);

// Emitindo certificado e estatística
String certificado = jogador.emitirCertificado();  // "Certificado de Amador"
String estatistica = jogador.emitirEstatistica();  // "Estatística de Amador"
```

### Criando um jogador profissional:
```java
FabricaAbstrata fabrica = new FabricaProfissional();
Jogador jogador = new Jogador(fabrica);

// Emitindo certificado e estatística
String certificado = jogador.emitirCertificado();  // "Certificado de Profissional"
String estatistica = jogador.emitirEstatistica();  // "Estatística de Profissional"
```

## Vantagens do Padrão Abstract Factory
- **Consistência**: Garante que produtos relacionados sejam criados pela mesma fábrica
- **Flexibilidade**: Fácil adição de novas famílias de produtos (ex: FabricaJuvenil)
- **Isolamento**: O cliente não precisa conhecer as classes concretas dos produtos
