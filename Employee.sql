CREATE DATABASE RamJ2EE;

DROP TABLE IF EXISTS `Employee`;

USE `RamJ2EE`;

CREATE TABLE `Employee` (
  `Employee_Id` int(32) NOT NULL,
  `Name` varchar(32) default NULL,
  `Age` int(32) default NULL,
  PRIMARY KEY  (`Employee_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SELECT * FROM Employee