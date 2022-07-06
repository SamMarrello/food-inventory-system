CREATE DATABASE inventory;

USE inventory;

CREATE TABLE warehouses(
	warehouseId INT PRIMARY KEY,
    w_name VARCHAR(255),
    w_location VARCHAR(255),
    w_firstNameContact VARCHAR(255),
    w_lastNameContact VARCHAR(255),
    w_phoneNumber INT
);

CREATE TABLE stores(
	storeId INT PRIMARY KEY,
    s_name VARCHAR(255),
    s_location VARCHAR(255),
    s_firstNameContact VARCHAR(255),
    s_lastNameContact VARCHAR(255),
    s_phoneNumber INT,
    specialization VARCHAR(255)
);

CREATE TABLE 
