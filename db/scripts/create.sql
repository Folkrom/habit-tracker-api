CREATE TABLE Habit (id SERIAL NOT NULL, name varchar(255) NOT NULL, description varchar(255) NOT NULL, createdAt timestamp NOT NULL, PRIMARY KEY (id));
CREATE TABLE HabitLog (id SERIAL NOT NULL, habitId int4 NOT NULL, "date" date NOT NULL, status varchar(255) NOT NULL, PRIMARY KEY (id));
CREATE TABLE HabitStatus (nombre varchar(255) NOT NULL);
COMMENT ON COLUMN HabitStatus.nombre IS 'Enum: COMPLETED, SKIPPED, PENDING';
CREATE TABLE Routine (id SERIAL NOT NULL, title varchar(255) NOT NULL, createdAt timestamp NOT NULL, PRIMARY KEY (id));
CREATE TABLE RoutineHabit (id SERIAL NOT NULL, routineId int4 NOT NULL, habitId int4 NOT NULL, "order" int4 NOT NULL, PRIMARY KEY (id));
ALTER TABLE HabitLog ADD CONSTRAINT FKHabitLog356749 FOREIGN KEY (habitId) REFERENCES Habit (id);
ALTER TABLE RoutineHabit ADD CONSTRAINT FKRoutineHab690691 FOREIGN KEY (routineId) REFERENCES Routine (id);
ALTER TABLE RoutineHabit ADD CONSTRAINT FKRoutineHab214204 FOREIGN KEY (habitId) REFERENCES Habit (id);
