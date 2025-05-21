class TemperatureConverter {

    
    double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    
    double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
	
	public static void main(String[] args){
		TemperatureConverter converter = new TemperatureConverter();
		System.out.println("30 Celsius to Fahrenheit: " + converter.toFahrenheit(30));
		System.out.println("86 Fahrenheit to Celsius: " + converter.toCelsius(86));
	}
}
