package JavaHW;

public class Draw {
    public static void main(String[] args) {
        int h = 4, w = 10, s =4;
        drawShapeOutline(h, w);
        drawShapeCorners(s);
    }

    public static void drawShapeOutline(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || j == 0 || i == h - 1 || j == w - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawShapeCorners(int s) {
        for (int i = 0; i < s; i++) {
            if (i == 0 || i == s - 1)
                for (int j = 0; j < s; j++) {
                    if (j == 0 || j == s - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("  ");
                    }
                }
            System.out.println();
        }
    }
}
