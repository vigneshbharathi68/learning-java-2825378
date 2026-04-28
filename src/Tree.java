import java.awt.*;

public class Tree {
  // double heightFt;
  // double trunkDiameterInches;
  // TreeType treeType;
  // static Color TRUNK_COLOR = new Color(139, 69, 19);

  private double heightFt;
  private double trunkDiameterInches;
  private TreeType treeType;
  private static Color TRUNK_COLOR = new Color(139, 69, 19);

  public Tree (double heightFt, double trunkDiameterInches, TreeType treeType) {
    this.heightFt = heightFt;
    this.trunkDiameterInches = trunkDiameterInches;
    this.treeType = treeType;
  }

  void grow() {
    this.heightFt += 10.0;
    this.trunkDiameterInches += 1.0;
  }

  void announceTallTree() {
    if (this.heightFt > 100) {
      System.out.println("This " + this.treeType + " tree is tall!");
    } else {
      System.out.println("This " + this.treeType + " tree is not tall.");
    }
  }

  public double getHeightFt() {
    return heightFt;
  }

  public void setHeightFt(double heightFt) {
    this.heightFt = heightFt;
  }

  public double getTrunkDiameterInches() {
    return trunkDiameterInches;
  }

  public void setTrunkDiameterInches(double trunkDiameterInches) {
    this.trunkDiameterInches = trunkDiameterInches;
  }

  public TreeType getTreeType() {
    return treeType;
  }

  public void setTreeType(TreeType treeType) {
    this.treeType = treeType;
  }

  public static Color getTRUNK_COLOR() {
    return TRUNK_COLOR;
  }

  public static void setTRUNK_COLOR(Color tRUNK_COLOR) {
    TRUNK_COLOR = tRUNK_COLOR;
  }
}