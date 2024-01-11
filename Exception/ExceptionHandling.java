package com.test;

/*
   To understand Exception first understand Problem
   
   There are two type of problem should be occur while developing any application 
   1) Inside Application  (Exception )
   2) Outside Application (Resources Memory related or CPU fault)
   
   Throwable class having two sublcasses 
   1) Exception --> IOException , SQLException, ClassNotFoundException, RuntimeException
   2) Error--> StackOverflow Error, VirtualMachine Error , OutOfMemoryError
   
   
   First understand Error 
   ****************************************************************************
   1) StackOverflowError --> When stack memory full then this error occur
   2) OutOfMemoryError --> When Heap memory is full then this error  is occur
   
   
   Exception 
   ********************************************************************************
   1)IOException : Input/output exception,  when we are performing input and output operation
                   then this Exception may be occured 
                   Example: reading File 
                      FileReader("file1.txt"); suppose file1.txt not exits then this exception
                       occur 
                       
   2)SQLException : When we are performing operation on SQL then this error occur.
   
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM TableName WHERE); // Syntax error

                    here SQL syntax error hence we got SQLException
                    
   3)ClassNotFoundException : During classloading the JVM look .class file for specific location 
                              so if the .class file is not found on that location then 
                              this exception is throw     
                              
   4)RunTimeException : Exception throw at runtime 
                       -- ArithmeticException, NullPointerException , NumberFormatException,
                          IndexOutOfBoundException
                          
     Runtime Exception 
     ************************************************************************************
     1) ArithmeticException : n/0; 
     2) NullPointerException : When you are trying to call method of null object 
                               String str=null;
                               str.toCharArray(); 
    
                                                                                          
     3)NumberFormatException : Integer.parseInt("string");//double convert into int but you pass string value
     
     4)IndexOutOfBoundException :  trying to access out of index array block 
     
                                  int array[]={1,2,3,4,5}
                                  array[5];//ArrayIndexOutOfBoundException
                    
                    
 */

public class ExceptionHandling {
	
	public static void main(String[] args) {
        // This will cause a StackOverflowError
        recursiveMethod();
    }

    private static void recursiveMethod() {
        recursiveMethod();
    }

}
