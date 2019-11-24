INSERT INTO link (id , created_by ,creation_date,last_modified_by,last_modified_date , title , url) 
values(1,null, NOW(), null, NOW(),  'Getting Started with Spring Boot 2', 'https://www.danvega.dev/docs/spring-boot-2-docs/');

INSERT INTO comment (id, created_by ,creation_date,last_modified_by,last_modified_date , body, link_id)
values(1, null, NOW(), null, NOW(), 'wHAT AN AWESOME IDEA FOR A COURSE!', 1);