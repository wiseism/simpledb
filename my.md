# my

```sql
create table STUDENT(SId int, SName varchar(10), MajorId int, GradYear int)
create table DEPT(DId int, DName varchar(8))
create table COURSE(CId int, Title varchar(20), DeptId int)
create table SECTION(SectId int, CourseId int, Prof varchar(8), YearOffered int)
create table ENROLL(EId int, StudentId int, SectionId int, Grade varchar(2))
```


```shell
9:12:27: Executing ':simpleclient:simpleclient.SimpleIJ.main()'…

> Task :simpleclient:processResources NO-SOURCE
> Task :simpledb:compileJava UP-TO-DATE
> Task :simpledb:processResources NO-SOURCE
> Task :simpledb:classes UP-TO-DATE
> Task :simpledb:jar
> Task :simpleclient:compileJava
> Task :simpleclient:classes

> Task :simpleclient:simpleclient.SimpleIJ.main()
Connect> 
create table STUDENT(SId int, SName varchar(10), MajorId int, GradYear int)
create table DEPT(DId int, DName varchar(8))
create table COURSE(CId int, Title varchar(20), DeptId int)
create table SECTION(SectId int, CourseId int, Prof varchar(8), YearOffered int)
create table ENROLL(EId int, StudentId int, SectionId int, Grade varchar(2))creating new database
transaction 1 committed

SQL> transaction 2 committed
0 records processed

SQL> transaction 3 committed
0 records processed

SQL> transaction 4 committed
0 records processed

SQL> exit();
transaction 6 committed

BUILD SUCCESSFUL in 3m 47s
4 actionable tasks: 3 executed, 1 up-to-date
```