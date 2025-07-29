drop table if exists borrow_record cascade;
drop table if exists book_review cascade;
drop table if exists book cascade;
drop table if exists author cascade;

create table author (
    id serial primary key,
    name text not null,
    bio text
);

create table book (
    id serial primary key,
    title text not null,
    author_id int references author(id),
    published_date date
);

create table users (
    id serial primary key,
    name text not null,
    email text not null unique,
    created_at timestamp default current_timestamp
);

create table book_review(
    id serial primary key,
    book_id int references book(id),
    user_id int references users(id),
    review text,
    rating int check (rating >= 1 and rating <= 5),
    created_at timestamp default current_timestamp
);

create table borrow_record(
    id serial primary key,
    book_id int references book(id),
    user_id int references users(id),
    borrow_date date not null,
    return_date date,
    status text check (status in ('BORROWED', 'RETURNED')) default 'BORROWED',
    created_at timestamp default current_timestamp
);

insert into author (name, bio) values
('George Orwell', 'English novelist and essayist, journalist and critic.'),
('J.K. Rowling', 'British author, best known for the Harry Potter series.'),
('J.R.R. Tolkien', 'English writer, best known for The Hobbit and The Lord of the Rings.');

insert into book (title, author_id, published_date) values
('1984', 1, '1949-06-08'),
('Animal Farm', 1, '1945-08-17'),
('Harry Potter and the Philosophers Stone', 2, '1997-06-26'),
('The Hobbit', 3, '1937-09-21'),
('The Lord of the Rings: The Fellowship of the Ring', 3, '1954-07-29');

insert into users (name, email) values
('Alice Smith', 'alicesmith@mail.com'),
('Bob Johnson', 'bobjohnson@mail.com');

insert into book_review (book_id, user_id, review, rating) values
(1, 1, 'A dystopian masterpiece.', 5),
(2, 2, 'A brilliant allegory.', 4),
(3, 1, 'An enchanting start to a magical series.', 5),
(4, 2, 'A timeless adventure.', 5),
(5, 1, 'An epic journey through Middle-earth.', 5);

insert into book_review (book_id, user_id, review, rating) values
(1, 2, 'A chilling vision of the future.', 4),
(2, 1, 'A clever satire on totalitarianism.', 5),
(3, 2, 'A captivating beginning to a beloved series.', 5),
(4, 1, 'A classic tale of adventure and bravery.', 4),
(5, 2, 'A masterful epic that defines fantasy literature.', 5);

insert into book_review (book_id, user_id, review, rating) values
(1, 1, 'Too bleak for my taste.', 2),
(2, 2, 'Overrated and dull.', 1),
(3, 1, 'Not as good as I expected.', 3),
(4, 2, 'Boring and predictable.', 2),
(5, 1, 'Did not live up to the hype.', 3);

insert into borrow_record (book_id, user_id, borrow_date, return_date, status) values
(1, 1, '2023-10-01', NULL, 'BORROWED'),
(2, 2, '2023-10-02', '2023-10-10', 'RETURNED'),
(3, 1, '2023-10-05', NULL, 'BORROWED'),
(4, 2, '2023-10-07', NULL, 'BORROWED'),
(5, 1, '2023-10-08', '2023-10-15', 'RETURNED');
