
# Portfolio CMS API

## Project Planning

## Database Design
### Tables
| users ||
|-|-|
|id | (PK) |
| username | Unique Key |
| email | Unique Key |
| password 
| phone_number
| first name | required |
| last name	| required |
| country
| description | optional |
| designation_id | required |
| user_role_id | Foreign Key |
| project_id | (FK) - one to many (1 user can have many projects) 
| is_deleted	| boolean |
| created_date
| updated_date
| token
<br>

| project |	table |
|-|-|
| id | Primary Key |
|user_id |	(FK) - one to one (1 project can only have one user)
|name	|	(required)
|description | (required)
|thumbnail link | (required)
|github link | (required) - code link
|project link | (required) - live link
|is_deleted	
|created_date
|updated_date
<br>

|skills||
|-|-|
|id |		(PK)
|name|
|logo_link|
|skill_type_id | (FK)
|is_deleted |
<br>

|skill_types||
|-|-|
|id	|	(PK)
|name|
<br>

|logs||
|-|-|
|id 	|	(PK)
|user_id |	(FK)
|username|
|comment|
<br>

|user_roles||
|-|-|
|id 	|	(PK)
|name |		(admin, subscriber, editor, author)

|designations||
|-|-|
|id|
|name|

## APIs - Spring Boot
#### 1. user
- GET    	(Get all the users) - available only for admin role
- GET    	(Get single user from database)
- POST   	(Create new user)
- PUT    	(Update the existing user)
- DELETE 	(Delete an existing user)
#### 2. project
- GET    	(Get all the projects of a specific user)
- GET    	(Get a specific project of a specific user)
- POST   	(Create a new project)
- PUT    	(Update an existing project)
- DELETE 	(Delete an existing project)
#### 3. skills
- GET		(Get all)
- GET		(Get specific)
- POST		(Create new)
- PUT		(Update existing)
- DELETE
#### 4. logs
- GET		(Get all logs)
- GET		(Get all logs of a specific user)
- GET		(Get all logs by DateTime)
- POST		(Create logs)
#### 5. user_roles
- GET		(Get all roles)
- GET		(Get a specific role)
- POST 		(Create a new role)
- PUT		(Update an existing role)
- DELETE 	(Delete an exiting role)

Bean(Project) -> Repository(Query) -> Service(Business logic) -> Controller(API defination)

Calling -
Controller -> Service -> Repository -> Bean