public class NuPackCalculator {
    public String calculate(String base, String people, String type) {
        double price = Double.parseDouble(base.substring(base.indexOf('$')+1));
        price *= 1.05;
        
        double markup = 1;
        
        int numPeople = Integer.parseInt(people.substring(0, people.indexOf(' ')));
        markup += numPeople * 0.012;
        
        switch (type.toLowerCase()) {
            case "drugs":
                markup += 0.075;
                break;
            case "food":
                markup += 0.13;
                break;
            case "electronics":
                markup += 0.02;
                break;
            default:
                break;
        }
        
        price *= markup;
        
        String output = String.format("$%.2f", price);
        return output;
    }
}