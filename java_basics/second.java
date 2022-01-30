class sec1{
    public static void main(String args[]){
        System.out.println("sec1->String args[]");
        main(4);
    }
    //we can have multiple main methods but with string args[] only one
    public static void main(String a){
        System.out.println("sec1->String a");
    }
    public static void main(int i){
        System.out.println("sec1->int i");
    }


}
class sec2{
    public static void main(String args[]){
        // we can have muliple main methods among different classes
        System.out.println("sec2");
        int num=1;
        System.out.println("Our number is "+num);
        //here num is converted to string and then concatinated to the other string

        // if(1){
        //     num++;
        // } -->is wrong because in java inside if() expression only boolean value can take place java does not consider 0 as false or non 0 as true.
    
        if(true){
            num++;
        }
        //num=num+1 < num+=1 < num++ order of efficency

        //int _ =6; -->invalid
        int __=6; // valid
        System.out.println(__);
        int $=6; //valid $ is not intended to use for general use
        //int 9a=0; -->invalid
        int a9=0; // valid
    }
}

// here if we directly run aur program by: java second.java ,then the main method of class sec1(which is present first in the program) will be called if it is present if not then it will throw error.

//you can compile class without having public static void main(String args[]),but cannot run that class.
/** this is documentation comment */ 