public class Ball {
  private String color;
  private String material;
  private double weight;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // κενός κατασκευαστής
  public Ball() {
  }

  // πλήρης κατασκευαστής
  public Ball(String color, String material, double weight) {
    this.color = color;
    this.material = material;
    this.weight = weight;
  }

  /*
   * αλλάζει το χρώμα ενός
   * αντικειμένου σε ένα άλλο που θα δοθεί, αν το βάρος του είναι μεγαλύτερο ή
   * ίσο από ένα νούμερο που θα δοθεί. Επιστρέφει true αν έγινε οποιαδήποτε
   * αλλαγή ή false αν δεν έγινε
   */
  public boolean changeColorByMoreThanWeight(String color, double weight) {
    boolean isChange = false;
    if (this.weight >= weight) {
      this.color = color;
      isChange = true;
    }
    return isChange;

  }

  /*
   * Εκτυπώνει στην οθόνη όλες τις τιμές για τα χαρακτηριστικά του
   * αντικειμένου
   */
  void printAll() {
    System.out.println("μπάλα " +
        color + " " + material + " με βάρος " + weight);
  }

}
