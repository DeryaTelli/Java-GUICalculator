import java.awt.*;

public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    Calculator c=new Calculator();
                    c.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

}