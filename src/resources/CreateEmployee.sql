CREATE TABLE `saurabh`.`employee` (
  `employee_id` bigint NOT NULL AUTO_INCREMENT,
  `employee_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE INDEX `employee_id_UNIQUE` (`employee_id` ASC));
  