
create table department(
    department_id int primary key,
    department_name varchar(100) not null unique
);


create table responsible_official(
    official_id bigint primary key,
    first_name varchar(30) not null,
    last_name varchar(30) not null,
    middle_name varchar(30) not null,
    position varchar(50) not null,
    department int not null,
    constraint foreign key (department)
        references department(department_id)
);


create table document(
    number int primary key,
    name varchar(100) not null,
    description varchar(300),
    date date not null
);


create table property(
    group_number int,
    subgroup_number int,
    sequence_number int,
    name varchar(100) not null,
    status varchar(50) not null,
    measurement_unit varchar(20) not null,
    number double(10, 2) not null,
    description varchar(300),
    initial_value double(16, 2) not null,
    state varchar(50) not null,
    registration int not null,
    deregistration int,
    responsible_official bigint,
    primary key (group_number, subgroup_number, sequence_number),
    constraint fk_property_document_registration foreign key (registration)
        references document(number),
    constraint fk_property_document_deregistration foreign key (deregistration)
        references document(number),
    constraint fk_property_document_responsible_official foreign key (responsible_official)
        references responsible_official(official_id)
);


