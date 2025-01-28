import java.util.Random;

public class Randomquotegenerator {
    public static void main(String[] args) {
       
        String[] quotes = {
            "The only way to do great work is to love what you do.",
            "Success is not the key to happiness. Happiness is the key to success.",
            "In the middle of every difficulty lies opportunity.",
            "Don’t watch the clock; do what it does. Keep going.",
            "The best way to predict the future is to invent it.",
            "You miss 100% of the shots you don’t take.",
            "Believe you can and you're halfway there.",
            "Your time is limited, so don’t waste it living someone else’s life.",
            "If you want to lift yourself up, lift up someone else.",
            "It does not matter how slowly you go as long as you do not stop."
        };

        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);
        String randomQuote = quotes[randomIndex];

        
        System.out.println("Random Quote:");
        System.out.println(randomQuote);
    }
}
