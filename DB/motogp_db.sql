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
  `team` VARCHAR(45) NULL,
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
INSERT INTO `rider` (`id`, `first_name`, `last_name`, `team`) VALUES (1, 'Valentino', 'Rossi', 'Yamaha');

COMMIT;

