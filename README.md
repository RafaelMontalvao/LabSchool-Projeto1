#### LabSchool  ####


RF01 - Cadastro de Aluno Situação da matrícula - um aluno pode estar com a matrícula nas seguintes situações: Ativo Irregular Atendimento pedagógico Inativo O usuário do sistema poderá alterar esta situação sempre que necessário. Nota: o aluno deve armazenar a nota do processo seletivo de entrada (0 até 10) Esta nota deve ser inserida no momento do cadastro do aluno. Total de atendimentos pedagógicos realizados. Este item é um contador que inicia em zero. Sempre que um pedagogo realiza um atendimento este valor deve ser incrementado

RF02 - Atualização da Situação da matrícula de Aluno O sistema deve permitir alterar/atualizar a situação da matrícula de determinado aluno. O usuário do sistema poderá alterar esta situação sempre que necessário.

RF03 - Cadastro de Professor Formação acadêmica: Graduação incompleta Graduação completa Mestrado Doutorado Experiência em desenvolvimento: Front-End Back-End Full-Stack Estado Ativo Inativo

RF04 - Cadastro de Pedagogo Total de atendimentos pedagógicos realizados: Este item é um contador que inicia em zero. Sempre que um pedagogo realiza um atendimento este valor deve ser incrementado O sistema deve perguntar qual foi o pedagogo e aluno participaram do atendimento

RF05 - Realização de Atendimento Pedagógico O sistema deve perguntar qual foi o pedagogo e aluno que participaram do atendimento. Sempre que um atendimento pedagógico é realizado, devem ser incrementados os atributos de atendimento do aluno e pedagogo envolvidos. Sempre que um atendimento pedagógico é realizado, a situação da matrícula do aluno deve ser alterada para “Atendimento Pedagógico”.

O Lab School também deverá apresentar os seguintes relatórios:

RF06 - Listagem de Pessoas: Listar todas as pessoas cadastradas, exibindo os campos código, nome e CPF. O usuário deverá informar quais categorias de pessoas deseja listar dentre as opções abaixo: Alunos Professores Pedagogos Todos

RF07 - Relatório dos Alunos: exibindo os campos código, nome, nota e total de atendimentos pedagógicos. O usuário deve escolher quais alunos serão listados de acordo com a situação da matrícula abaixo: Ativo Irregular Atendimento pedagógico Inativo Todos

RF08 - Relatório dos Professores: exibindo os campos código, nome, formação acadêmica, experiência e estado. O usuário deve escolher quais registros apresentar de acordo com as opções abaixo de experiência: Front-End Back-End Full-Stack Todos

RF09 - Relatório de Alunos com mais atendimentos pedagógicos: exibindo os campos código, nome e total de atendimentos pedagógicos de todos os alunos em ordem decrescente de número de atendimentos, ou seja, o primeiro aluno listado deve ser o de maior número de atendimento.

RF10 - Pedagogos com mais atendimentos pedagógicos: exibindo os campos código, nome e total de atendimentos pedagógicos de todos os pedagogos em ordem decrescente de número de atendimentos, ou seja, o primeiro pedagogo listado deve ser o de maior número de atendimento.
