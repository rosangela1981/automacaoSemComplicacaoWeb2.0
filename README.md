Testes de Unidade: Cálculo de Média Escolar 🎓
Este projeto contém a implementação de testes unitários para validar a lógica de cálculo de médias e status de aprovação de alunos. O objetivo é garantir que as regras de negócio (aprovação e reprovação) sejam aplicadas corretamente com base nas notas fornecidas.

🛠️ Tecnologias Utilizadas
Java: Linguagem principal para o desenvolvimento da lógica.
JUnit 4: Framework de testes utilizado para criar as classes de teste, executar os cenários e realizar as asserções (assertEquals).
Maven: Sistema de gerenciamento de dependências e build.

🧪 Cenários de Teste Implementados
A classe MediaTest.java cobre os seguintes fluxos de validação:

1. Validar Aluno Aprovado
Objetivo: Verificar se o sistema retorna o status correto quando a média atinge o critério mínimo.
Cenário: Notas 5.0 e 5.0.
Resultado Esperado: "Aprovado".

2. Validar Aluno Reprovado
Objetivo: Garantir que o sistema identifique corretamente quando um aluno não atinge a nota mínima necessária.
Cenário: Notas 4.9 e 5.0.
Resultado Esperado: "Reprovado".

📂 Estrutura do Código
Os testes seguem o padrão clássico de organização:
Instanciação: Criação do objeto Media.
Ação: Invocação do método calculaMedia(nota1, nota2).
Asserção: Comparação do resultado obtido com o resultado esperado através do assertEquals.

Java
@Test
public void validaAprovado(){
    Media media = new Media();
    String resultado = media.calculaMedia(5.0, 5.0);
    assertEquals("Aprovado", resultado);
}
🚀 Como Executar
Clone o repositório: https://github.com/rosangela1981/automacaoSemComplicacaoWeb2.0.git
Abra o projeto em sua IDE (IntelliJ, Eclipse ou VS Code).

Execute os testes via terminal com o Maven:

Bash
mvn test
💡 Por que este teste é importante?
Este projeto demonstra a aplicação de Testes de Caixa Branca, onde validamos as condições lógicas internas da aplicação. É a base da pirâmide de testes, garantindo rapidez no feedback e facilidade na identificação de erros de cálculo ou regras de arredondamento.
