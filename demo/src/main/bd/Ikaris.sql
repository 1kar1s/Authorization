CREATE DATABASE Ikaris
GO
USE Ikaris

CREATE TABLE users(
idusers int PRIMARY KEY IDENTITY,
firstname VARCHAR(45) NOT NULL,
lastname VARCHAR(45) NOT NULL,
username VARCHAR(45) NOT NULL,
password VARCHAR(45) NOT NULL,
location VARCHAR(45) NOT NULL,
gender VARCHAR(45) NOT NULL,
)