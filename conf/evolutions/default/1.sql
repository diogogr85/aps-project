# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table animal (
  id                        bigint not null,
  nome                      varchar(255),
  raca                      varchar(255),
  peso                      double,
  especie                   varchar(255),
  cpf_proprietario          varchar(255),
  constraint pk_animal primary key (id))
;

create table funcionario (
  cpf                       varchar(255) not null,
  rg                        varchar(255),
  sexo                      varchar(255),
  data_nascimento           timestamp,
  endereco                  varchar(255),
  email                     varchar(255),
  constraint pk_funcionario primary key (cpf))
;

create table procedure (
  id                        bigint not null,
  procedure_type            varchar(255),
  description               varchar(255),
  doctor                    varchar(255),
  auxiliar                  varchar(255),
  animal                    varchar(255),
  constraint pk_procedure primary key (id))
;

create sequence animal_seq;

create sequence funcionario_seq;

create sequence procedure_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists animal;

drop table if exists funcionario;

drop table if exists procedure;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists animal_seq;

drop sequence if exists funcionario_seq;

drop sequence if exists procedure_seq;

