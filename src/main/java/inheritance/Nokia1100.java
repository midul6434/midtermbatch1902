package inheritance;

      /**
       * Make necessary changes to inherit PreNokia1100
       * Declare and assign value to a String instance variable called nameOfTheClass
       * Implement a method to add photo gallery photoGallery()
       * Create default constructor and a parameterized constructor with int x parameter
       * */


      public  class Nokia1100 extends PreNokia1100 {
          public Nokia1100(){
              System.out.println("This is the default constructor");

          }
        public  Nokia1100(int x ){

        }

         public static void main(String[] args) {

            Nokia1100 obj = new Nokia1100();

        obj.display();


         }
public void display() {
              super.makeCall();
              super.sendText();
              super.contractlist();
    System.out.println("this is for the future color display");



         }


      }
