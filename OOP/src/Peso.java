public class Peso {
    private double grams;

    Peso(double weight, String units) {
        if (units.equals("lbs")) grams = weight / 0.0022;
        if (units.equals("oz")) grams = weight / 0.0353;
        if (units.equals("kg")) grams = weight * 1000;
        if (units.equals("g")) grams = weight;
    }

    double getPounds() {
        return grams * 0.002205;
    }

    double getOz() {
        return grams * 0.035274;
    }

    double getKg() {
        return grams / 1000;
    }

    double getGrams() {
        return grams;
    }
}
