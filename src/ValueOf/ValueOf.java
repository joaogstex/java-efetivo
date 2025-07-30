package ValueOf;

public class ValueOf {
    
    private Integer argument;

    public void ValueOfArgument() {
        String valueOfArgument = String.valueOf(this.argument);
        System.out.println(valueOfArgument);
        
        if(valueOfArgument instanceof String) {
            System.out.println("It's a string " + argument);
        }else {
            System.out.println("It's an integer");
        }
    }
    
    public void setArgument(Integer argument) {
        this.argument = argument;
    }
}

class RunApp {
    public static void main(String[] args) {
        ValueOf vo = new ValueOf();
        vo.setArgument(456);
        vo.ValueOfArgument();

    }
}