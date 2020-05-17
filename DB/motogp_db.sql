-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema motogp_db
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `motogp_db` ;

-- -----------------------------------------------------
-- Schema motogp_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `motogp_db` DEFAULT CHARACTER SET utf8 ;
USE `motogp_db` ;

-- -----------------------------------------------------
-- Table `rider`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rider` ;

CREATE TABLE IF NOT EXISTS `rider` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `age` INT NULL,
  `country` VARCHAR(45) NULL,
  `team` VARCHAR(45) NULL,
  `bike` VARCHAR(45) NULL,
  `first_gp_year` INT NULL,
  `wins` INT NULL,
  `podiums` INT NULL,
  `poles` INT NULL,
  `race_fastest_laps` INT NULL,
  `championships` INT NULL,
  `rider_number` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS motofan@localhost;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'motofan'@'localhost' IDENTIFIED BY 'motofan';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'motofan'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `rider`
-- -----------------------------------------------------
START TRANSACTION;
USE `motogp_db`;
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (1, 'Valentino', 'Rossi', 41, 'Italy', 'Monster Energy Yamaha', 'YZR-M1', 2000, 89, 198, 55, 76, 7, 46);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (2, 'Marc', 'Marquez', 27, 'Spain', 'Repsol Honda', 'RC213V', 2013, 56, 95, 62, 56, 6, 93);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (3, 'Andrea', 'Dovizioso', 34, 'Italy', 'Ducati Corse', 'Desmosedici GP', 2008, 14, 60, 7, 11, 0, 4);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (4, 'Alex', 'Rins', 24, 'Spain', 'Suzuki Ecstar', 'GSX-RR MotoGP', 2017, 2, 8, 0, 2, 0, 42);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (5, 'Maverick', 'Vinales', 25, 'Spain', 'Monster Energy Yamaha', 'YZR-M1', 2015, 7, 23, 9, 9, 0, 12);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (6, 'Alex', 'Marquez', 24, 'Spain', 'Repsol Honda', 'RC213V', 2020, 0, 0, 0, 0, 0, 73);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (7, 'Danilo', 'Petrucci', 29, 'Italy', 'Ducati Corse', 'Desmosedici GP', 2012, 1, 9, 0, 2, 0, 9);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (8, 'Joan', 'Mir', 22, 'Spain', 'Suzuki Ecstar', 'GSX-RR MotoGP', 2019, 0, 0, 0, 0, 0, 36);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (9, 'Franco', 'Morbidelli', 25, 'Italy', 'Patronas Yamaha SRT', 'YZR-M1', 2018, 0, 0, 0, 0, 0, 21);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (10, 'Cal', 'Crutchlow', 34, 'England', 'LCR Honda', 'RC213V', 2011, 3, 19, 4, 4, 0, 35);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (11, 'Jack', 'Miller', 25, 'Australia', 'Pramac Ducati', 'Desmosedici GP', 2015, 1, 6, 1, 1, 0, 43);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (12, 'Johann', 'Zarco', 29, 'France', 'Reale Avintia Ducati', 'Desmosedici GP', 2017, 0, 6, 4, 4, 0, 5);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (13, 'Fabio', 'Quartararo', 21, 'France', 'Petronas Yamaha SRT', 'YZR-M1', 2019, 0, 7, 6, 2, 0, 20);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (14, 'Takaaki', 'Nakagami', 28, 'Japan', 'LCR Honda', 'RC213V', 2018, 0, 0, 0, 0, 0, 30);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (15, 'Francesco', 'Bagnaia', 23, 'Italy', 'Pramac Ducati', 'Desmosedici GP', 2019, 0, 0, 0, 0, 0, 63);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (16, 'Tito', 'Rabat', 30, 'Spain', 'Reale Avintia Ducati', 'Desmosedici GP', 2016, 0, 0, 0, 0, 0, 53);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (17, 'Pol', 'Espargaro', 28, 'Spain', 'Red Bull KTM', 'RC16', 2014, 0, 1, 0, 0, 0, 44);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (18, 'Miguel', 'Oliveira', 25, 'Portugal', 'Red Bull KTM Tech3', 'RC16', 2019, 0, 0, 0, 0, 0, 88);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (19, 'Brad', 'Binder', 24, 'South Africa', 'Red Bull KTM', 'RC16', 2020, 0, 0, 0, 0, 0, 33);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (20, 'Iker', 'Lecuona', 20, 'Spain', 'Red Bull KTM Tech3', 'RC16', 2019, 0, 0, 0, 0, 0, 27);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (21, 'Aleix', 'Espargaro', 30, 'Spain', 'Aprilia Team Gresini', 'RS-GP', 2009, 0, 1, 2, 0, 0, 41);
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `age`, `country`, `team`, `bike`, `first_gp_year`, `wins`, `podiums`, `poles`, `race_fastest_laps`, `championships`, `rider_number`) VALUES (22, 'Andrea', 'Iannone', 30, 'Italy', 'Aprilia Team Gresini', 'RS-GP', 2013, 1, 11, 2, 3, 0, 29);

COMMIT;

