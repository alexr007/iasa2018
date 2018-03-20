package iasa.lesson2.n6;

final class ShapeBadDesignDontUse {
  private final int x;
  private final int y;
  private final int z;

  public ShapeBadDesignDontUse(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  String serialize() {
    return "<shape x=\""+x+"\" y=\""+y+"\" z=\""+z+"\"></shape>";
  }

}
