CREATE Table TechIndiaAuth(
Id INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(50) UNIQUE NOT NULL,
password VARCHAR(50)NOT NULL
);

INSERT INTO  TechIndiaAuth(Id,username,password)VALUES(101,'raja','12345');