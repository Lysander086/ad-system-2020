create table worker
(
    id       bigint       not null auto_increment,
    city     varchar(255) not null,
    name     varchar(255) not null,
    province varchar(255) not null,
    salary   bigint       not null,
    type     varchar(255) not null,
    primary key (id)
) engine = MyISAM;
