-- create table 'parameters'
CREATE TABLE public.parameters (
    id SERIAL PRIMARY KEY,
    weight FLOAT NOT NULL,
    growth FLOAT NOT NULL,
    activity_level INTEGER NOT NULL
);

-- create table 'user'
CREATE TABLE public.user (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    age INTEGER NOT NULL,
    creation_date TIMESTAMP NOT NULL DEFAULT now(),
    parameters_id INTEGER NOT NULL,
    CONSTRAINT fk_user_parameters FOREIGN KEY (parameters_id) REFERENCES public.parameters(id)
);