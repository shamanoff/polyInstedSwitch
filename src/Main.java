public class Main {

    public static void main(String[] args) {
        System.out.println("Start");
        int f = 2;
        int s = 5;
        int res;
        int res2;
        Math mathA = new Addition();
        Math mathS = new Subtraction();
        res = mathA.calculate(f, s);
        res2 = mathS.calculate(f, s);
        System.out.println(res);
        System.out.println(res2);


    }
}
