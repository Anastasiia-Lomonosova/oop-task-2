public class Main {
    public static void main(String[] args) {
        Bmiservice service = new Bmiservice();
        double weightKg = 90;
        double highM = 1.72;
        int bmi = (int) service.calculate(weightKg, highM);

        System.out.println("ИМТ=" + bmi);
    }
}