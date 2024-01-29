package Leetcode_2401_2500.Leetcode_2469;

class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
}