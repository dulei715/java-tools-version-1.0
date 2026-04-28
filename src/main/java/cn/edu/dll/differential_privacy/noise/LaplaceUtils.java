package cn.edu.dll.differential_privacy.noise;

import org.apache.commons.math3.distribution.LaplaceDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

public class LaplaceUtils {
    private final LaplaceDistribution laplaceDistribution;

    public LaplaceUtils(double sensitivity, double epsilon) {
        this.laplaceDistribution = new LaplaceDistribution(0, sensitivity / epsilon);
    }
//    public LaplaceUtils(Long seed, double sensitivity, double epsilon) {
//        RandomGenerator randomGenerator = new Well19937c();
//        randomGenerator.setSeed(seed);
//        this.laplaceDistribution = new LaplaceDistribution(randomGenerator, 0, sensitivity / epsilon);
//    }

    public static double[] getLaplaceNoise(double sensitivity, double epsilon, int number){
        LaplaceDistribution laplaceDistribution = new LaplaceDistribution(0, sensitivity/epsilon);
        return laplaceDistribution.sample(number);
    }
//    public static double[] getLaplaceNoise(double sensitivity, double epsilon, int number, RandomGenerator randomGenerator){
//        LaplaceDistribution laplaceDistribution = new LaplaceDistribution(randomGenerator, 0, sensitivity/epsilon);
//        return laplaceDistribution.sample(number);
//    }

    public static double getLaplaceNoise(double sensitivity, double epsilon) {
        LaplaceDistribution laplaceDistribution = new LaplaceDistribution(0, sensitivity / epsilon);
        return laplaceDistribution.sample();
    }
//    public static double getLaplaceNoise(double sensitivity, double epsilon, RandomGenerator randomGenerator) {
//        LaplaceDistribution laplaceDistribution = new LaplaceDistribution(randomGenerator, 0, sensitivity / epsilon);
//        return laplaceDistribution.sample();
//    }

    public double[] getLaplaceNoise(int number) {
        return this.laplaceDistribution.sample(number);
    }

    public double getLaplaceNoise() {
        return this.laplaceDistribution.sample();
    }

}
