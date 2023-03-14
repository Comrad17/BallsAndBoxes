import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // κατασκευάστε ένα χάρτινο κουτί box1 με διαστάσεις (1.2 x 1.3. x 1.8)
    Box box1 = new Box(1.2, 1.3, 1.8, "χάρτινο");

    // κατασκευάστε ένα ξύλινο κουτί box2 με διαστάσεις (2.2 x 2.3. x 2.5)
    Box box2 = new Box(2.2, 2.3, 2.5, "ξύλινο");

    // κατασκευάστε 3 κόκκινες μεταλλικές σφαίρες με βάρος 2.5 η κάθε μια
    Ball ballRM1 = new Ball("κόκκινη", "μεταλλική", 2.5);
    Ball ballRM2 = new Ball("κόκκινη", "μεταλλική", 2.5);
    Ball ballRM3 = new Ball("κόκκινη", "μεταλλική", 2.5);

    // κατασκευάστε 2 κόκκινες μεταλλικές σφαίρες με βάρος 1.5 η κάθε μια
    Ball ballRM4 = new Ball("κόκκινη", "μεταλλική", 1.5);
    Ball ballRM5 = new Ball("κόκκινη", "μεταλλική", 1.5);

    // κατασκευάστε 5 μαύρες πλαστικές σφαίρες με βάρος 0.5 η κάθε μια
    Ball ballBP1 = new Ball("μάυρη", "πλαστική", 0.5);
    Ball ballBP2 = new Ball("μάυρη", "πλαστική", 0.5);
    Ball ballBP3 = new Ball("μάυρη", "πλαστική", 0.5);
    Ball ballBP4 = new Ball("μάυρη", "πλαστική", 0.5);
    Ball ballBP5 = new Ball("μάυρη", "πλαστική", 0.5);

    // κατασκευάστε 5 άσπρες λαστιχένιες σφαίρες με βάρος 1.1 η κάθε μια
    Ball ballWL1 = new Ball("άσπρη", "λαστιχένια", 1.1);
    Ball ballWL2 = new Ball("άσπρη", "λαστιχένια", 1.1);
    Ball ballWL3 = new Ball("άσπρη", "λαστιχένια", 1.1);
    Ball ballWL4 = new Ball("άσπρη", "λαστιχένια", 1.1);
    Ball ballWL5 = new Ball("άσπρη", "λαστιχένια", 1.1);

    // Εισάγετε και τις 15 μπάλες σε έναν πίνακα/λίστα με όνομα myballs
    ArrayList<Ball> myballs = new ArrayList<>();
    myballs.add(ballRM1);
    myballs.add(ballRM2);
    myballs.add(ballRM3);
    myballs.add(ballRM4);
    myballs.add(ballRM5);
    myballs.add(ballBP1);
    myballs.add(ballBP2);
    myballs.add(ballBP3);
    myballs.add(ballBP4);
    myballs.add(ballBP5);
    myballs.add(ballWL1);
    myballs.add(ballWL2);
    myballs.add(ballWL3);
    myballs.add(ballWL4);
    myballs.add(ballWL5);

    /*
     * Με χρήση for σε αυτό
     * τον πίνακα/λίστα, βάλτε όλες τις κόκκινες μπάλες στο ξύλινο κουτί και
     * όλες τις λαστιχένιες και πλαστικές μπάλες στο χάρτινο κουτί
     */
    for (Ball b : myballs) {
      if ("κόκκινη".equals(b.getColor())) {
        box2.setContent(b);
      } else if ("λαστιχένια".equals(b.getMaterial())
          || "πλαστική".equals(b.getMaterial())) {
        box1.setContent(b);
      }
    }

    box1.printAll();
    box2.printAll();

    /*
     * Εκτυπώστε το βάρος του ξύλινου κουτιού και του χάρτινου κουτιού
     * αντίστοιχα
     */
    System.out.println("\nΤο βάρος του χάρτινου κουτιου είναι "
        + box1.getWeight());

    System.out.println("Το βάρος του ξύλινου κουτιου είναι "
        + box2.getWeight());

    /*
     * Απομακρύνετε τις 3 πρώτες μπάλες από το ξύλινο κουτί και εκτυπώστε το
     * βάρος του
     */
    box2.removeFirst3();
    System.out.println("Μετά της απομάκρυνσης 3 πρώτων μπάλων το βάρος του "
        + "ξύλινου κουτιου θα είναι "
        + box2.getWeight());

    /*
     * Στις άσπρες μπάλες στο χάρτινο κουτί αλλάξτε το χρώμα τους σε
     * κίτρινες
     */
    box1.changeColorByColor("άσπρη", "κίτρινη");

    System.out.println("\nΤο περιεχόμενο του χάρτινου κουτιου μετα την αλλα"
        + "γή \nμπάλων άσπρου χρώματος σε κίτρινο:");
    box1.printAll();

    /*
     * Απομακρύνετε όλες τις μπάλες από το χάρτινο κουτί με βάρος μεγαλύτερο
     * του 1.0
     */
    box1.removeAllMoreThanByWeight(1.0);

    System.out.println("\nΤο περιεχόμενο του χάρτινου κουτιου μετα την απο"
        + "μάκρυνση των μπάλων με βάρος\nμεγαλύτερο του 1.0");
    box1.printAll();

    /*
     * Εκτυπώστε τα χαρακτηριστικά όλων των μεταλλικών σφαιρών στο ξύλινο
     * κουτί.
     */
    System.out.println("\nΤα χαρακτηριστικά όλων των μεταλλικών σφαιρών στο"
        + " ξύλινο κουτί:");
    /*for (Ball b : box2.getContent()) {
      if ("μεταλλική".equals(b.getMaterial())) {
        b.printAll();
      }
    }*/
    for(int i = 0; i < box2.getContentSize(); i++){
      Ball b = box2.getContent(i);
      
    }
    /*
     * Αλλάξτε το χρώμα της σφαίρας στην πρώτη θέση του πίνακα content στο
     * ξύλινο κουτί, σε μπλε. Εκτυπώστε το αποτέλεσμα της προσπάθειας αυτής.
     */
    box2.changeColorByPosition(0, "μπλε");
    System.out.println("\nΜετα την αλλάγή χρώματος 1ης μπάλας σε μπλε");
    box2.printAll();

    /*
     * Απομακρύνεται όλες τις κόκκινες μεταλλικές σφαίρες από το ξύλινο
     * κουτί
     */
    for (int i = 0; i < box2.getContentSize(); i++) {
      Ball b = box2.getContent(i) ;
      if(b.getColor() == "κόκκινη" && b.getMaterial() == "μεταλλική") {
        b.setColor("μαύρη");
      }      
    }

    box2.removeAllByColor("μαύρη");

    
    System.out.println("\nΜετά από την απομάκρυνση τις κόκκινες μεταλλικές "
        + "σφαίρες από το ξύλινο κουτί");
    box2.printAll();
    box1.printAll();
  }
}
