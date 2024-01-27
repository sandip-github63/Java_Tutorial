package com.test;

/* SQL All Interview Question Preparation 
   *******************************************************************
 * 
 * Type of Join 
 * ************
 * 1) Natural Join
 * 2) Inner Join
 * 3) Left outer join
 * 4) right outer join
 * 5) full join
 * 
 * Note : Join 
 * **************************************
 * Join means crossproduct+some condition 
 *            
 * simplify : crossproduct = table1,table2
 *            some condition = where table1.col=table2=col;
 *            
 * 1) Natural Join
 * ************************************************************************
 * Natural join says that make two table common attribute equals 
 * 
 * Note: When you apply natural join then the SQL engine automatically equal two 
 *       table's same attribute 
 *       
 * Basic Query for join: select * from table1,table2 where table1.col=table2.col;          
 *            
 * Query for natural :  select * from table1 natural join table2;  
 * 
 * 2) Inner join 
 * ****************************************************************************
 *  The INNER JOIN keyword returns only rows with a match in both tables.
 *  
 *  Inner Join = common rows or matching rows from both tables.
 *  
 *  Query : select * from table1 inner join table2 on table1.col=table2.col;
 *  
 * 3) Left outer join
 * *****************************************************************************
 * The left outer join return left table all rows and right table's only matching rows
 * 
 * left outer join= matching rows from both tables + left table all rows 
 * 
 * Query : select * from table1 left outer join table2 on table1.col=table2.col;
 * 
 * 4) Right Outer Join
 * *****************************************************************************
 * 
 * Right outer join= matching rows+ right table rows 
 * 
 * Query : select * from table1 right outer join table2 on table1.col=table2.col;
 *  
 * 5) Full Outer join
 * *****************************************************************************
 * 
 * Full outer join =Matching rows + left table rows + right table rows
 * 
 * Query : select * from table1 full outer join table2 on table1.col=table2.col;
 * 
 * 
 * Aggregate Function in SQL
 * *******************************************************************************
 * MIN() , MAX() , AVG(), COUNT() , SUM()
 * 
 * Note: you can pass two ways either * or column name in Aggregate Function
 *        *   --> row 
 *        column  --> specific column 
 *        
 *        Difference : suppose there are 4 rows and column in name and suppose 
 *                     name column having only 3 record and 1 is null stored 
 *                     then if you use count(*) then it return 4 because total rows is 4
 *                     but if you use count(name) then it return 3 because null is not counted
 *                     
 *                        
 * 
 * Keyword in SQL
 * ************************************************************************************
 * distinct keyword --> it return unique value 
 * 
 *  select max(distinct salary) from table1;
 *  
 *  Syntax : distinct column name..
 *  
 * Order By 
 * *******************************************************************************
 * order rows in asc or desc order 
 
 * 
    Find second largest salary of emp
    
    select salary from emp order by salary desc limit 1,1;
    
 * note : order by always place at last of query
 * 
 * select * from table1 order by column desc;
 * 
 * 
 * Group By 
 * *******************************************************************************
 * Grouping similar value or castes so that you can perform operation very easily;
 * 
 * Fact about Group By
 * 
 * a) you can select that column only whose apply with group by if you try to select 
 *    another column then sql return error.
 *    
 *    example: 
 *             select salary from table1 group by salary; --correct 
 *             
 *             select name from table1 group by salary; -- wrong
 *             
 *              you can only that column which is perform with group by .
 *              
 *              
 *  b) if you want to use another column then you have to use aggregate function 
 *  
 *       example :  select count(name) from table1 group by salary;
 
 *  c) Having clause is introduced because of group by because it is not comfortable
 *      with where clause
 *  
 *  SELECT *
      FROM department
         WHERE emp_name = (SELECT empname FROM emp WHERE emp_id = 5);
        
 *      
 *  Question : find the total employee whose working in a department
 *  
 *      select count(*) as total_employee from table1 group by deptname;
 *      
 *      
 * Having clauses 
 * *************************************************************************
 * it is introduced for group by . it is similar as where clause but it run with group by
 * it check condition of each grouping value;
 * 
 * it follow the principal of group by means that it must be take that column whose
 * taken by group by for condition or it can take aggregate function for different column
 * if it taken different column without aggregate function then return error.
 * 
 * Example :
 *          ques :  find the department which having atleast 5 employee;
 *             
 *          query : select department_name from Emp group by department_name having count(*)>=5;  
 *      
 *    
 *  note : Difference between Having and Where 
 *    where : it apply for entire table's rows not grouping 
 *            it take any table's column name for perform operation ;
 *            
 *    having : it apply for grouping table's rows not entire row  
 *             it must take only group by's operated column or aggregate function for 
 *             different column of table.
 *             
 * 
 *             
 *  SubQuery
 *  ************************************************************************
 *  
 *   SELECT *
      FROM department
               WHERE emp_name = (SELECT empname FROM emp WHERE emp_id = 5);
               
       inner query executed first then outer query execute 
 * 
 * 
 * 
 * Correlated nested query
 * ******************************************************************************
 * Principal --> inner query must take one column from outerquery table for operation perform.
 * executing flow: outer query execute first then inner query execute 
 * 
 *  example:
 *   
 *   select * from table1 where EXISTS (select * from table1 where table1.col=table2.col); 
 *
 * 
 * 
 * 
 * Normalization 
 * ******************************************
 * 1) 1NF-> a column should not contain multi valued attribute
 *          example : course --> c/c++
 *          
 * 2) 2NF-> A table should not follow Partial dependency 
 *          means when a subset of prime attribute follow non prime attribute .
 *          
 *          means that --> in a country having BJP and congress 
 *                         so some people follow BJP and some follow Congress 
 *                         to represent a country all people you have to combine both BJP and Congress
 *                         
 *                         but if BJP identify all people of indian then it said to be Partial dependency
 *   
 *                         that should not be in 2NF.
 *                         
 *3) 3NF -> There should not be the transitive dependency
 *         A->B
 *         B->C
 *         
 *         when a non prime attribute identify non prime attribute then this is called 
 *         transitive dependency
 *      
 * ACID property 
 * ************************************************************************************
 * Automitcity --> either all neither non.
 *                 if transtion is failure during 99.9% then rollback the transaction 
 *                 and restart.
 *                 
 * Consistency --> Before start the transaction and after complete the transaction 
 *                 sum of amount should be equal.
 *                 
 *               example:
 *                        A                                  B
 *                        2000                              1000
 *                        
 *                     now A transfer money to B
 *                     
 *                      Before Transaction sum of money 2000 + 1000 =3000
 *                      After the Transaction sum of money let A send 1000 to B account
 *                                                      1000+ 2000 =3000
 *                       
 *                      Both are equals
 *  
 *                                                        
 *  Isolation -> convert parallel scheduling to serial scheduling 
 *  
 *               means if multiple transaction happing the same time then first 
 *               completed first transaction then move to second transaction 
 *               
 *   
 *  Durability-> The transaction should be committed for permanently 
 *               if A send 1000 to B account then the transaction should be for 
 *               Permanent . This is not happing that  next day B told i did not 
 *               received amout. 
 *               
 *               RAM to HardDisk Parmanent store.
 *          
 */

public class SQL {
	
}
