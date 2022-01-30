// in Java,Source file is called -->Compilation unit.
//by convention,name of main class should match with file name
//Java is case sensitive

 class first{
    //class keyword is used to declare a new class.
    //in Java,all program activity occurs within class,so this is the reason that all java programs are object oriented.

    public static void main(String args[]){
        //java program begins execution by calling main()
        //main() is declared public because it must be calles by code from outside of this class when the program starts.
        //static allows main() to be called without having to instantiate a particular instance of class.This is necessary since main() is called by JVM before any objects are made.
        //note->java compiler will compile the classes that do not contain main() method,but java has no way to run these classes,java will report an error because it was unable to find main() method
        //String args[] is command line arguments.

        System.out.println("This is first java program");
        //System ->is predefined class that provides access to the system
        //out ->is the output stream that is connected to console
    }
}

/*
javac first.java -->compiles
java first --> interpreted
        
first.java is source file
first.class is class file or bytecode version of program ,which jvm will execute
after entering java classname ,it will automatically search this name in files which have .class extension
*/
//java supports three style of comments->single line,multiline,documentation
//for some types of program you don't need main() method at all,but most of the program will have main method.