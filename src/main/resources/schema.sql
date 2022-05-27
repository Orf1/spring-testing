create table tag_registered
(
    uuid uuid not null,
    tag_name varchar(255) not null,
    tag_notes varchar(255),
    tag_email varchar(255),
    contact_name varchar(255),
    contact_number varchar(255),
    contact_email varchar(255),
    register_date timestamp,
    metadata varchar(255),
    primary key (uuid)
);

create table tag_valid
(
    id integer not null,
    code varchar(255) not null,
    primary key (id)
);

INSERT INTO tag_registered (uuid, tag_name, tag_notes, contact_name, register_date)
VALUES(random_uuid(), 'Harry', 'Golden Retriever', 'Orfeas M', CURRENT_TIMESTAMP());
INSERT INTO tag_registered (uuid, tag_name, tag_notes, contact_name, register_date)
VALUES(random_uuid(), 'Fluffy', 'Tibetan Mastiff', 'Shimon N', CURRENT_TIMESTAMP());
INSERT INTO tag_registered (uuid, tag_name, tag_notes, contact_name, register_date)
VALUES(random_uuid(), 'Sneaky', 'Black cat', 'John P', CURRENT_TIMESTAMP());
INSERT INTO tag_registered (uuid, tag_name, tag_notes, contact_name, register_date)
VALUES(random_uuid(), 'Rocky', 'Bearded dragon', 'Anna L', CURRENT_TIMESTAMP());
INSERT INTO tag_registered (uuid, tag_name, tag_notes, contact_name, register_date)
VALUES(random_uuid(), 'River', 'Pit-bull', 'Sienna A', CURRENT_TIMESTAMP());

