package java17;

public class Switch {

    public static void main(String[] args) {

        switch (Role.USER) {
            case USER :
                System.out.println("USER");
                break;
            case ADMIN :
                System.out.println("ADMIN");
                break;
            default:
                System.out.println("default");
        }

        switch (Role.USER){
            case USER -> System.out.println("USER");
            case ADMIN -> System.out.println("ADMIN");
            default -> System.out.println("default");
        }

        String test = switch (Role.USER){
            case USER -> "USER";
            case ADMIN -> "ADMIN";
            default -> "default";
        };
        System.out.println(test);

    }
}
