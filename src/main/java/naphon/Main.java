package naphon;

import java.util.Arrays;
import naphon.ai.regressions.LinearRegression;
import naphon.ai.ai.exceptions.AIException;
public class Main {
    public static void main(String[] args) {
        LinearRegression lr = new LinearRegression();
        try {
            lr.train(Arrays.asList(199.9, 169.9, 177.7,130.3,141.1,147.7,155.5,160.0,165.5,170.0,175.5,180.8,185.5,195.5,210.5,115.5,122.2,129.8,134.4,170.5,176.6,174.03,167.0,168.8,170.7,140.1,144.4,147.5,152.2,157.7,175.5,168.8),
                    Arrays.asList(103.5, 75.0, 83.0,48.4,54.4,58.9,62.4,67.7,72.2,77.2,87.5,90.0,92.5,97.55,105.5,57.5,61.5,64.5,67.7,85.5,88.8,87.7,83.5,84.4,85.5,70.5,72.2,73.5,76.6,78.5,87.5,84.29));
        } catch (AIException e) {
            throw new RuntimeException(e);
        }
        double weightkey1 = lr.predict(171);
        System.out.println("weight " + weightkey1);
    }
}