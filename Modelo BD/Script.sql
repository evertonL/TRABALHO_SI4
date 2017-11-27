CREATE TABLE Usuario(
    cpf NUMERIC(11) NOT NULL,
    nome VARCHAR(30) NOT NULL,
    senha VARCHAR(20) NOT NULL 
	cpfm NUMERIC(11) NOT NULL
);
--PK
ALTER TABLE Usuario 
		ADD CONSTRAINT usuario_pk PRIMARY KEY (cpf);
		
--FK
ALTER TABLE Usuario
		ADD CONSTRAINT usuario_medico_fk 
        	FOREIGN KEY(cpfm) REFERENCES Medico (cpf);
   
   
CREATE TABLE Medico(
     cpfm NUMERIC(11) NOT NULL,
     nome VARCHAR(2) NOT NULL,
     especialidade VARCHAR(20) NOT NULL
);
 --PK
ALTER TABLE Medico
		ADD CONSTRAINT medico_pk PRIMARY KEY (cpfm);
        
CREATE TABLE Agenda(
    id_consulta NUMERIC(5) NOT NULL,
    status VARCHAR(10) NOT NULL,
    prescrisao_medico VARCHAR(3000) NOT NULL,
    data DATE NOT NULL,
	cpf_paciente NUMERIC(11) NOT NULL,
	cpfm NUMERIC(11) NOT NULL
);
--PK
ALTER TABLE Agenda
		ADD CONSTRAINT agenda_pk PRIMARY KEY(id_consulta);
--FK
ALTER TABLE Agenda
		ADD CONSTRAINT agenda_medico_fk 
        	FOREIGN KEY(cpfm) REFERENCES Medico (cpf);

ALTER TABLE Agenda
		ADD CONSTRAINT agenda_paciente_fk 
        	FOREIGN KEY(cpf_paciente) REFERENCES Paciente (cpf_paciente);
			
CREATE TABLE Paciente(
	cpf_paciente NUMERIC(11) NOT NULL,
	nome VARCHAR(30) NOT NULL,
	telefone NUMERIC(15) NOT NULL,
	data_nacimento DATE NOT NULL
);
--PK
ALTER TABLE Paciente
		ADD CONSTRAINT paciente_pk PRIMARY KEY(cpf_paciente);
