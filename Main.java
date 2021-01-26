public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float result = service.calculate(79 , 173);
        System.out.println(result);

        result = service.calculate(101 , 179);
        System.out.println(result);
    }

}
