public class ComputingUnitConverter {
    private double dataBits;

    ComputingUnitConverter(double data, String units) {
        if(units.equals("1")) dataBits = data;
        if(units.equals("2")) dataBits = data * 8;
        if(units.equals("3")) dataBits = data * 1000;
        if(units.equals("4")) dataBits = data * 1000000;
        if(units.equals("5")) dataBits = data * 1000000000;
        if(units.equals("6")) dataBits = data * 1048576;
    }

    public double getBits() {
        return dataBits;
    }

    public double getBytes() {
        return dataBits / 8;
    }

    public double getKBits() {
        return dataBits / 1000;
    }

    public double getMBits() {
        return dataBits / 1000000;
    }

    public double getGBits() {
        return dataBits / 1000000000;
    }

    public double getMiB() {
        return dataBits / 1048576;
    }
}
