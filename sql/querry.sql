-- Database
create database "HotelReservation";

-- table roles
create table roles
(
	id serial
		constraint roles_pk
			primary key,
	name varchar(50) not null
);

create unique index roles_name_uindex
	on roles (name);

-- table users
create table users
(
	id serial
		constraint users_pk
			primary key,
	login varchar(50) not null,
	name varchar(50) not null,
	surname varchar(50) not null,
	middlename varchar(50),
	email varchar(255) not null
);

create unique index users_email_uindex
	on users (email);

create unique index users_login_uindex
	on users (login);

--after
alter table users
    add password varchar not null;
	
-- table users_roles
create table users_roles
(
	user_id int
		constraint users_roles_users_id_fk
			references users
				on delete cascade,
	role_id int
		constraint users_roles_roles_id_fk
			references roles
				on delete cascade,
	constraint users_roles_pk
		primary key (user_id, role_id)
);

--table cars
create table cards
(
	id serial
		constraint cards_pk
			primary key,
	number varchar(16) not null,
	balance real not null,
    user_id int not null
        constraint cards_users_id_fk
            references users
            on delete cascade
);

--after
alter table cards alter column number type varchar(20) using number::varchar(20);

alter table cards alter column balance set default 300;
-- tabel requests
create table requests
(
	id serial
		constraint requests_pk
			primary key,
	user_id int not null
		constraint requests_users_id_fk
			references users
				on delete cascade,
	number_of_rooms smallint not null,
	class varchar(5) not null,
	start_date date not null,
	end_date date not null,
	"isConfirmed" boolean default null
);

--after
alter table requests rename column "isConfirmed" to status;

alter table requests alter column status type varchar(16) using status::varchar(16);

alter table requests alter column status set not null;

alter table requests alter column status set default 'unchecked';

-- tabel rooms
create table rooms
(
	id serial
		constraint rooms_pk
			primary key,
	number int not null,
	number_of_rooms smallint not null,
	class varchar(5) not null,
	price_per_day real not null,
	"isFree" boolean default true not null
);
alter table rooms rename column "isFree" to is_free;

create unique index rooms_number_uindex
	on rooms (number);
	
-- table reserved_rooms

alter table reserved_rooms rename column role_id to room_id;

alter index reserved_rooms_user_id_role_id_uindex rename to reserved_rooms_user_id_room_id_uindex;

alter table reserved_rooms rename column "isPaid" to is_paid;