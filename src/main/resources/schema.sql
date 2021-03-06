DROP TABLE IF EXISTS USERS;
DROP TABLE IF EXISTS USERS_DETAILS;
DROP TABLE IF EXISTS TODO_DEATILS;

CREATE TABLE USERS (
  id INTEGER AUTO_INCREMENT  PRIMARY KEY,
  user_name VARCHAR(250) NOT NULL Unique,
  password VARCHAR(250) NOT NULL,
  enabled INTEGER(4) DEFAULT NULL
  
);

CREATE TABLE ROLES (
  role_id INTEGER(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(45) NOT NULL
  
);
 
CREATE TABLE USERS_ROLES (
  user_id INTEGER NOT NULL,
  role_id INTEGER(11) NOT NULL,
  FOREIGN KEY (user_id) REFERENCES USERS(id),
  FOREIGN KEY (role_id) REFERENCES ROLES(role_id)
);


CREATE TABLE USERS_DETAILS (
  user_id INTEGER AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  phone VARCHAR(250) NOT NULL,
  login_id INTEGER NOT NULL,
  FOREIGN KEY (login_id) REFERENCES USERS(id)
);


CREATE TABLE TODO_DEATILS (
  task_id INT AUTO_INCREMENT  PRIMARY KEY,
  summary VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  last_modified_date DATE NOT NULL,
  user_id INTEGER NOT NULL,
  FOREIGN KEY (user_id) REFERENCES USERS_DETAILS(user_id)
  
);

