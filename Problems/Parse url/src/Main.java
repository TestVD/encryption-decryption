import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next();

        String[] parameters = url.split("\\?")[1].split("&");
        String password = "";

        for (String param: parameters) {
            String[] keyValue = param.split("=");
            if (keyValue.length == 1) {
                System.out.println(keyValue[0] + " : " + "not found");
            } else {
                System.out.println(param.split("=")[0] + " : " + param.split("=")[1]);
            }
            if (keyValue[0].equals("pass")) {
                password = keyValue[1];
            }
        }
        if (!password.isEmpty())
        System.out.println("password : " + password);
    }
}