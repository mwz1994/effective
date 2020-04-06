package effective.chapterone.sweetshop;

class Candy {
    static int cellphone  = 691127;
    static { System.out.println("Loading Candy"); }

    /*public static int getCellphone() {
        return cellphone;
    }

    public static void setCellphone(int cellphone) {
        Gum.cellphone = cellphone;
    }*/

    public static int getCellphone() {
        return cellphone;
    }

    public static void setCellphone(int cellphone) {
        Candy.cellphone = cellphone;
    }
}