import java.util.ArrayList;

import java.util.Iterator;

public class Box {

  private double height;
  private double width;
  private double lenght;
  private String material;
  private ArrayList<Ball> content;
  private double weight;

  // κενός κατασκευαστής
  public Box() {
    weight = 0;
    content = new ArrayList<Ball>();
  }

  // πλήρης κατασκευαστής
  public Box(double lenght, double width, double height, String material) {
    this.height = height;
    this.width = width;
    this.lenght = lenght;
    this.material = material;
    weight = 0;
    content = new ArrayList<Ball>();
  }

  public int getContentSize(){
    return content.size();
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLenght() {
    return lenght;
  }

  public void setLenght(double lenght) {
    this.lenght = lenght;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public Ball getContent(int idx) {
    if (content.size() > 0) {
      return content.get(idx);
    } else {
      return null;
    }
  }

  public void setContent(Ball b) {
    content.add(b);
  }

  public double getWeight() {
    weight = 0;
    if (content.size() > 0) {
      for (Ball b : content) {
        this.weight += b.getWeight();
      }
    }
    return weight;
  }

  /* διαγράφει τα πρώτα 3 αντικείμενα στον πίνακα/λίστα content */
  public void removeFirst3() {
    if (content.size() > 0) {
      content.remove(0);
      content.remove(0);
      content.remove(0);
    }
  }

  /* διαγράφει όλα τα αντικείμενα από τον πίνακα/λίστα content */
  public void removeAll() {
    if (content.size() > 0) {
      content.removeAll(content);
    }
  }

  /*
   * διαγράφει όλα τα αντικείμενα από τον πίνακα/λίστα content, με κάποιο χρώμα
   * που θα δοθεί παραμετρικά
   */
  
  public void removeAllByColor(String colorOfBall) {
    if (!content.isEmpty()) {
      Iterator<Ball> itr = content.iterator();
      while (itr.hasNext()) {
        Ball b = itr.next();
        if (b.getColor().equals(colorOfBall)) {
          itr.remove();
        }
      }
    }
  }

  /*
   * επιστρέφει το πλήθος των αντικειμένων από τον πίνακα/ λίστα content, με
   * ανάλογο χρώμα σύμφωνα με κάποιο χρώμα που θα δοθεί παραμετρικά
   */
  public int getNumberByColor(String str) {
    int sumObj = 0;
    for (Ball b : content) {
      if (str.equals(b.getColor())) {
        sumObj++;
      }
    }
    return sumObj;
  }

  /*
   * – διαγράφει όλα τα αντικείμενα από τον πίνακα/λίστα content, με μεγαλύτερο
   * ή ίσο βάρος σύμφωνα με κάποιο βάρος που θα δοθεί παραμετρικά. Επιστρέφει
   * true αν έγινε οποιαδήποτε διαγραφή ή false αν δεν έγινε
   */
  public boolean removeAllMoreThanByWeight(double weightOfBall) {
    
    boolean isRemoved = false;
    if (content.size() > 0) {
      Iterator<Ball> itr = content.iterator();
      while (itr.hasNext()) {
        Ball b = itr.next();
        if (b.getWeight() >= weightOfBall) {
          itr.remove();
          isRemoved = true;
        }
      }

    }
    return isRemoved;
  }

  /*
   * διαγράφει όλα τα αντικείμενα από τον πίνακα/λίστα content, με μικρότερο ή
   * ίσο βάρος σύμφωνα με κάποιο βάρος που θα δοθεί παραμετρικά. Επιστρέφει true
   * αν έγινε οποιαδήποτε διαγραφή ή false αν δεν έγινε
   */
  public boolean removeAllLessThanByWeight(double weightOfBall) {
    boolean isRemoved = false;
    
    if (content.size() > 0) {
      Iterator<Ball> itr = content.iterator();
      while (itr.hasNext()) {
        Ball b = itr.next();
        if (b.getWeight() <= weightOfBall) {
          itr.remove();
          isRemoved = true;
        }
      }

    }

    return isRemoved;

  }

  /*
   * – διαγράφει όλα τα αντικείμενα από τον πίνακα/λίστα content, με υλικό
   * σύμφωνα με κάποιο υλικό που θα δοθεί παραμετρικά. Επιστρέφει true αν
   * έγινε οποιαδήποτε διαγραφή ή false αν δεν έγινε
   */
  public boolean removeAllByMaterial(String materialOfBall) {
    boolean isRemoved = false;
    
    if (content.size() > 0) {
      /*Iterator<Ball> itr = content.iterator();
      while (itr.hasNext()) {
        Ball b = itr.next();
        if (b.getMaterial().equals(materialOfBall)) {
          itr.remove();
          isRemoved = true;
        }
      }*/
      for(Ball b : content) {
        if (b.getMaterial().equals(materialOfBall)) {
          content.remove(b);
        }
      }

    }

    return isRemoved;

  }

  /*
   * αλλάζει το χρώμα σε ένα αντικείμενο από τον πίνακα/λίστα content, μιας
   * θέσης του πίνακα που θα δοθεί παραμετρικά και ενός χρώματος που θα δοθεί
   * παραμετρικά
   */
  public void changeColorByPosition(int num, String color) {
    for (Ball b : content) {
      if (content.indexOf(b) == num) {
        b.setColor(color);
      }
    }
  }

  /*
   * αλλάζει το παλιό χρώμα που θα δοθεί ενός αντικειμένου σε ένα νέο χρώμα που
   * θα δοθεί. Επιστρέφει true αν έγινε οποιαδήποτε αλλαγή ή false αν δεν έγινε
   */
  public boolean changeColorByColor(String colorOld, String colorNew) {
    boolean isChanged = false;
    for (Ball b : content) {
      if (b.getColor().equals(colorOld)) {
        b.setColor(colorNew);
        isChanged = true;
      }
    }
    return isChanged;
  }

  /*
   * Εκτυπώνει στην οθόνη όλες τις τιμές για τα χαρακτηριστικά του
   * αντικειμένου
   */
  public void printAll() {
    System.out.println("\nΤο " + getMaterial() + " κουτί έχει διαστάσεις: "
        + getLenght() + " x " + getWidth() + " x " + getHeight()
        + "\nΒάρος: " + getWeight() + " και περιέχει:");
    for (Ball b : content) {
      System.out.println((content.indexOf(b) + 1) + " -> " + b.getColor()
          + " " + b.getMaterial() + " μπάλα με βάρος "
          + b.getWeight());
    }

  }

}
