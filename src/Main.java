public class Main {
    public static void main(String[] args) {
        //задание 1
        int age = 53;
        double b = 2.4;
        float c = 3.55f;
        var applesWeight = 8;
        long mosquitoesInTheAttic = 30213L;
        short tomatoes = 100;
        byte jokesInMyBrainForThisVeryMoment = 127;
        char credibility = 65526;
        boolean isAdult = age >= 18;
        System.out.println(isAdult);

        //задание 2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double overallWeight = firstBoxer + secondBoxer;
        double differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Общий вес боксеров - " + overallWeight + " кг");
        System.out.println("Разница в весе боксеров - " + differenceWeight + " кг");

        //задание 3
        var bananas = 5;
        var milk = 2;
        var icecream = 2;
        var rawEggs = 4;

        int bananasWeight = bananas * 80;
        int milkWeight = milk * 105;
        int icecreamWeight = icecream * 100;
        int eggsWeight = rawEggs * 70;
        System.out.println("Вес бананов - " + bananasWeight + " граммов");
        System.out.println("Вес молока - " + milkWeight + " граммов");
        System.out.println("Вес мороженого - " + icecreamWeight + " граммов");
        System.out.println("Вес яиц - " + eggsWeight + " граммов");

        int overallProductsWeight = bananasWeight + milkWeight + icecreamWeight + eggsWeight;
        System.out.println("Общий вес завтрака - " + overallProductsWeight + " граммов");
        int grPerKg = 1000;
        float weightKg = overallProductsWeight / (float)grPerKg;
        System.out.println("Общий вес завтрака в килограммах - " + weightKg + " кг");


        //задание 4
        int minimalWeightLoss = 250;
        int maximalWeightLoss = 500;
        int desirableWeightLossD1 = 7000;
        desirableWeightLossD1 = desirableWeightLossD1 / minimalWeightLoss;
        System.out.println("Количество дней, за которые спортсмен сбросит вес на 7 кг, если сбрасывает по 250 граммов в день - " + desirableWeightLossD1);
        int desirableWeightLossD2 = 7000;
        desirableWeightLossD2 = desirableWeightLossD2 / maximalWeightLoss;
        System.out.println("Количество дней, за которые спортсмен сбросит вес на 7 кг, если сбрасывает по 500 граммов в день - " + desirableWeightLossD2);

        double averageDays = (desirableWeightLossD1 + desirableWeightLossD2) / (2 * 1.0);
        System.out.println("В среднем для похудения на семь килограммов спортсмену понадобятся " + averageDays + " дней");

        //задание 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryMashaGain = (int) (salaryMasha + salaryMasha * 0.1);
        int salaryDenisGain = (int) (salaryDenis + salaryDenis * 0.1);
        int salaryKristinaGain = (int) (salaryKristina + salaryKristina * 0.1);
        System.out.println("Теперь годовой доход Маши составляет " + salaryMashaGain + " рублей");
        System.out.println("Теперь годовой доход Дениса составляет " + salaryDenisGain + " рублей");
        System.out.println("Теперь годовой доход Кристины составляет " + salaryKristinaGain + " рублей");

        int differenceMasha = (salaryMashaGain * 12)-(salaryMasha * 12); //894432 u 813120
        int differenceDenis = (salaryDenisGain * 12)-(salaryDenis * 12);
        int differenceKristina = (salaryKristinaGain * 12)-(salaryKristina * 12);
        System.out.println("Годовой доход Маши увеличился на " + differenceMasha + " рублей");
        System.out.println("Годовой доход Маши увеличился на " + differenceDenis + " рублей");
        System.out.println("Годовой доход Кристины увеличился на " + differenceKristina + " рублей");
    }
}