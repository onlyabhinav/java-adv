
MYSQL 

HOW to enable Remote SQL connection 
=================================================================



Server version: 8.0.19 MySQL Community Server - GPL

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.


mysql> CREATE USER 'abhinav'@'localhost' IDENTIFIED BY 'some_pass';
Query OK, 0 rows affected (0.76 sec)

mysql> GRANT ALL PRIVILEGES ON *.* TO 'abhinav'@'localhost' WITH GRANT OPTION;
Query OK, 0 rows affected (0.75 sec)

mysql> CREATE USER 'abhinav'@'%' IDENTIFIED BY 'some_pass';
Query OK, 0 rows affected (0.16 sec)

mysql> GRANT ALL PRIVILEGES ON *.* TO 'abhinav'@'%' WITH GRANT OPTION;        --- % wild card for all hosts
                                                                              --- 10.0.%.%  for filters
Query OK, 0 rows affected (1.61 sec)

mysql>
