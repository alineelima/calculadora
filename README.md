<h2> Calculadora Online</h2>
Projeto da disciplina "Laboratório de Engenharia de Software", consiste em construir uma calculadora web na linguagem JAVA onde todas as contas devem ser feitas no back end, que recebe via requisição AJAX os 2 operandos e a a operação a ser efetuada.

<h2>Criação da base de dados</h2>

Abra o terminal, inicie o MariaDB para executar os scripts no arquivo sql.txt dentro da pasta database, basta copiar e colar no terminal na ordem que estão no arquivo. Depois disso, todas as tabelas serão criadas no banco de dados.

<h2>EStrutura do repositório</h2>
<ul>
    <li>build.gradle: arquivo que contêm toda as dependências do projeto;</li>
    <li>src/main/java/controllers: diretório onde se encontra os servlets que fazem o mapeamento dos endpoints do sistema;</li>
    <li>src/main/java/dao: diretório que contêm os Data Access Object para realizar a persistência de dados no banco de dados;</li>
    <li>src/main/java/model: contêm os arquivos de regra de negócio do sistema e que são entidades no banco de dados;</li>
    <li>src/main/java/resources/META-INF: diretório onde é armazenado o arquivo persistence.xml que faz a configuração do framework Hibernate para banco de dados;</li>
    <li>src/main/webapp/view: contêm todas as páginas web do sistema em jsp;</li>
    <li>src/main/webapp/resources: diretório com as pastas css, images e js; </li>
    <li>src/main/webapp/resources/css: arquivos para adicionar estilo as páginas jsp;</li>
    <li>src/main/webapp/resources/images: contem a imagem utilizada no login</li>
    <li>src/main/webapp/resources/js: os arquivos com funções javascript, ajax e jquery para manipulação de algumas atividades do sistema.</li>
</ul>

<h2>Telas</h2>
A aplicação conterá 4 telas em seu total:
<ol>
    <li>Tela de login</li>
    <li>Tela de cadastro</li>
    <li>Tela para realizar as contas</li>
    <li>Tela de histórico</li>
</ol>
A tela de histórico contém todo o histórico de contas feitas pelo aplicativo, contendo também o usuário que a fez e o horário em que foi feito a conta.

<h2>Tecnologias Utilizadas</h2>

<li>Java 8</li>
<li>Gradle 5</li>
<li>MariaDB 10.2</li>
