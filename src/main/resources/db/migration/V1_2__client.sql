create table tb_client (
    id bigserial not null,
    code varchar(255) not null,
    name varchar(255) not null,
    email varchar(255) not null,
    mobile varchar(255) not null,
    description varchar(255) not null,
    pic varchar(255) not null,
    social_id varchar(255) not null,
    address varchar(255) not null,
    data_processing_consent boolean not null,
    client_type_id bigint not null,
    create_by varchar(255) not null,
    created_date timestamp(6) not null,
    last_modified_by varchar(255),
    last_modified_date timestamp(6),
    status varchar(255) not null,
    primary key (id)
);