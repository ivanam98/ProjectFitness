INSERT INTO FITNESS_CENTAR(ID, ADDRESS, DELETED, EMAIL, NAME, PHONE_NUMBER) VALUES (-1, 'Petra Petrovica 1', 0, 'petrovic@centar.com', 'Fitnes Centar Petrovic', '011345654')
INSERT INTO FITNESS_CENTAR(ID, ADDRESS, DELETED, EMAIL, NAME, PHONE_NUMBER) VALUES (-2, 'Kneza Milosa 12', 0, 'markovic@centar.com', 'Fitnes Centar Markovic', '01121313')
INSERT INTO FITNESS_CENTAR(ID, ADDRESS, DELETED, EMAIL, NAME, PHONE_NUMBER) VALUES (-3, 'Bulevar Oslobodjenja 1', 0, 'jovanovic@centar.com', 'Fitnes Jovanovic 1', '011897128')



INSERT INTO USER(USER_ROLE, ID,ACTIVE,DATE_OF_BIRTH, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, PHONE_NUMBER, USER_TYPE, USERNAME)  VALUES('member_user', -1,1, '1995-01-12' , 'marko@test.com','Marko','Markovic','$2a$10$Bhbe5Azsb1wOUnTXJMfnrO8Ou2kCrBDI4AQDwTOEm5MxG/0YtmtzG','0651234567',0,'marko')
INSERT INTO USER(USER_ROLE, ID,ACTIVE,DATE_OF_BIRTH, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, PHONE_NUMBER, USER_TYPE, USERNAME)  VALUES('member_user', -2,0, '1996-03-11' , 'nikola@test.com','Nikola','Nikolic','$2a$10$Bhbe5Azsb1wOUnTXJMfnrO8Ou2kCrBDI4AQDwTOEm5MxG/0YtmtzG','0643216789',0,'nikola')
INSERT INTO USER(USER_ROLE, ID,ACTIVE,DATE_OF_BIRTH, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, PHONE_NUMBER, USER_TYPE, USERNAME)  VALUES('member_user', -3,0, '1993-02-09' , 'irena@test.com','Irena','Irenovic','$2a$10$Bhbe5Azsb1wOUnTXJMfnrO8Ou2kCrBDI4AQDwTOEm5MxG/0YtmtzG','063364832',0,'irena')

INSERT INTO USER(USER_ROLE, ID,ACTIVE,DATE_OF_BIRTH, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, PHONE_NUMBER, USER_TYPE, USERNAME, FITNESS_CENTAR_ID)  VALUES('coach_user', -4,1, '1997-06-12' , 'petar@trener.com','Petar','Petrovic','$2a$10$Bhbe5Azsb1wOUnTXJMfnrO8Ou2kCrBDI4AQDwTOEm5MxG/0YtmtzG','01234456',1,'petar', -1)
INSERT INTO USER(USER_ROLE, ID,ACTIVE,DATE_OF_BIRTH, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, PHONE_NUMBER, USER_TYPE, USERNAME, FITNESS_CENTAR_ID)  VALUES('coach_user', -5,1, '1993-06-12' , 'marijana@trener.com','Marijana','Djurdjic','$2a$10$Bhbe5Azsb1wOUnTXJMfnrO8Ou2kCrBDI4AQDwTOEm5MxG/0YtmtzG','01234456',1,'marijana', -2)

INSERT INTO USER(USER_ROLE, ID,ACTIVE,DATE_OF_BIRTH, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, PHONE_NUMBER, USER_TYPE, USERNAME)  VALUES('admin_user', -6,1, '1990-04-12' , 'admin@fitness.com','Milan','Gajic','$2a$10$Bhbe5Azsb1wOUnTXJMfnrO8Ou2kCrBDI4AQDwTOEm5MxG/0YtmtzG','01234456',2,'admin')


INSERT INTO FITNESS_CENTAR_COACHES(FITNESS_CENTAR_ID, COACHES_ID) VALUES (-1, -4)
INSERT INTO FITNESS_CENTAR_COACHES(FITNESS_CENTAR_ID, COACHES_ID) VALUES (-2, -5)

INSERT INTO HALL(ID, CAPACITY, DELETED, NAME, FITNESS_CENTAR_ID) VALUES (-1, 20, 0, 'SALA 1', -1)
INSERT INTO HALL(ID, CAPACITY, DELETED, NAME, FITNESS_CENTAR_ID) VALUES (-2, 15, 0, 'SALA 2', -1)
INSERT INTO HALL(ID, CAPACITY, DELETED, NAME, FITNESS_CENTAR_ID) VALUES (-3, 16, 0, 'SALA 3', -1)
INSERT INTO HALL(ID, CAPACITY, DELETED, NAME, FITNESS_CENTAR_ID) VALUES (-4, 25, 0, 'SALA 1', -2)
INSERT INTO HALL(ID, CAPACITY, DELETED, NAME, FITNESS_CENTAR_ID) VALUES (-5, 10, 0, 'SALA 2', -2)
INSERT INTO HALL(ID, CAPACITY, DELETED, NAME, FITNESS_CENTAR_ID) VALUES (-6, 12, 0, 'SALA 3', -2)
INSERT INTO HALL(ID, CAPACITY, DELETED, NAME, FITNESS_CENTAR_ID) VALUES (-7, 30, 0, 'SALA 1', -3)
INSERT INTO HALL(ID, CAPACITY, DELETED, NAME, FITNESS_CENTAR_ID) VALUES (-8, 25, 0, 'SALA 2', -3)

INSERT INTO FITNESS_CENTAR_HALLS (FITNESS_CENTAR_ID, HALLS_ID) VALUES (-1, -1)
INSERT INTO FITNESS_CENTAR_HALLS (FITNESS_CENTAR_ID, HALLS_ID) VALUES (-1, -2)
INSERT INTO FITNESS_CENTAR_HALLS (FITNESS_CENTAR_ID, HALLS_ID) VALUES (-1, -3)
INSERT INTO FITNESS_CENTAR_HALLS (FITNESS_CENTAR_ID, HALLS_ID) VALUES (-2, -4)
INSERT INTO FITNESS_CENTAR_HALLS (FITNESS_CENTAR_ID, HALLS_ID) VALUES (-2, -5)
INSERT INTO FITNESS_CENTAR_HALLS (FITNESS_CENTAR_ID, HALLS_ID) VALUES (-2, -6)
INSERT INTO FITNESS_CENTAR_HALLS (FITNESS_CENTAR_ID, HALLS_ID) VALUES (-3, -7)
INSERT INTO FITNESS_CENTAR_HALLS (FITNESS_CENTAR_ID, HALLS_ID) VALUES (-3, -8)


INSERT INTO WORKOUT(ID, DESCRIPTION, DURATION, NAME, TYPE_OF_WORKOUT) VALUES(-1, 'Ovo je kardio trening', 60, 'Kardio trening', 'KARDIO')
INSERT INTO WORKOUT(ID, DESCRIPTION, DURATION, NAME, TYPE_OF_WORKOUT) VALUES(-2, 'Ovo je trening snage', 60, 'Trening snage', 'SNAGA')
INSERT INTO WORKOUT(ID, DESCRIPTION, DURATION, NAME, TYPE_OF_WORKOUT) VALUES(-3, 'Ovo grupni trening', 60, 'Grupni trening', 'GRUPNI')
INSERT INTO WORKOUT(ID, DESCRIPTION, DURATION, NAME, TYPE_OF_WORKOUT) VALUES(-4, 'Ovo je trening aerobik', 60, 'Trening aerobika', 'AEROBIK')
INSERT INTO WORKOUT(ID, DESCRIPTION, DURATION, NAME, TYPE_OF_WORKOUT) VALUES(-5, 'Trening boksa', 60, 'Trening boksa', 'BOKS')

INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-1, '2021-02-20T12:00:00', 12, 250.0, -4, -1,-1)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-2, '2021-03-03T13:00:00', 15, 200.0, -4, -3,-2)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-3, '2021-07-11T14:00:00', 10, 400.0, -4, -2,-3)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-4, '2021-07-21T20:00:00', 3, 200.0, -4, -4,-2)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-5, '2021-08-23T17:00:00', 5, 250.0, -5, -7,-4)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-6, '2021-07-25T21:00:00', 2, 400.0, -5, -8,-4)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-7, '2021-01-20T21:00:00', 12, 250.0, -4, -1,-1)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-8, '2021-02-04T20:00:00', 15, 200.0, -4, -3,-2)

INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-9, '2021-07-22T13:00:00', 12, 250.0, -4, -1,-1)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-10, '2021-07-21T12:00:00', 12, 250.0, -4, -1,-1)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-11, '2021-07-20T14:00:00', 12, 250.0, -4, -1,-1)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-12, '2021-08-20T12:00:00', 12, 250.0, -4, -1,-1)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-13, '2021-08-20T12:00:00', 12, 250.0, -4, -1,-1)
INSERT INTO SCHEDULED_WORKOUT(ID, DATE_TIME, MEMBERS_COUNT, PRICE, COACH_ID, HALL_ID, WORKOUT_ID) VALUES (-14, '2021-08-20T12:00:00', 12, 250.0, -4, -1,-1)


INSERT INTO FITNESS_CENTAR_SCHEDULED_WORKOUTS(FITNESS_CENTAR_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1, -1)
INSERT INTO FITNESS_CENTAR_SCHEDULED_WORKOUTS(FITNESS_CENTAR_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1, -2)
INSERT INTO FITNESS_CENTAR_SCHEDULED_WORKOUTS(FITNESS_CENTAR_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1, -7)
INSERT INTO FITNESS_CENTAR_SCHEDULED_WORKOUTS(FITNESS_CENTAR_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1, -8)
INSERT INTO FITNESS_CENTAR_SCHEDULED_WORKOUTS(FITNESS_CENTAR_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1, -3)
INSERT INTO FITNESS_CENTAR_SCHEDULED_WORKOUTS(FITNESS_CENTAR_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1, -4)
INSERT INTO FITNESS_CENTAR_SCHEDULED_WORKOUTS(FITNESS_CENTAR_ID, SCHEDULED_WORKOUTS_ID) VALUES (-2, -5)
INSERT INTO FITNESS_CENTAR_SCHEDULED_WORKOUTS(FITNESS_CENTAR_ID, SCHEDULED_WORKOUTS_ID) VALUES (-2, -6)

INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1,-1)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-3,-2)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-2,-3)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-4,-4)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1,-7)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-3,-8)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-7,-5)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-8,-6)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1,-9)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1,-10)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1,-11)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1,-12)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1,-13)
INSERT INTO HALL_SCHEDULED_WORKOUTS(HALL_ID, SCHEDULED_WORKOUTS_ID) VALUES (-1,-14)

INSERT INTO USER_DONE_WORKOUTS (MEMBER_ID, DONE_WORKOUTS_ID) VALUES (-1, -1)
INSERT INTO USER_DONE_WORKOUTS (MEMBER_ID, DONE_WORKOUTS_ID) VALUES (-1, -2)
INSERT INTO USER_DONE_WORKOUTS (MEMBER_ID, DONE_WORKOUTS_ID) VALUES (-1, -7)
INSERT INTO USER_DONE_WORKOUTS (MEMBER_ID, DONE_WORKOUTS_ID) VALUES (-1, -8)
INSERT INTO USER_CHECK_IN_WORKOUT (MEMBER_ID, CHECK_IN_WORKOUT_ID) VALUES (-1, -4)