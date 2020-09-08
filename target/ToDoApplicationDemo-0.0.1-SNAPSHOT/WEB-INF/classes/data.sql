insert into USERS (user_name , password, enabled )  values ('test' , '$2y$12$UYQPS0.DbXfIfV/LrANoM.L38fK0W4vG2kxwoIu6G1TAalJgOdB4O' , 1);

insert into USERS_DETAILS (first_name , last_name, phone, login_id )  values ('test' , 'test', '12345678', 1);



INSERT INTO ROLES (name) VALUES ('USER');
INSERT INTO ROLES (name) VALUES ('ADMIN');


INSERT INTO USERS_ROLES (user_id, role_id) VALUES (1, 1);

