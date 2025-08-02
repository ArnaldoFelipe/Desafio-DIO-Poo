Desafio Bootcamp DIO - Java Developer
Este projeto é uma implementação do desafio de POO (Programação Orientada a Objetos) do Bootcamp Java Developer da DIO. O objetivo é simular um sistema de gerenciamento de um Bootcamp, com entidades como Devs, Cursos, Mentorias e o próprio Bootcamp.

🚀 Tecnologias Utilizadas
Java 11 ou superior: A linguagem principal do projeto.

Java SE (Standard Edition): Bibliotecas padrão do Java para manipulação de coleções (List, Set) e datas (LocalDate).

💻 Entidades do Domínio
O projeto é estruturado em torno das seguintes classes, que representam as entidades do negócio:

Bootcamp: Representa o programa de capacitação. Ele contém uma lista de conteúdos (Cursos e Mentorias) e uma lista de Devs inscritos.

Conteudo: Uma classe abstrata que serve como base para Curso e Mentoria. Possui atributos como título e descrição.

Curso: Estende Conteudo e adiciona a propriedade de cargaHoraria.

Mentoria: Estende Conteudo e adiciona a propriedade data (do tipo LocalDate).

Dev: Representa os desenvolvedores inscritos no Bootcamp. Possui atributos como nome, e coleções de conteúdos inscritos e concluídos (Set).

⚙️ Funcionalidades Implementadas
Inscrição de Devs: Um Dev pode se inscrever em um Bootcamp. Ao se inscrever, os conteúdos do Bootcamp são copiados para a lista de conteúdos inscritos do Dev.

Progressão: A funcionalidade de "progredir" permite ao Dev avançar no Bootcamp. Isso remove o primeiro conteúdo da lista de inscritos e o move para a lista de conteúdos concluídos.

Cálculo de XP: A cada conteúdo concluído, o Dev acumula pontos de experiência (XP). O cálculo do XP é feito na classe Dev.

Comparações de Objetos: As classes do domínio utilizam os métodos hashCode() e equals() sobrescritos para garantir que as coleções de objetos funcionem corretamente. Isso permite que dois objetos com o mesmo conteúdo sejam tratados como iguais.

👨‍💻 Como Rodar o Projeto
Clone o repositório:

Bash

git clone <https://github.com/ArnaldoFelipe/Desafio-DIO-Poo>
Abra o projeto na sua IDE: Use sua IDE favorita (IntelliJ, Eclipse, VS Code) para abrir o projeto.

Execute a classe principal: A lógica de simulação está na classe Main (ou similar). Execute o método main para ver a simulação do sistema.

🤝 Contribuição
Contribuições são bem-vindas! Se você encontrar um bug ou tiver uma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.
