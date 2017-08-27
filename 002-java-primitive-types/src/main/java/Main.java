public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Again !!!");

        //8 bits 1 Byte
        byte byteMin = -128;
        byte byteMax = 127;

        // 16 bits 2 Bytes
        short shortMin = -32_768;
        short shortMax = 32_767;

        //32 bits 4 Bytes
        int intMin = -2_147_483_648;
        int intMax = 2_147_483_647;

        //64 bits 8 Bytes
        long longMin = -9_223_372_036_854_775_808L;
        long longMax = 9_223_372_036_854_775_807L;

        //32 bits 4 Bytes
        float floatMin = 1.4E-45F;
        float floatMax = 3.4028235E38F;

        //64 bits 8 Bytes
        double doubleMin = 4.9E-324;
        double doubleMax = 1.7976931348623157E308;


        System.out.println(" byte Min " + byteMin);
        System.out.println(" byte Max " + byteMax);

        System.out.println(" short Min " + shortMin);
        System.out.println(" short Max " + shortMax);

        System.out.println(" int Min " + intMin);
        System.out.println(" int Max " + intMax);

        System.out.println(" long Min " + longMin);
        System.out.println(" long Min " + longMin);

        System.out.println(" float Min " + floatMin);
        System.out.println(" float Max " + floatMax);

        System.out.println(" doubleMin " + doubleMin);
        System.out.println(" doubleMax " + doubleMax);

    }
}
