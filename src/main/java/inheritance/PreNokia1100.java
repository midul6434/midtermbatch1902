package inheritance;

public abstract class PreNokia1100 implements SymbianPhone {
    public PreNokia1100(){
        super();
    }

    /**
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     * <p>
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     */

    public void sendText() {
        System.out.println("you can text your bestfriend now");
    }

    public void makeCall() {
        System.out.println("you can call to your mom ");
    }

    public void contractlist() {
        System.out.println("You can see all the people's num");

    }

    public abstract void display();




}