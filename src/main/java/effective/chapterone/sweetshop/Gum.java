package effective.chapterone.sweetshop;



class Gum {
    int cellphone  = 691127;
    static { System.out.println("Loading Gum"); }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }
}

