
class FirstAddressExcercise {
    public static void main(String[] args) {
        System.out.println("First Java application");
        displayAddress();
    }
    public static void displayAddress(){
        System.out.println("Google LLC" + 
                            "\n1600 Amphitheatre Parkway" +
                            "\nMountain View, CA 94043" + 
                            "\nUnited States");
    }
}

/* 
1.What is the purpose of the main method in this program?
 - The main method is where the code/s are being executed and being run.
2.How does the displayAddress() method contribute to the overall output of the program?
 - The displayAddress() method is where the needed output is being written hence  when  called in the main program the code inside the method well be executed.
3. What would happen if you removed the System.out.println("First Java application"); line from the main method?
 - if the System.out.println("First Java application"); is removed it'll be not be outputted and itll not affect the code and the needed output because the output only wants the address of the phone brand address.
 */
