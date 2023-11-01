-- create table 'user'
CREATE TABLE public.user (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    age INT,
    weight FLOAT,
    growth FLOAT,
    activityLevel INT
);