create table tag_registered
(
    uuid uuid not null,
    tag_name varchar(255) not null,
    tag_email varchar(255),
    tag_notes varchar(255),
    contact_name varchar(255),
    contact_email varchar(255),
    contact_number varchar(255),
    metadata varchar(255),
    primary key (uuid)
);


insert into tag_registered (uuid, tag_name, tag_notes, contact_name)
values(random_uuid(), 'Harry', 'Golden Retriever', 'Orfeas M');
insert into tag_registered (uuid, tag_name, tag_notes, contact_name)
values(random_uuid(), 'Fluffy', 'Tibetan Mastiff', 'Shimon N');
insert into tag_registered (uuid, tag_name, tag_notes, contact_name)
values(random_uuid(), 'Sneaky', 'Black cat', 'John P');
insert into tag_registered (uuid, tag_name, tag_notes, contact_name)
values(random_uuid(), 'Rocky', 'Bearded dragon', 'Anna L');
insert into tag_registered (uuid, tag_name, tag_notes, contact_name)
values(random_uuid(), 'River', 'Pit-bull', 'Sienna A');

