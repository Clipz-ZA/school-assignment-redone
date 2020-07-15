package mr.rob;

import java.util.Scanner;



public class Main{
    
    public static class student{
        int houseNum;
        String name;
        String houseName;
        String houseID;

        public int getHouseNum(student a) {
            return a.houseNum;
        }

        public void setHouseNum(int houseNum) {
            this.houseNum = houseNum;
        }

        public String getName(student a) {
            return a.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHouseName(student a) {
            return a.houseName;
        }

        public void setHouseName(String houseName) {
            this.houseName = houseName;
        }

        public String getHouseID(student a) {
            return a.houseID;
        }

        public void setHouseID(String houseID) {
            this.houseID = houseID;
        }
        
        
        
        
        
    }
    public static void generateHouseID(student a){
        
        int houseRes;
        
        a.setHouseNum((int) (Math.random()*9999));
        
        houseRes = (int) (Math.random()*2);
        
        switch (houseRes){
        
            case 0 :
                a.setHouseName("Blue");
                break;
            
            case 1 : 
                a.setHouseName("Red");
                break;
            
            case 2 : 
                a.setHouseName("White");
                break;
        
        }
        
        a.setHouseID(a.getHouseName(a)+a.getHouseNum(a)); 
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        student firstStudent = new student();
        student secondStudent = new student();
        student thirdStudent = new student();
        
        
        
        System.out.println("***********************************************");
        System.out.println("****************HOUSE GENERATOR****************");
        System.out.println("***********************************************");
        
        System.out.print("please insert the first students name>>");
        firstStudent.setName(input.next());
        
        System.out.print("please insert the second students name>>");
        secondStudent.setName(input.next());
   
        System.out.print("please insert the third students name>>");
        thirdStudent.setName(input.next());
       
        
        
        System.out.println("***********************************************");
        System.out.println("****************HOUSE GENERATOR****************");
        System.out.println("***********************************************");
        
        generateHouseID(firstStudent);
        generateHouseID(secondStudent);
        generateHouseID(thirdStudent);
        
        System.out.println("");
        System.out.println(firstStudent.getName(firstStudent)+ " has been placed into the "+ firstStudent.getHouseName(firstStudent));
        System.out.println("this students house ID is: " + firstStudent.getHouseID(firstStudent));
        System.out.println("");
        
        System.out.println(secondStudent.getName(secondStudent)+" has been placed into the "+ secondStudent.getHouseName(secondStudent));
        System.out.println("this students house ID is: " + secondStudent.getHouseID(secondStudent));
        System.out.println("");
        
        System.out.println(thirdStudent.getName(thirdStudent)+" has been placed into the "+ thirdStudent.getHouseName(thirdStudent));
        System.out.println("this students house ID is: " + thirdStudent.getHouseID(thirdStudent));
        System.out.println("");
         
        
    }
    
}
